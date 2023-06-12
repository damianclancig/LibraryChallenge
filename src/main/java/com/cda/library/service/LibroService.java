package com.cda.library.service;

import java.util.List;
import java.util.Optional;

import com.cda.library.model.Libro;

public interface LibroService {

	public List<Libro> findAll();
	
	public Optional<Libro> findById(Integer idLibro);

	public void saveOrUpdate(Libro libro);
}
