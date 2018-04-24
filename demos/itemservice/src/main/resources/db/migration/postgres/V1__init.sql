create table item (
    id int4 not null,
    name varchar(255),
    primary key (id)
);

create sequence hibernate_sequence start with 100 increment by 1;

insert into item (id, name) values (1, 'A');
insert into item (id, name) values (2, 'B');
insert into item (id, name) values (3, 'C');