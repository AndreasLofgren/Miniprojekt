drop database if exists biludlejning;
create database biludlejning;
use biludlejning;

SET SQL_SAFE_UPDATES = 0;
set foreign_key_checks = 0;

drop table if exists kunder;
create table kunder
(
cpr						char (10) 			not null,
koerekortnummer 		char(8) 			not null,
fornavn 				varchar(20) 		not null,
efternavn 				varchar(20) 		not null,
telefonnummer 			char(8) 			not null
)engine=innodb;

drop table if exists prisgruppe;
create table prisgruppe
(
prisgruppe 				char(1)
)engine=innodb;

drop table if exists ledigebiler;
create table ledigebiler
(
ejReservereret 			tinyint
)engine=innodb;

drop table if exists biler;
create table biler
(
bilmaerke 				varchar(15),
model					varchar(15),
motorstr 				varchar(15),
braendstof				char (6),
kmtaeller 				int 			not null,
prisgruppe				char(1)
)engine=innodb;

drop table if exists reservationer;
create table reservationer
(
date					int
)engine=innodb;

