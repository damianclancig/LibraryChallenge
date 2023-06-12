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
	public List<Libro> findAll() {
		return libroRepository.findAll();
	}

	@Override
	public Optional<Libro> findById(Integer idLibro) {
		return libroRepository.findById(idLibro);
	}

	@Override
	public void saveOrUpdate(Libro libro) {
		libroRepository.save(libro);		
	}

}
