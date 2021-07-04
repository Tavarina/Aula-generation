package com.Farmacia.famarciamagica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Farmacia.famarciamagica.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria>findAllByDescricaoCategoriaContainingIgnoreCase(String descricaoCategoria);

}
