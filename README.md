# enterpriseAssetManagement
企业固定资产管理系统  
[![build status](https://gitlab.com/JiangTJ/enterpriseAssetManagement/badges/master/build.svg)](https://gitlab.com/JiangTJ/enterpriseAssetManagement/commits/master)

> 示例：[企业固定资产管理系统](http://www.kurome.xin:8080/)  
超级管理员 用户名:admin 密码:123456  
在用户管理中所有的用户密码与超管一致  
修改密码接口未开发，所以，，暂时不能改密码ヾ(･ω･`｡)


> 计划使用Spring Security框架重写用户模块。
 

### 环境
- JDK环境：jdk 8+
- 数据库：mysql 5.7.14
- 服务器：tomcat
- 系统：window/linux
- 运行环境：支持chrome、edge、foxfire、safari最新版,**不支持ie**

### 框架
- 后台：spring boot : (ssm) spring + spring mvc + mybatis
- 前端：spring thymeleaf + vue.js

### java 运行

1. 下载源码，maven编译获取war包（暂不提供下载）
1. 配置数据库，请仿照`application-dev.properties`，创建相应的配置文件`application.properties`，并与war包放在相同目录或者config/下
1. java 运行 `java -jar asset.war --server.port=8080`,其中`server.port`设置端口号，该配置可写于`application.properties`中

### 注意
- 运行环境需要先搭建好
- 建议用户导入asset-data.sql _（后续会添加安装界面，以便初始化数据）_
- 默认user-id 为 1 的用户拥有最大权限，必要时修改数据库中用户id
- 后台运行方式，linux 使用`nohup`，windows 使用`javaw`代替`java`

### docker 运行

- docker命令行输入以下代码
```
docker  run -p 80:8080 \
   -e 'SPRING_DATASOURCE_URL=jdbc:mysql://192.169.2.2:3306/asset?useUnicode=true&characterEncoding=utf-8&useSSL=false' \
   -e 'SPRING_DATASOURCE_USERNAME=root' \
   -e 'SPRING_DATASOURCE_PASSWORD=pw' \
   kurome/asset-run  
```  
- 在网页端，输入docker虚拟环境ip地址即可  



