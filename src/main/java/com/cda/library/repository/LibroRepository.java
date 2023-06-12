package com.cda.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cda.library.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
