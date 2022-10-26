package com.idat.ev2.service;

import java.util.List;

import com.idat.ev2.model.Producto;

public interface ProductoService {
	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);
}
