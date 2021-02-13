CREATE SCHEMA IF NOT EXISTS MYSHOP;
use MYSHOP;



create table MYSHOP.users(
user_id int primary key AUTO_INCREMENT,
username varchar(50) unique not null,
password varchar(50) not null,
disabled boolean,
account_expired boolean ,
account_locked boolean ,
credentials_expired boolean
);

create table MYSHOP.role (
role_id integer primary key AUTO_INCREMENT,
role_name varchar(50)
);

create table MYSHOP.user_role (
user_role_id integer primary key AUTO_INCREMENT,
user_id integer references users(user_id),
role_id integer references role(role_id)
);

