create table item (
    id integer not null,
    name varchar(255),
    primary key (id)
);

create sequence hibernate_sequence start with 100 increment by 1;

insert into Item (id, name) values (1, 'A');
insert into Item (id, name) values (2, 'B');
insert into Item (id, name) values (3, 'C');