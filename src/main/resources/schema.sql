DROP DATABASE IF EXISTS mpdb;
CREATE DATABASE mpdb DEFAULT CHARACTER SET utf8mb4;
USE mpdb;

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id    BIGINT(20)  NOT NULL COMMENT '主键ID',
    name  VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age   INT(11)     NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
) COMMENT '用户表';

DELETE
FROM user
WHERE id > 0;

INSERT INTO user (id, name, age, email)
VALUES (1, 'Jone', 18, 'test1@baomidou.com'),
       (2, 'Jack', 20, 'test2@baomidou.com'),
       (3, 'Tom', 28, 'test3@baomidou.com'),
       (4, 'Sandy', 21, 'test4@baomidou.com'),
       (5, 'Billie', 24, 'test5@baomidou.com');


DROP TABLE IF EXISTS login_log;
CREATE TABLE login_log
(
    id         BIGINT(20) NOT NULL COMMENT '主键ID',
    user_id    BIGINT(20) NOT NULL COMMENT '用户ID',
    login_time TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登录时间',
    PRIMARY KEY (id)
) COMMENT '登录日志表';