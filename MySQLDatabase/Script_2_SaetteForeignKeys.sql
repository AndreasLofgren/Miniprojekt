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
	add column registreringsnummer	char(8),
	add foreign key (registreringsnummer) references biler (registreringsnummer);

alter table reservation
 	add column ejReserveret 		tinyint,
	add foreign key (ejReserveret) references ledigebiler (ejReserveret);

-- punkt 5. Vi har ingen n:m forbindelser, derfor springer vi dette punkt over.
-- punkt 6. vi har ingen flerværdi attributter, 
-- punkt 7. der findes ingen forbindelser hvor der indgår mere end to entiteter. 