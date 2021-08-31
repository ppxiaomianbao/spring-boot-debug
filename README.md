SpringBoot 调试项目 2021-08-31

目录下有 spring-boot-2.2.9.RELEASE.zip 源码包

加压后在项目根路径下执行： mvn clean install -DskipTests -Pfast

然后再pom里的 properties里新增一个 
    <disable.checks>true</disable.checks>

再项目里新建模块，修改父依赖为对应SpringBoot版本，即可再源码里添加注释
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.9.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>

maven 版本3.5以上
jdk  1.8以上