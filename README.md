## 概述
基于SSM搭建的Java后台模板，可以直接下载使用。日志框架用的是logback，集成了FreeMarker，如果不想使用FreeMarker，可以在spring-web.xml中注释掉关于FreeMarker的配置。

## 项目结构介绍
**后台部分**

后台目前分了3个package，common、core以及book。

其中，common中主要放一些全局会使用到的类，例如我会将工具类、默认的Controller、entity、dao放在里面；core中主要是放集成的工具，例如我这里放了对FreeMarkerView的扩展，可以将mybatis的相关类，或者以后集成更多的例如redis、shiro等相关的类放在其中；book是我写的一个测试模块，主要是写了查询书籍的测试代码，每一个模块主要写每一个模块对应的controller以及service，即控制层和业务层代码。

这样分类的好处是，在项目分完模块后，可以形成common+core+模块1+模块2+模块3，这样利于分工，整体结构也很清晰。

**前台部分**

前台所有静态资源放在static目录下，包括css、js、img等，所有页面资源放在views目录下。

其中，配置了`<mvc:resources location="/static/" mapping="/static/**"/>`过滤了所有静态文件，并且指定了FreeMarker的templateLoaderPath为views目录`<property name="templateLoaderPath" value="/views/"/>`。

## 总结
完成了Spring+SpringMVC+Mybatis的集成，一般的java后台工程都可以下载后直接开始编写代码。

当然项目结构可以按照自己喜爱的方式重新构建，构建完后要修改对应spring的注解扫描配置，如`<context:component-scan base-package="cn.edu.whu.*.service"/>`。