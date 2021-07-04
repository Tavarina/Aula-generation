package com.Farmacia.famarciamagica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Farmacia.famarciamagica.models.Produto;

@Repository
	public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto>findAllByDescricaoProdutoContainingIgnoreCase(String descricaoProduto);

	
}
