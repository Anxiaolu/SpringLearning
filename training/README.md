# SpringMVC的学习例子，使用spring，hibernate，mysql

本项目只是一个简单的例子，包含了一个只有两张表的数据库；
一个controller，里面仅有增删改查等操作而已；

感谢作者的辛勤付出！


# 怎样运行
 * 在MySQL中创建数据库spring
 * 在$TOMCAT_HOME/conf/tomcat-users.xml中增加如下的行：

    `<user password="tomcatuser" roles="manager-script,admin" username="tomcat"/>`
 * 执行命令：

    `mvn clean install tomcat7:deploy`
 * 访问http://localhost:8080/training

