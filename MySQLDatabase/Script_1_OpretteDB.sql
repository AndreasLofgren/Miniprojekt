drop database if exists biludlejning;
create database biludlejning;
use biludlejning;

SET SQL_SAFE_UPDATES = 0;
set foreign_key_checks = 0;

drop table if exists kunde;
create table kunde
(
cpr						char (10) 			not null,
koerekortnummer 		char(8) 			        ,
fornavn 				varchar(20) 		not null,
efternavn 				varchar(20) 		not null,
telefonnummer 			char(8) 			not null,
primary key 			(cpr)
)engine=innodb;

drop table if exists prisgruppe;
create table prisgruppe
(
prisgruppe 				char(1)          	not null,
primary key 			(prisgruppe)
)engine=innodb;

drop table if exists ledigebiler;
create table ledigebiler
(
ejReserveret 			tinyint						,
registreringsnummer		char(7)				not null,
motorstr 				varchar(15)			not null,
braendstof				char (6)			not null,
kmtaeller 				int 				not null,
primary key				(registreringsnummer)
)engine=innodb;

drop table if exists biler;
create table biler
(
bilmaerke 				varchar(15)     	not null,
model					varchar(15)   	 	not null,
prisgruppe				char(1)				not null,
primary key 			(bilmaerke, model)
)engine=innodb;

drop table if exists kontrakttabel;
create table kontrakttabel
(
kontraktnummer			char(8)				not null,
startdato				date				not null,
slutdato				date				not null,
primary key				(kontraktnummer)
)engine=innodb;

