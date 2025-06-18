1. SpringBoot 整合 Shiro

* 框架使用  权限管理三个核心： 用户  角色  资源


### Shiro的核心组件

1. subject

Subject 相当于用户，这个用户可能是普通用户，也可能是其他的客户端，其他语言的请求等等。

2. SecurityManager

这个是Shiro的绝对核心，管理所有的权限和subject

3. Realm

这是用来管理安全数据的组件