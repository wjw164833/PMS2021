# springcloud2021

#### 介绍
权限管理系统springcloud版本，本项目为带领大家初步认识springcloud配置和基础
随着代码的发展，会拥向springcloudalibaba
也应跟随时代步伐，不断学习

#### 软件架构
软件架构说明


#### 安装教程

1.  git clone 本项目
2.  安装好相应依赖（点击maven-> maven build）

#注意
##项目启动顺序将会影响你的项目实现！！

#### 使用说明

1.  导入好依赖之后，启动consul注册中心（consul.exe）
#####项目结构
pms-admin为项目的主要内容，主要的实现将会放在这里
pms-common通用类
pms-backup数据备份
pms-cousumer为消费者
pms-monitor为服务监控服务端
pms-core为http常用类
pms-hystrix为Hystrix熔断器接口
pms-pom为所有包可执行依赖，导入将可不必在后面的pom文件引入版本
pms-producer（1,2）为注册者
pms-zuul为网关代理

本次书写项目省略了链路追踪和配置中心，感兴趣的小伙伴可以自行了解

首先点击consul.exe。启动之后可以在浏览器打开“localhost：8500”将会出现注册中心
（使用eureka的同学根据相应配置即可进行相应界面）
回到idea，依次启动
监控中心
服务提供者
服务消费者
服务网关
将会在界面看到注册到界面
#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


