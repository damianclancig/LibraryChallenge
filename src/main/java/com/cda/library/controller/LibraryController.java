package com.cda.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cda.library.model.Libro;
import com.cda.library.service.LibroService;

@Controller
public class LibraryController {

	@Autowired
	private LibroService libroService;

	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<Libro> libros = libroService.findAll();

		model.addAttribute("libros", libros);
		return "library/home";
	}

}
