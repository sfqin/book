package com.csu.software.config;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Aspect
@Component
public class LogAspect {


    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);


    @Pointcut("execution(public * com.csu.software.controller.*.*(..))")
    public void pointCut(){

    }


//    @Before("pointCut()")
//    public void doBefore(JoinPoint joinPoint){
//
//        Object[] args = joinPoint.getArgs();
//        String[] parameterNames = ((MethodSignature) joinPoint.getSignature()).getParameterNames();
//
//        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
//        String name = joinPoint.getSignature().getName();
//
//        Map<String, Object> param = new HashMap<>();
//        for (int i=0; i< args.length; i++){
//            param.put(parameterNames[i],args[i]);
//        }
//        logger.info("{}.{}请求参数为：{}",simpleName,name,JSONObject.toJSON(param));
//    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs();
        String[] parameterNames = ((MethodSignature) joinPoint.getSignature()).getParameterNames();

        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        String name = joinPoint.getSignature().getName();

        Map<String, Object> param = new HashMap<>();
        for (int i=0; i< args.length; i++){
            param.put(parameterNames[i],args[i]);
        }
        logger.info("[{}.{}]Request为 ==> {}",simpleName,name,JSONObject.toJSON(param));


        Object result = joinPoint.proceed();

        logger.info("[{}.{}]Response为 ==> {}",simpleName,name,JSONObject.toJSON(result));

        return result;

    }

}
