1. 为什么要有springboot?
* 传统的spring、spring MVC虽然好用但是配置太复杂了。
* 项目的依赖管理很重要，一个组件对应的版本可能影响别的组件的版本
* 插件问题
* springboot集成了tomcat，不用再额外安装tomcat了

2. 什么是springboot启动器?
启动器：spring-boot-starter-xxxx，
这是一个将对应所有依赖都拉到一起的一个组合，不用再手工导入启动需要的所有依赖了
官方启动器：spring-boot-starter-xxx
第三方的启动器：xxx-spring-boot-starter

3. springboot的特征
* 可以独立创建spring应用程序
* 内嵌web容器，嵌入了Tomcat，jetty, undertow等
* 通过提供自己的启动器简化项目构建

4. 了解springboot中依赖的作用
* 父依赖的作用
父依赖中指定了很多的版本信息，所以引入了父依赖再去引用很多依赖的时候不用指定版本了。
这个版本都是官方指定的版本，也不会出错
* 启动器的作用
启动器就是真实的启动依赖了，里面有tomcat web等等相关的依赖

内置tomcat默认的端口是 8080, 默认的路径是/,但是这个/他会默认访问index.jsp

application.properties

```declarative
# configure tomcat port
server.port=8081

server.servlet.context-path=/index
```