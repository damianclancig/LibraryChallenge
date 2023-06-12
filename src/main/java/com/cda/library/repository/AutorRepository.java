package com.cda.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cda.library.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
