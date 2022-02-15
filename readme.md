#MyBatis学习
##建立git仓库

##MySql安装
使用apt直接安装的mysql版本为8.0.28，没有初始密码。使用
```mysql
    alter user root@'localhost' 
    identified with mysql_Native_password 
        by "password";
```
可以设置或者修改密码。

要使用远程登陆，需要在`/etc/mysql/mysql.conf.d/mysqld.conf`文件中注释掉`bind_address=127.0.0.0`或者将ip改为服务器的公网IP地址，
并开放防火墙和云服务器（如果有）的3306端口。此外，还需要为远程用户单独注册登陆用户。


