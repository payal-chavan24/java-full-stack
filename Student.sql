Enter password: **********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 17
Server version: 8.0.45 MySQL Community Server - GPL

Copyright (c) 2000, 2026, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> create database Student;
Query OK, 1 row affected (0.01 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| payaldb            |
| performance_schema |
| schooldb           |
| student            |
| sys                |
+--------------------+
7 rows in set (0.00 sec)

mysql> use Student;
Database changed
mysql> create table students(studentId int,Age varchar(12),Name varchar(50));
Query OK, 0 rows affected (0.08 sec)

mysql> insert into students(studentId,Age,Name)
    -> values(1,'22 Age','Payal'),(2,'20 Age','neha'),(3,'21 Age','Nihal'),(4,'22 Age','Muskan'),(5,'21 Age','Sarika');
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select *from Students;
+-----------+--------+--------+
| studentId | Age    | Name   |
+-----------+--------+--------+
|         1 | 22 Age | Payal  |
|         2 | 20 Age | neha   |
|         3 | 21 Age | Nihal  |
|         4 | 22 Age | Muskan |
|         5 | 21 Age | Sarika |
+-----------+--------+--------+
5 rows in set (0.00 sec)

mysql> exit;
