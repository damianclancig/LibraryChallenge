package com.cda.library.service;

import java.util.List;
import java.util.Optional;

import com.cda.library.model.Libro;

public interface LibroService {

	public Optional<List<Libro>> findByName(String name);

	public Optional<List<Libro>> findByCategory(String category);

	public Optional<List<Libro>> findByAuthor(String author);

	public List<Libro> findAll();
}
