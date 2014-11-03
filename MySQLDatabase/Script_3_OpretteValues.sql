use biludlejning;

insert into kunde
values	(1308912000,10000000,'Chris', 'Justesen'),
		(1308922000,10000001,'Chris', 'Justesen');

Select * from kunde;

select * from kunde, telefon 
where telefon.tlf = '' or kunde.cpr = '' or koerekortnummer = '' or fornavn = 'Chris' or efternavn = '';

insert into biler
values	('Citroen', 'C1 2012', 'A'),
		('Seat', 'Ibiza 1.4 Sport 2007', 'A'),
		('VW', 'Polo 1.6 2012', 'A'),
		('Peugeot', '308 1.6 HDI 2010', 'B'),
		('Ford', 'Fiesta 1.0 turbo 125hk', 'B'),
		('Kia', 'Picanto 2011', 'C'),
		('VW', 'Golf VI 1.4 TSI 160 2008', 'C'),
		('Passat', '1.8t 2008', 'D'),
		('Mazda 6', 'Advance 2,0 2009', 'D'),
		('Dacia', 'Duster 2014', 'E'),
		('BMW', '320 2010', 'E');







-- drop table if exists biler;
-- create table biler
-- (
-- bilmaerke 				varchar(15),
-- model					varchar(15),
-- prisgruppe				char(1)			not null,
-- primary key 			(bilmaerke, model)
-- )engine=innodb;