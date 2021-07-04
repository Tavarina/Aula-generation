package com.example.Pharma.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Pharma.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    public List<Object> findAllByNomeCategoriaContaining(String nomeCategoria); //Tipo um Like no MySQL


    public Optional<Object> findAllByNomeCategoria(String nomeCategoria); //Procura exatemente naquele nome
    
    
}
