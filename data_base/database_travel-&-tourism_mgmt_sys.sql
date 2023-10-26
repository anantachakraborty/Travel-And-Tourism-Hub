create database travelmanagementsystem;

show databases;

use travelmanagementsystem;

create table account(username varchar(25), name varchar(25), password varchar(25), security varchar(100), answer varchar(50));
show tables;

select * from account;

create table customer(username varchar(25), id varchar(35), number varchar(35), name varchar(25), gender varchar(10), country varchar(30), address varchar(100), phone varchar(15), email varchar(50) );

select * from customer;

create table bookpackage(username varchar(25), package varchar(30), person varchar(20),id varchar(35),number varchar(35),phone varchar(15),price varchar(25));

select * from bookpackage;

create table hotel(name varchar(35), costperperson varchar(25), acroom varchar(25), foodincluded varchar(25));

INSERT INTO hotel VALUES('JW Marriott Hotel', 3500, 1700, 1799);
INSERT INTO hotel VALUES('Taj Mahal Palace Hotel', 8400, 11700, 10700);
INSERT INTO hotel VALUES('The Oberoi Amarvilas Hotel', 3900, 1000, 1100);
INSERT INTO hotel VALUES('Umaid Bhawan Palace Hotel', 3600, 1800, 1200);
INSERT INTO hotel VALUES('The Leela Palace Hotel', 4400, 2700, 700);
INSERT INTO hotel VALUES('The Lalit Grand Palace Hotel', 3499, 1700, 1000);
INSERT INTO hotel VALUES('Wildflower Hall Hotel', 3555, 700, 1900);
INSERT INTO hotel VALUES('Taj Falaknuma Palace Hotel', 6400, 2700, 2700);
INSERT INTO hotel VALUES('Oberoi Rajvilas Hotel', 6400, 2700, 3700);
INSERT INTO hotel VALUES('The Serai Hotel', 1400, 1700,1999);

select * from hotel;

create table bookhotel(username varchar(35), name varchar(35), persons varchar(30), days varchar(30), ac varchar(30), food varchar(30), id varchar(40), number varchar(40), phone varchar(15), price varchar(30) );

select * from bookhotel;
