create database smartcampus;

create table local(
    ID_local SERIAL PRIMARY KEY,
    nome_local VARCHAR(100) NOT NULL,
    setor VARCHAR(100) NOT NULL
);

create table responsavel(
    ID_responsavel SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

create table sensor(
    ID_sensor SERIAL PRIMARY KEY,
    ID_responsavel INTEGER,
    ID_local INTEGER,
    estado INTEGER NOT NULL,

    FOREIGN KEY(ID_local) REFERENCES local(ID_sensor),
    FOREIGN KEY(ID_responsavel) REFERENCES responsavel(ID_sensor)
);

create table leitura(
    ID_leitura SERIAL PRIMARY KEY,
    ID_sensor INTEGER,
    temperatura DECIMAL(10,2) NOT NULL,
    umidade DECIMAL(10,2) NOT NULL,
    luminosidade DECIMAL(10,2) NOT NULL,
    data_horario TIMESTAMP DEFAULT NOW(),

    FOREIGN KEY(ID_sensor) REFERENCES sensor(ID_leitura)
);

insert into local (nome_local, setor)
VALUES  ('Lab IOT, Bloco A', 'Espaço para experimentos'),
        ('Lab Redes, Bloco A', 'Computadores e industriais'),
        ('Sala 01, Bloco B', 'Sala de aula geral'),
        ('Sala 02, Bloco B', 'Sala de aula geral'),
        ('Biblioteca, Bloco C', 'Espaço para leitura');

insert into responsavel(nome)
VALUES  ('André'),
        ('Cainã'),
        ('Glauco'),
        ('Gabriel'),
        ('Bianca');

SELECT * FROM local;

insert into sensor (nome_sensor, modelo_ id_responsavel,id_local, estado)
VALUES  ('Sensor capacitivo', 'XT132B1FAL2', 1, (SELECT id_local from local where nome_local = 'Lab IOT'),
        ('Sensor capacitivo', 'XT132B1FAL2', 1, SELECT id_responsavel from responsavel where nome = 'André'));


ALTER TABLE sensor
ADD modelo VARCHAR(100) NOT NULL;

delete from sensor where id_local is null;

alter table sensor alter column id_local set not null;

UPDATE TABLE responsavel SET nome = 'Nome_novo' where nome = 'André';

DELETE FROM responsavel where nome = 'André' CASCADE;

select ID_sensor, count(*) as quantidade from leitura group by ID_sensor;

select id_sensor, nome_sensor, count(*) as quantidade,
AVERAGE (valor) as valor_medio
from leitura INNER JOIN sensor ON leitura.id_sensor = sensor.id_sensor 
INNER JOIN local ON sensor.id_local - local.id_local
WHERE nome like '%temperatura%' group by local.nome

select leitura.id_sensor, nome_sensor, count(*) as quantidade,
ROUND (AVG(valor),1) as valor_medio
from leitura INNER JOIN sensor ON leitura.id_sensor = sensor.id_sensor 
INNER JOIN local ON sensor.id_local = local.id_local
--WHERE nome like '%temperatura%' 
group by leitura.id_sensor, sensor.nome_sensor

select * 
	FROM leitura INNER JOIN sensor 
	ON leitura.cod_sensor = sensor.cod_sensor
