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
  
 insert into  Vuelo (numeroVuelo,modeloAvion, capacidad) values
 ('AV10','Boeing 747', 400),
 ('AV20','Airbus A320', 200);
 
insert into tikete (fecha,asiento,costo,idCliente,idVuelo) value
('2020-03-31', 10, 100,1,1),
('2020-03-31', 11, 90,2,1),
('2020-03-31', 12, 120,3,1),
('2020-03-31', 13, 130,4,1),
('2020-03-31', 14, 110,5,1),
('2020-03-31', 15, 90,6,1),
('2020-03-31', 10, 100,7,2),
('2020-03-31', 10, 150,8,2),
('2020-03-31', 10, 120,9,2),
('2020-03-31', 10, 110,10,2),
('2020-03-31', 10, 140,11,2),
('2020-03-31', 10, 150,12,2);

create user 'usuario'@'localhost' identified by '12345';
grant all privileges on * . * to 'root'@'localhost';
flush privileges;