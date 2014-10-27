drop database if exists biludlejning;
create database biludlejning;
use biludlejning;

SET SQL_SAFE_UPDATES = 0;
set foreign_key_checks = 0;

drop table if exists kunde;
create table kunde
(
cpr						char (10) 			not null,
koerekortnummer 		char(8) 			not null,
fornavn 				varchar(20) 		not null,
efternavn 				varchar(20) 		not null,
telefonnummer 			char(8) 			not null,
primary key 			(cpr)
)engine=innodb;

drop table if exists prisgruppe;
create table prisgruppe
(
prisgruppe 				char(1),
primary key 			(prisgruppe)
)engine=innodb;

drop table if exists ledigebiler;
create table ledigebiler
(
ejReserveret 			tinyint,
primary key				(ejReserveret)
)engine=innodb;

drop table if exists biler;
create table biler
(
bilmaerke 				varchar(15),
model					varchar(15),
motorstr 				varchar(15),
braendstof				char (6),
kmtaeller 				int 			not null,
prisgruppe				char(1)			not null,
registreringsnummer		char(8)			not null,
primary key 			(registreringsnummer)
)engine=innodb;

drop table if exists reservation;
create table reservation
(
date					datetime,
primary key 			(date)
)engine=innodb;

drop table if exists kontrakttabel;
create table kontrakttabel
(
kontraktnummer			int,
primary key				(kontraktnummer)
)engine=innodb;

