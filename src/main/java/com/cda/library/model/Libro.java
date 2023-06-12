package com.cda.library.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private Integer idLibro;
	private String nombre;

	@OneToOne
	@JoinColumn(name = "autor_pkey")
	private Autor autor;
	@OneToOne
	@JoinColumn(name = "categoria_pkey")
	private Categoria categoria;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_pkey", nullable = true)
	private Usuario reservadoPor;

	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getReservadoPor() {
		return reservadoPor;
	}

	public void setReservadoPor(Usuario reservadoPor) {
		this.reservadoPor = reservadoPor;
	}
}
