package com.example.Revisao.repository;


//De fato é um repositório temporario para o banco de dados

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Revisao.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{    //Pede a indentidade e o tipo da primary Key. O id tem que ser sempre Long 

	
}
