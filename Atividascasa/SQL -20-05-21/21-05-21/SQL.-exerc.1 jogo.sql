USE db_generation_game_online;

CREATE TABLE tb_classe(
id_classe INT AUTO_INCREMENT,
tipo VARCHAR(20)NOT NULL,
PRIMARY KEY (id_classe)
);
INSERT INTO tb_classe (tipo)
VALUES
("Grama e Veneno"),
("Fogo"),
("Água"),
("Normal"),
("Veneno");

CREATE TABLE tb_personagem(
id_personagem INTEGER AUTO_INCREMENT,
nome VARCHAR(20) NOT NULL,
genero VARCHAR(200),
habilidade VARCHAR(200),
velocidade BIGINT,
fraqueza VARCHAR(200),
ataque BIGINT,
defesa BIGINT,
nivel BIGINT,
fk_classe INTEGER,
PRIMARY KEY (id_personagem),
FOREIGN KEY (fk_classe)
 REFERENCES tb_classe (id_classe)
);
INSERT INTO tb_personagem (nome,genero,habilidade,velocidade,fraqueza,ataque,defesa,nivel, fk_classe)
VALUES
("Bulbasaur","f/m","Crescimento excessivo",3,"Fogo",2000,2999,1,1),
("Charmander","f/m","Chama",4,"Fogo",2200,1000,4,2),
("Squirtle","f/m","Ativa água",3,"Grama",2000,1500,7,3),
("Pidgeotto","f/m","Olho afiador/Pés emaranhados",5,"Elétricos",1540,400,17,4),
("Arbok","f/m","Pele de galpão intimidar",5,"Psíquico",1600,3500,15,5),
("Pikachu","f/m","Estático",6,"Terra",1400,3000,25,1),
("Clefairy","f/m","Charme bonito/Guarda mágica",3,"Aço",300,1548,35,4),
("Meowth","f/m","Coleta/Técnico",6,"Luta",3000,1300,52,4);


SELECT nome,ataque FROM  tb_personagem
WHERE ataque > 2000;
SELECT nome,habilidade,defesa FROM tb_personagem
WHERE defesa BETWEEN 1000 AND 2000;


