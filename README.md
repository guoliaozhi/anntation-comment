# 自定义注解@Comment
使用自定义@Comment注解,为Entity在数据库加入注解

一.@Comment注解环境依赖
  1.SpringBoot 2.0 + JPA + MYSQL
  2.https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 依赖
	<dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.8.1</version>
    </dependency>
  3.在启动类上注解 @EnableIngoAnnotation

二.jar打入仓库maven命令

mvn install:install-file -DgroupId=com.ingo.zhuniu -DartifactId=annotation -Dversion=1.0.0 -Dpackaging=jar -Dfile=annotation-comment-1.0.0.jar

三.可在配置文件中配置来控制注解是否生效
	propoties ---> ygg.annotation.comment.enable=false
    yml  --->  ygg:
				  annotation:
				    comment:
				      enable: false
四.把含有.class文件夹打包的命令
   jar cf annotation-comment-1.0.0.jar com
