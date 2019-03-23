package com.csu.software.controller;

import com.csu.software.controller.vo.BaseResult.BaseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/others")
public class RedirectController {


    @RequestMapping("notLogin")
    public BaseResult notLogin(){
        BaseResult baseResult = new BaseResult();
        baseResult.setMessage("用户未登陆");
        baseResult.setCode(399999999);
        return baseResult;
    }

}
