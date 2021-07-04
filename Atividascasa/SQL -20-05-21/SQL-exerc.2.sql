USE ecommerce_db;

CREATE TABLE produtos_tb(
id BIGINT(8)AUTO_INCREMENT,
produto VARCHAR(200) NOT NULL,
cor VARCHAR(200) NOT NULL,
marca VARCHAR(200)NOT NULL,
material VARCHAR (200)NOT NULL, 
garantia VARCHAR(200)NOT NULL,
promocao VARCHAR(200),
quantidade BOOLEAN,
preco BOOLEAN,
 PRIMARY KEY (id));
 
ALTER TABLE produtos_tb
DROP COLUMN preco;
ALTER TABLE produtos_tb
DROP COLUMN quantidade;
ALTER TABLE produtos_tb
ADD quantidade FLOAT; 
ALTER TABLE produtos_tb
ADD preco FLOAT; 


INSERT INTO produtos_tb (produto, cor,marca, material,garantia,promocao, quantidade, preco) 
VALUES
("Câmera", "preto","Canon", "plástico","sim","não",100,950.00),
("Lente", "branco", "Canon", "plástico","não","sim" ,255,500.00),
("Tripé", "prata", "Xiomi", "metal","não", "sim" ,1000,100.00),
("Gimbal", "dourado", "Gimbal", "plástico","sim","sim",158,435.00),
("Drone", "cinza", "Apple", "plástico","sim","não",255,200.00);

SELECT * FROM ecommerce_db;

SELECT preco FROM produtos_tb 
Where preco  >500.00;

SELECT preco FROM produtos_tb 
Where preco <500.00;


