1. Springboot 整合Mybatis高级

* 使用Mybatis对数据库进行增删改查
* 整合Mybatis的分页插件PageHelper

2. 怎么打包?

* 怎么打jar包，以及怎么运行
* 怎么打war包，以及怎么运行

> 使用pageHelper的好处

* 不用再数据的sql层做控制，使用类似limit m,n 这种语句，不给数据库增加压力
* 配置简单，使用方便

3. Springboot 整合Spring Doc

* 原来的swagger已经不支持Springboot3 springboot doc是基于swagger
* 目的是生成文档
* 怎么使用Spring Doc的配置和注解
* 访问方式：
  * swagger : http://localhost:8080/swagger-ui/index.html
  * json : http://localhost:8080/v3/api-docs
  * yaml : http://localhost:8080/v3/api-docs.yaml

4. Springboot 整合单元测试Junit5

* 普通的测试
* 测试controller
* 解决单元测试中的中文乱码问题

