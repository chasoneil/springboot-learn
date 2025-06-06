1. 整合Thymeleaf

* html只能展示静态数据，没法动态展示数据
* 动态模板技术有 JSP FreeMarker Thymeleaf等
* springboot不支持 JSP，Thymeleaf是官方推荐的代替JSP的
* 如果项目是一个高并发的大项目，那么还是推荐前后端分离的方式
* 如果项目是一个单体的项目，那么springboot + thymeleaf可以很好的满足需求