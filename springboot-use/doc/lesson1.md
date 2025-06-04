1. 为什么要有springboot?

* 传统的spring、spring MVC虽然好用但是配置太复杂了。
* 项目的依赖管理很重要，一个组件对应的版本可能影响别的组件的版本
* 插件问题

2. 什么是springboot启动器?

启动器：spring-boot-starter-xxxx

这是一个将对应所有依赖都拉到一起的一个组合，不用再手工导入启动需要的所有依赖了

3. springboot的特征

* 可以独立创建spring应用程序
* 内嵌web容器，嵌入了Tomcat，jetty, undertow等
* 通过提供自己的启动器简化项目构建
* 