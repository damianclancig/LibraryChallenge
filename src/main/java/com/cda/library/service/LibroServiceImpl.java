package com.cda.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cda.library.model.Libro;
import com.cda.library.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository libroRepository;

	@Override
	public Optional<List<Libro>> findByName(String name) {
		return Optional.of(libroRepository.findAll());
	}

	@Override
	public Optional<List<Libro>> findByCategory(String category) {
		return Optional.of(libroRepository.findAll());
	}

	@Override
	public Optional<List<Libro>> findByAuthor(String author) {
		return Optional.of(libroRepository.findAll());
	}

	@Override
	public List<Libro> findAll() {
		return libroRepository.findAll();
	}

}
