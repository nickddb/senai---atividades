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
x
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

alter table vendas alter column preco type varchar(100);

--//////////////////////////////////////////////////////////////////////////////////

create table cliente(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

create table email(
    id SERIAL PRIMARY KEY,
	id_cliente INTEGER NOT NULL,
    email VARCHAR(100) NOT NULL,
	FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

create table categoria(
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL
);
create table produto(
    id SERIAL PRIMARY KEY,
	id_categoria INTEGER NOT NULL,
    descricao VARCHAR(100) NOT NULL,
	FOREIGN KEY(id_categoria) references categoria(id)
);

create table pedido(
    id SERIAL PRIMARY KEY,
    id_cliente INTEGER NOT NULL,
	FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

create table item(
	id_pedido INTEGER,
	id_produto INTEGER,
	quantidade INTEGER,
    PRIMARY KEY (id_pedido, id_produto),
	FOREIGN KEY (id_pedido) REFERENCES pedido(id),
	FOREIGN KEY (id_produto) REFERENCES produto(id)
);

--//////////////////////////////////////////////////////////////////////////////////////


INSERT INTO cliente(nome) VALUES
('João Silva'),
('Maria Souza'),
('Ana Lima'),
('Carlos Pereira'),
('Fernanda Alves'),
('Lucas Rocha'),
('Bruno Costa'),
('Carla Mendes');

INSERT INTO email (id_cliente, email)
SELECT id, 'joao@gmail.com' FROM cliente WHERE nome = 'João Silva';

INSERT INTO email (id_cliente, email)
SELECT id, 'joao@outlook.com' FROM cliente WHERE nome = 'João Silva';

INSERT INTO email (id_cliente, email)
SELECT id, 'maria@gmail.com' FROM cliente WHERE nome = 'Maria Souza';

INSERT INTO email (id_cliente, email)
SELECT id, 'ana@gmail.com' FROM cliente WHERE nome = 'Ana Lima';

INSERT INTO email (id_cliente, email)
SELECT codigo, 'ana@empresa.com' FROM cliente WHERE nome = 'Ana Lima';

INSERT INTO email (id_cliente, email)
SELECT id, 'carlos@gmail.com' FROM cliente WHERE nome = 'Carlos Pereira';

INSERT INTO email (id_cliente, email)
SELECT id, 'fernanda@gmail.com' FROM cliente WHERE nome = 'Fernanda Alves';

INSERT INTO email (id_cliente, email)
SELECT id, 'lucas@gmail.com' FROM cliente WHERE nome = 'Lucas Rocha';

INSERT INTO email (id_cliente, email)
SELECT id, 'bruno@gmail.com' FROM cliente WHERE nome = 'Bruno Costa';

INSERT INTO email (id_cliente, email)
SELECT id, 'carla@gmail.com' FROM cliente WHERE nome = 'Carla Mendes';


INSERT INTO categoria (descricao) VALUES
('Eletrônicos'),
('Periféricos'),
('Móveis');


INSERT INTO produto (id_categoria, descricao, preco)
SELECT id, 'Notebook', 3500 FROM categoria WHERE descricao = 'Eletrônicos';

INSERT INTO produto (id_categoria, descricao, preco)
SELECT id, 'Celular', 2000 FROM categoria WHERE descricao = 'Eletrônicos';

INSERT INTO produto (id_categoria, descricao, preco)
SELECT id, 'Mouse', 50 FROM categoria WHERE descricao = 'Periféricos';

INSERT INTO produto (id_categoria, descricao, preco)
SELECT id, 'Teclado', 120 FROM categoria WHERE descricao = 'Periféricos';

INSERT INTO produto (id_categoria, descricao, preco)
SELECT id, 'Monitor', 1200 FROM categoria WHERE descricao = 'Eletrônicos';

INSERT INTO produto (id_categoria, descricao, preco)
SELECT id, 'Impressora', 800 FROM categoria WHERE descricao = 'Eletrônicos';

INSERT INTO produto (id_categoria, descricao, preco)
SELECT id, 'Cadeira Gamer', 900 FROM categoria WHERE descricao = 'Móveis';

INSERT INTO produto (id_categoria, descricao, preco)
SELECT id, 'Mesa Escritório', 700 FROM categoria WHERE descricao = 'Móveis';


INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'João Silva';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Maria Souza';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'João Silva';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Ana Lima';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Carlos Pereira';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Maria Souza';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'João Silva';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Fernanda Alves';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Lucas Rocha';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Ana Lima';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Bruno Costa';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Carla Mendes';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Carlos Pereira';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'João Silva';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Fernanda Alves';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Lucas Rocha';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Bruno Costa';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Carla Mendes';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'Ana Lima';

INSERT INTO pedido (id_cliente)
SELECT id FROM cliente WHERE nome = 'João Silva';


-- João Silva (Notebook)
INSERT INTO itempedido (id_pedido, id_produto, quantidade)
SELECT p.id, pr.id, 1
FROM pedido p, cliente c, produto pr
WHERE p.id_cliente = c.id
AND c.nome = 'João Silva'
AND pr.descricao = 'Notebook'
LIMIT 1;

-- João Silva (Mouse e Teclado)
INSERT INTO itempedido (id_pedido, id_produto, quantidade)
SELECT p.id, pr.id, 2
FROM pedido p, cliente c, produto pr
WHERE p.id_cliente = c.id
AND c.nome = 'João Silva'
AND pr.descricao = 'Mouse'
LIMIT 1;

INSERT INTO itempedido (id_pedido, id_produto, quantidade)
SELECT p.id, pr.id, 1
FROM pedido p, cliente c, produto pr
WHERE p.id_cliente = c.id
AND c.nome = 'João Silva'
AND pr.descricao = 'Teclado'
LIMIT 1;

-- Maria Souza (Celular)
INSERT INTO itempedido (id_pedido, id_produto, quantidade)
SELECT p.id, pr.id, 1
FROM pedido p, cliente c, produto pr
WHERE p.id_cliente = c.id
AND c.nome = 'Maria Souza'
AND pr.descricao = 'Celular'
LIMIT 1;

-- Ana Lima (Teclado + Mouse)
INSERT INTO itempedido (id_pedido, id_produto, quantidade)
SELECT p.id, pr.id, 1
FROM pedido p, cliente c, produto pr
WHERE p.id_cliente = c.id
AND c.nome = 'Ana Lima'
AND pr.descricao = 'Teclado'
LIMIT 1;

INSERT INTO item (id_pedido, id_produto, quantidade)
SELECT p.id, pr.id, 2
FROM pedido p, cliente c, produto pr
WHERE p.id_cliente = c.id
AND c.nome = 'Ana Lima'
AND pr.descricao = 'Mouse'
LIMIT 1;

--//////////////////////////////////////////////////////////////////////////////////////

Insert into item (id_cliente, id_pedido, quantidade) VALUES
	(select id from cliente where nome = 'Ana Lima'),
	(select id from produto where descricao = 'Cadeira Gamer'
);


select c.id as id_cliente, p.id as id_produto, 1 as quantidade from cliente c, produto p 
where c.nome = 'Ana Lima' AND p.descricao = 'Cadeira Gamer'


--chama todos os campos interligados
select *
from cliente c
inner join pedido p on c.id = p.id_cliente
inner join item ip on p.id = ip.id_pedido
inner join produto pr on pr.id = ip.id_produto
inner join categoria ca on ca.id = pr.id_categoria;

--Soma os preços
select c.nome, ca.descricao, SUM(pr.preco * ip.quantidade) as valor
from cliente c
inner join pedido p on c.id = p.id_cliente
inner join item ip on p.id = ip.id_pedido
inner join produto pr on pr.id = ip.id_produto
inner join categoria ca on ca.id = pr.id_categoria
group by c.nome, ca.descricao
order by c.nome;

--valor total vendido por categoria
select c.descricao, SUM(i.quantidade * p.preco) as total
from categoria c
inner join produto p on c.id = p.id_categoria
inner join item i on p.id = i.id_produto
group by c.descricao
order by c.descricao;

--SELF

SELECT f1.nome AS funcionario,
       f2.nome AS gestor
FROM funcionario f1
INNER JOIN funcionario f2
ON f1.codGestor = f2.codigo

--LEFT
SELECT f.nome AS funcionario, p.nome AS projeto, fp.horas
FROM funcionarios f
LEFT JOIN funcionario_projeto fp ON f.id = fp.funcionario_id
LEFT JOIN projetos p ON fp.projeto_id = p.id

--RIGHT
SELECT f.nome AS funcionario, p.nome AS projeto, fp.horas
FROM funcionarios f
RIGHT JOIN funcionario_projeto fp ON f.id = fp.funcionario_id
RIGHT JOIN projetos p ON fp.projeto_id = p.id

--FULL OUTER
SELECT f.nome AS funcionario, p.nome AS projeto, fp.horas
FROM funcionarios f
FULL OUTER JOIN funcionario_projeto fp ON f.id = fp.funcionario_id
FULL OUTER JOIN projetos p ON fp.projeto_id = p.id

--ANTI
SELECT f.nome AS funcionario, p.nome AS projeto, fp.horas
FROM funcionarios f
LEFT JOIN funcionario_projeto fp ON f.id = fp.funcionario_id
LEFT JOIN projetos p ON fp.projeto_id = p.id
WHERE p.id IS NULL

-- OU 

SELECT * FROM funcionarios WHERE id NOT IN (SELECT funcionario_id FROM funcionario_projeto)

--EXTRAS

EXPLAIN ANALYZE --mostra tempo de execução

--Apresentação multivalorada
STRING_AGG(p.nome, ', ' ORDER BY p.nome) AS projetos

--Evita valores iguais na apresentação
SELECT DISTINCT


-- cria VIEW
CREATE VIEW vw_total_pedidos AS
select ped.id_pedido, cli.nome, 
	   SUM(itens.quantidade * itens.valor_unitario) AS valor_total
FROM pedidos ped
INNER JOIN clientes cli ON ped.id_cliente = cli.id_cliente
INNER JOIN itens_pedido itens ON itens.id_pedido = ped.id_pedido
GROUP BY ped.id_pedido, cli.nome

select * from vw_total_pedidos;

select * from vw_total_pedidos
where valor_total BETWEEN 1000 AND 2000;


CREATE OR REPLACE VIEW vw_total_pedidos AS
select ped.id_pedido, cli.nome, 
	   SUM(itens.quantidade * itens.valor_unitario) AS valor_total
FROM pedidos ped
INNER JOIN clientes cli ON ped.id_cliente = cli.id_cliente
INNER JOIN itens_pedido itens ON itens.id_pedido = ped.id_pedido
GROUP BY ped.id_pedido, cli.nome;



CREATE OR REPLACE FUNCTION fn_Valor_total(
	p_id_pedido NUMERIC
)
RETURNS NUMERIC
LANGUAGE plpgsql
AS
$$
	DECLARE
		valor_total NUMERIC;
	BEGIN
		SELECT SUM(quantidade * valor_unitario) INTO valor_total
		FROM itens_pedido
		WHERE id_pedido = p_id_pedido;

		RETURN valor_total;
	END;
$$;



CREATE OR REPLACE PROCEDURE pr_baixar_estoque(
    p_id_produto INTEGER,
    p_quantidade INTEGER
)
LANGUAGE plpgsql
AS
$$
BEGIN

    UPDATE produtos
    SET estoque = estoque - p_quantidade
    WHERE id_produto = p_id_produto;

END;
$$;

--aumenta de 5 em 5
CALL pr_baixar_estoque(1, -5);
select * from produtos;


CREATE OR REPLACE PROCEDURE pr_baixar_estoque(
    p_id_produto INTEGER,
    p_quantidade INTEGER
)
LANGUAGE plpgsql
AS
$$
BEGIN

    UPDATE produtos
    SET estoque =  (SELECT MAX(0, estoque - p_quantidade))
    WHERE id_produto = p_id_produto;

END;
$$;

CALL pr_baixar_estoque(1, 100);
SELECT * from produtos ORDER BY id_produto;