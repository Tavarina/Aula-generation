USE db_pizzaria_legal;

CREATE TABLE  tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
tipo VARCHAR(255),
grupo VARCHAR(255),

PRIMARY KEY(id_categoria)
);
INSERT INTO tb_categoria (tipo, grupo)
VALUES
("Salgada","Vegana"),
("Salgada","Normal"),
("Salgada","Sem gluten"),
("Doce","Vegana"),
("Doce", "Normal");

CREATE TABLE tb_pizza(
id_pizza INTEGER AUTO_INCREMENT,
sabor VARCHAR(255) NOT NULL,
peso VARCHAR(255),
quantidade BIGINT,
promocao BOOLEAN,
preco BIGINT,
fk_tb_categoria BIGINT,
PRIMARY KEY (id_pizza),
FOREIGN KEY (fk_tb_categoria)
REFERENCES tb_categoria (id_categoria)
);
INSERT INTO tb_pizza (sabor, peso, quantidade, promocao, preco, fk_tb_categoria)
VALUES
("Calabresa","500g",15,TRUE, 32.00,2),
("Catupiry","550g",28,FALSE, 56.50,3),
("Espinafre","255g",85,TRUE, 63.40,1),
("Chocolate com morango","353g",5,FALSE, 45.00,5),
("Doce de leite","550g",22,TRUE, 42.00,4),
("Carne seca","225g",95,TRUE, 41.10,1),
("Prestigio","110g",84,TRUE, 16.00,5),
("Mussarela","600g",9,TRUE, 24.99,2);

SELECT * FROM  tb_pizza
WHERE preco > 45.00;

SELECT * FROM tb_pizza WHERE preco  BETWEEN 29.00  AND 60.00; 

SELECT * FROM tb_pizza WHERE sabor LIKE "%C%"; 

SELECT * FROM tb_categoria
INNER JOIN tb_pizza
ON fk_tb_categoria = id_categoria 
WHERE tipo = "Doce";




