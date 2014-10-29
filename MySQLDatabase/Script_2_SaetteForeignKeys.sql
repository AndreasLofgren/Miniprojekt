/*
Konverteringsalgoritmen
*/
SET SQL_SAFE_UPDATES = 0;
set foreign_key_checks = 0;

use biludlejning;
-- 3 i konverterings algoritmen
alter table kunde
	add column kontraktnummer 		int,
	add foreign key (kontraktnummer) references kontrakttabel (kontraktnummer);

alter table kontrakttabel
	add column cpr					char(10),
	add column date					datetime,
	add foreign key (date)			references reservation (date),	
	add foreign key (cpr)			references kunde (cpr);

alter table reservation
	add column kontraktnummer		int,
	add foreign key (kontraktnummer) references kontrakttabel (kontraktnummer);

-- punkt 4 i konverterings algoritmen, for hver 1:n tilføjes primærnøglen fra 1-siden som fremmednøgle på n-siden.

alter table biler
	add foreign key (prisgruppe)	references prisgruppe (prisgruppe);

alter table ledigebiler
	add column bilmaerke	varchar(15),
	add column model		varchar(15),
	add foreign key (bilmaerke, model) references biler (bilmaerke, model);

alter table reservation
 	add column registreringsnummer 		char(7),
	add foreign key (registreringsnummer) references ledigebiler (registreringsnummer);

-- punkt 5. Vi har ingen n:m forbindelser, derfor springer vi dette punkt over.
-- punkt 6. vi har ingen flerværdi attributter, 

create table telefon
	(
	cpr	char(10) not null,
	tlf char(8),
	primary key (cpr, tlf),
	foreign key (cpr) references kunde (cpr)
	)engine=innodb;

alter table kunde
drop column telefonnummer;

-- punkt 7. der findes ingen forbindelser hvor der indgår mere end to entiteter. 
