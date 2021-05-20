USE rh_db;

CREATE TABLE tb_funcionarios(
id BIGINT(5) AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
sobrenome VARCHAR(200) NOT NULL,
cargo VARCHAR(200) NOT NULL,
salário BOOLEAN,
PRIMARY KEY(id)
);

ALTER TABLE tb_funcionarios
DROP COLUMN salálario;
ALTER TABLE tb_funcionarios
ADD salário VARCHAR(200);

ALTER TABLE tb_funcionarios
ADD meses_trabalhadas BOOLEAN;
ALTER TABLE tb_funcionarios
DROP COLUMN meses_trabalhadas;
ALTER TABLE tb_funcionarios
ADD meses_trabalhados BOOLEAN;

INSERT INTO tb_funcionarios (nome, sobrenome, cargo, salário, meses_trabalhados) 
VALUES 
('Fernanda', 'Oliv', 'Assessoria', 4000.00, 10),
('Luiza', 'Seok', 'Recepção', 2500.00, 15),
('José', 'Antônio', 'Gerente', 3000.00, 30),
('Pietro', 'Gomes', 'Recepção', 3500.00, 100),
('Samira', 'Donato', 'Estágio', 1500.00, 5);


SELECT * FROM tb_funcionarios;

SELECT salário FROM tb_funcionarios 
Where salário  >2000.00;

SELECT salário FROM tb_funcionarios 
Where salário <2000.00;
