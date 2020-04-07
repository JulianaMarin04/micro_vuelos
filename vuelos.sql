create database dbtaller;
use dbtaller;

create table Tikete(
idTikete int auto_increment primary key not null,
fecha date default '0000-00-00' not null,
asiento int not null,
costo decimal (10,2) not null);

create table Cliente(
idCliente int auto_increment primary key not null,
nombre varchar (50) not null,
cedula int not null,
telefono int not null);

create table Vuelo(
idVuelo int auto_increment primary key not null,
numeroVuelo varchar(50) not null,
modeloAvion varchar(50) not null,
capacidad int not null);

alter table tikete add idCliente int not null;
alter table tikete add idVuelo int not null;

alter table tikete add constraint fk_cltek foreign key (idCliente) references Cliente (idCliente);
alter table tikete add constraint fk_vueltek foreign key (idVuelo) references Vuelo (idVuelo);


insert into Cliente (nombre,cedula,telefono) values
 ('Carlos Perez', 245863, 310800113),
 ('Juan Torres', 215863, 310800112),
 ('Maria ochoa', 455863, 310800114),
 ('Ana Martinez', 415863, 310800115),
 ('Pedro Garcia', 665863, 310800117),
 ('Andres Gutierrez', 305863, 310800118),
 ('Dario Perez', 245877, 310800123),
 ('Camila Torres', 215866, 310800122),
 ('Diego ochoa', 455888, 310800124),
 ('Paola Martinez', 415822, 310800125),
 ('Alejandro Garcia', 665789, 310800127),
 ('Gustavo Gutierrez', 305811, 310800128);
  
 insert into  Vuelo (capacidad, modelo_Avion, numero_vuelo) values
 (400,'Boeing 747','AV10'),
 (200,'Airbus A320','AV10');
 
insert into tikete (fk_cliente,fk_vuelo) value
('1','1'),
('2','1'),
('3','1'),
('4','1'),
('5','1'),
('6','1'),
('7','2'),
('8','2'),
('9','2'),
('10','2'),
('11','2'),
('12','2');

select * from cliente;
select * from vuelo;
select * from tikete;


select 
cliente.nombre as Pasajero, 
cliente.cedula as Cedula,
tikete.fecha as Fecha,
tikete.costo as Costo,
vuelo.numeroVuelo, 
vuelo.modeloAvion as Avion
from tikete 
inner join
cliente on tikete.idCliente = cliente.idCliente
inner join
vuelo on tikete.idVuelo = vuelo.idVuelo;

select 
vuelo.numeroVuelo as Vuelo,
cliente.nombre as Pasajero, 
cliente.cedula as Cedula,
tikete.fecha as Fecha
from tikete 
inner join
cliente on tikete.idCliente = cliente.idCliente
inner join
vuelo on tikete.idVuelo = 2 and vuelo.idVuelo = 2;

select 
vuelo.numeroVuelo as Vuelo,
cliente.nombre as Pasajero, 
cliente.cedula as Cedula,
tikete.fecha as Fecha
from tikete 
inner join
cliente on tikete.idCliente = cliente.idCliente
inner join
vuelo on tikete.idVuelo = 1 and vuelo.idVuelo = 1;