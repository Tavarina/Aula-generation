USE db_cidade_das_frutas;
 
 CREATE TABLE  tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
grupo VARCHAR(255),

PRIMARY KEY(id_categoria)
);

INSERT INTO tb_categoria (grupo)
VALUES
("Fruta"),
("Legume"),
("Vegetal"),
("Grão"),
("Tempero");

CREATE TABLE tb_produto(
id_produto INTEGER AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
peso VARCHAR(255),
cor VARCHAR (255),
quantidade BIGINT,
preco BIGINT,
fk_tb_categoria BIGINT,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_tb_categoria)
REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_produto (nome, peso, cor, quantidade, preco, fk_tb_categoria)
VALUES
("Maça","50g", "vermelho",15, 7.00,1),
("Pera","10g","verde",28, 8.50,1),
("Pimenta do reino","25g", "null",85, 6.40,5),
("Couve","33g","verde",5, 5.00,3),
("Aveia","5g","null",22, 2.00,4),
("Cenoura","21g","laranja",95, 1.10,2),
("Abóbora","11g","laranja",84, 56.00,2),
("Melancia","600g","verde",9, 24.99,1);

SELECT * FROM  tb_produto
WHERE preco > 50.00;

SELECT * FROM tb_produto WHERE preco  BETWEEN 3.00  AND 60.00; 

SELECT * FROM tb_produto WHERE nome LIKE "C%%"; 

SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON fk_tb_categoria = id_categoria 
WHERE grupo = "legume";

