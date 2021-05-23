USE db_construindo_a_nossa_vida;
 
CREATE TABLE  tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
departamento VARCHAR(255),
categoria VARCHAR(255),

PRIMARY KEY(id_categoria)
);

INSERT INTO tb_categoria (departamento, categoria)
VALUES
("Materiais de construção","Pisos"),
("Decoração","Papel de parede"),
("Ferramentas","Ferramenta para construção"),
("Iluminação", "Luminárias"),
("Tintas e acessórios", "Cores");

CREATE TABLE tb_produto(
id_produto INTEGER AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
cor VARCHAR (255),
quantidade BIGINT,
preco BIGINT,
promocao BOOLEAN,
fk_tb_categoria BIGINT,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_tb_categoria)
REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_produto (nome, cor, quantidade, preco, promocao, fk_tb_categoria)
VALUES
("Luminária Led", "branco", 2458, 294.56, TRUE, 4),
("Piso cerâmico", "cinza", 5558, 124.56, FALSE, 1),
("Piso Laminado", "marrom", 258, 24.56, TRUE, 1),
("Papel de parede Tnt", "verde", 4710, 199.90, TRUE, 2),
("Parafusadeira", "vermelho", 40, 567.68, TRUE, 3),
("Tinta", "rosa", 9897, 387.56, FALSE, 5),
("Pincel", "preto", 87, 80.56, TRUE, 5),
("Furadeira","prata", 6852, 877.60, TRUE, 3);

SELECT * FROM  tb_produto
WHERE preco > 50.00;

SELECT * FROM tb_produto WHERE preco  BETWEEN 3.00  AND 60.00; 

SELECT * FROM tb_produto WHERE nome LIKE "%c%"; 

SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON fk_tb_categoria = id_categoria 
WHERE departamento = "Decoração";