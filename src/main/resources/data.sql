/*
create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);
 */

INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1001, 'Edoardo', 'ocascion', sysdate());

INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1002, 'Ciccio', 'lafocascion', sysdate());

INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1003, 'Barbarah', 'Nicodelcuculo', sysdate());

INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1004, 'Bittoldino', 'ubudello', sysdate());

