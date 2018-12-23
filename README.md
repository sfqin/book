# book
spring+springMVC+mybatis+druid搭建的demo

demo项目的说明

三个目录
    java 源代码的目录
    resources 配置文件的目录
    webapp  网页相关目录

java目录 http请求到数据库顺序介绍
    controller 请求控制器包
    service 业务逻辑处理包
    mapper 处理数据库的接口类
    ------
    model 所有的java实体类
    utils 工具类包

resources目录
    applicationContext.xml   spring的配置文件，用这个配置文件生成spring的上下文
    db.properties    数据库的相关配置
    generatorConfig.xml   mybatis逆向工程的配置类
    spring-mvc.xml    springMVC的配置文件，用这个配置文件生成springMVC的上下文(即web相关的上下文)

   mapper目录下是mybatis操作数据库的配置文件，其中定义了大量的sql语句

webapp目录
    views目录为定义了springMVC返回的jsp页面所在的目录，这是在springMVC的配置文件中定义的(spring-mvc.xml)
    index.jsp 定义了一个欢迎页面，和它平级的目录为项目默认找寻资源文件和jsp文件的位置
    WEB-INF目录 为web项目独有的目录，http请求不能直接访问到该目录，而需要通过在代码中来加载此目录文件才能访问，因此可以存放一些隐私安全性邀请高的文件
        web.xml  web项目的根配置文件，所有的配置都是从这里开始的，其中定义了项目的主要上下文
张硕测试
11
