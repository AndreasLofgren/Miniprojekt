use biludlejning;

insert into kunde
values	(1308912000,10000000,'Chris', 'Justesen', 28976230),
		(1308922000,10000001,'Chris', 'Justesen', 28976230);

Select * from kunde;

select * from kunde 
where cpr = '' or koerekortnummer = '28976230' or fornavn = '' or efternavn = '' or kontraktnummer = '' ;