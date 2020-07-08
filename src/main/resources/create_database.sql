create database employees;

create table employees (
	id int primary key,
	last_name varchar[50] not null,
	first_name varchar[50] not null,
	fathers_name varchar[50],
	date_of_birth date not null,
	position varchar[50] not null,
	date_of_employment date not null,
	login varchar[50] not null,
	password varchar[50] not null
);

create table vacations (
	id serial primary key,
	employee_id int references employees(id),
	start_date date not null,
	end_date date not null
);