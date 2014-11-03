/*
Konverteringsalgoritmen
*/
SET SQL_SAFE_UPDATES = 0;
set foreign_key_checks = 0;

use biludlejning;

-- punkt 1 og 2 er allerede opfyldt.
-- punkt 3 vi har ingen 1:1 ofrbindelser.
-- punkt 4 i konverterings algoritmen, for hver 1:n tilføjes primærnøglen fra 1-siden som fremmednøgle på n-siden.

alter table kontrakttabel
	add column cpr					char(10)			not null,
	add foreign key (cpr)			references kunde (cpr);

alter table biler
	add foreign key (prisgruppe)	references prisgruppe (prisgruppe);

alter table ledigebiler
	add column bilmaerke			varchar(15)			not null,
	add column model				varchar(15)			not null,
	add foreign key (bilmaerke, model) references biler (bilmaerke, model);

alter table kontrakttabel
	add column registreringsnummer	char(7)				not null,
	add foreign key (registreringsnummer) references ledigebiler (registreringsnummer);

-- punkt 5. Vi har ingen n:m forbindelser.
-- punkt 6. Flerværdiattributer bliver splittet op i en ny tabel med primærnøglen og flerværdiattributen som en sammensat primærnøgle.

create table telefon
	(
	cpr						char(10)			not null,
	tlf 					char(8)				not null,
	primary key (cpr, tlf),
	foreign key (cpr) references kunde (cpr)
	)engine=innodb;

alter table kunde
drop column telefonnummer;

-- punkt 7. der findes ingen forbindelser hvor der indgår mere end to entiteter. 
