package com.MLG.LojaDeGames.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MLG.LojaDeGames.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	
	public List<Categoria>findAllByDescricaoCategoriaContainingIgnoreCase(String descricaoCategoria);
}
