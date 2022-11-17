drop table if exists `almacenes`;
create table `almacenes`(
`id` int not null auto_increment primary key,
`lugar` varchar(100) not null,
`capacidad` varchar(100) not null 
);

drop table if exists `cajas`;
create table `cajas`(
`id` int not null auto_increment primary key,
`contenido` varchar(100) not null ,
`valor` varchar(100) not null ,
`almacen_id` int default null,
CONSTRAINT `almacenes_fk` FOREIGN KEY (`almacen_id`) REFERENCES `almacenes` (`id`)
);

insert into almacenes(lugar,capacidad) values ('madrid',41),('san sebastian',1),('tarragona',422);
insert into cajas(contenido,valor,almacen_id) values ('ratones','alto',1),('teclados','poco',2),('sillas','ninguno',3);