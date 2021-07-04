USE db_farmacia_do_bem;
CREATE TABLE tb_categoria (
id_categoria INT AUTO_INCREMENT,
tipo VARCHAR(30) NOT NULL,
PRIMARY KEY (id_categoria)
);
INSERT INTO tb_categoria (tipo)
VALUES
("Medicamento"),
("Cosmético"),
("Suplemento & Vitamina"),
("Produtos para cabelo"),
("Dermocosméticos");

CREATE TABLE tb_produto(
id_produto INTEGER AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
marca VARCHAR(30),
peso INT,
quantidade INT,
preco FLOAT,
fk_categorias INTEGER,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_categorias)
 REFERENCES tb_categoria (id_categoria)
);
INSERT INTO tb_produto (nome,marca,peso,quantidade,preco, fk_categorias)
VALUES
("Dipirona","EMS",39.9,1550,11.15,1),
("Buscopan","Boehringer",0.13,2000,18.89,1),
("Pharmaton 50+","Sanofi Aventis",92.2,5251,179.99,3),
("Bepantol","Bayer",78,50,227.99,5),
("Avène","Pierre Fabre",39.9,1550,11.15,1),
("Condicionador Maria Natureza","Salon Line",350,10,23.50,4),
("Aciclovir","Cimed",27.4,4852,36.99,1),
("Actine Água Micelar","Darrow",116.9,1550,31.19,2);


SELECT * FROM  tb_produto
WHERE preco > 50;

SELECT * FROM tb_produto WHERE preco  BETWEEN "3" AND "60";

SELECT * FROM tb_produto
WHERE nome LIKE '%b%';

SELECT * 
FROM tb_categoria
INNER JOIN tb_produto
ON tb_categoria.id_categoria = tb_produto.fk_categorias
WHERE tipo IN ("Cosmético");




 

