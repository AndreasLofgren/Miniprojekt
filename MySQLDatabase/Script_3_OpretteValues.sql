use biludlejning;

insert into kunde
values	(1308912000,10000000,'Chris', 'Justesen'),
		(1308922000,10000001,'Chris', 'Justesen');


insert into telefon
values (1308912000, 28976230);

-- insert into kontrakttabel
-- values (28976230,2014-1-13,2014-2-13,1308912000); 


Select * from kunde;

select * from kunde , telefon
where kunde.cpr = '' or koerekortnummer = '' or fornavn = '' or efternavn = '' or telefon.tlf = '28976230';

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



insert into ledigebiler
values (0,'BG51357',1.4, 'Diesel', '30000','Citoren', 'C1 2012');





-- drop table if exists biler;
-- create table biler
-- (
-- bilmaerke 				varchar(15),
-- model					varchar(15),
-- prisgruppe				char(1)			not null,
-- primary key 			(bilmaerke, model)
-- )engine=innodb;