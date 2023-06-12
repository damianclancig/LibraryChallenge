package com.cda.library.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cda.library.model.Libro;
import com.cda.library.service.LibroService;

@Controller
@RequestMapping("/")
public class LibraryController {

	@Autowired
	private LibroService libroService;

	@GetMapping("")
	public String home() {
		return "redirect:/home";
	}
	
	@GetMapping("/home")
	public String findAll(Model model) {
		List<Libro> libros = libroService.findAll();

		model.addAttribute("libros", libros);
		return "library/home";
	}

	@PostMapping("/search")
	public String search(@RequestParam String textSearch, Model model) {

		List<Libro> libros = libroService.findAll().stream().filter(l -> l.getNombre().contains(textSearch)
				|| l.getAutor().getNombre().contains(textSearch) 
				|| l.getCategoria().getNombre().contains(textSearch)).collect(Collectors.toList());

		model.addAttribute("libros", libros);
		return "library/home";
	}
	
	@GetMapping("/reserve/{idLibro}")
	public String reserve(@PathVariable Integer idLibro) {
		Optional<Libro> libro = libroService.findById(idLibro);
		libro.get().setReservado(!libro.get().getReservado());
		libroService.saveOrUpdate(libro.get());
		return "redirect:/home";
	}
}
