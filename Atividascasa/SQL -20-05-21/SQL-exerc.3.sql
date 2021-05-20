USE alunos_db;

CREATE TABLE alunos_tb(
id BIGINT(5)AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
sobrenome VARCHAR(200) NOT NULL,
idade FLOAT,
turma VARCHAR (200)NOT NULL, 
professor VARCHAR(200)NOT NULL,
ano FLOAT,
serie VARCHAR(200)NOT NULL,
nota FLOAT,
 PRIMARY KEY (id));
 INSERT INTO alunos_tb(nome, sobrenome, idade, turma ,professor ,ano, serie, nota) 
VALUES
("Maria", "Cecilia",10, "3ªB","Marcia",2021,"3 série",10),
("Lucas", "Vasconcelo",7, "1ªC","Claudia",2021,"1 série",4.5),
("Eduarda", "Silva",8, "2ªD","Suzana",2021,"2 série",10),
("Fernando", "Moraes",10, "3ªC","Felipa",2021,"3 série",8),
("Laura", "Santana",7, "1ªB","José",2021,"1 série",7.5);


SELECT nota FROM alunos_tb 
Where nota  >7.0;

SELECT nota FROM alunos_tb 
Where nota <7.0;
 
 