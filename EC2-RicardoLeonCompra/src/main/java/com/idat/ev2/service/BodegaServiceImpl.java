package com.idat.ev2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ev2.model.Bodega;
import com.idat.ev2.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService{
	@Autowired
	private BodegaRepository repositorio;
	
	@Override
	public void guardar(Bodega bodega) {
		// TODO Auto-generated method stub
		repositorio.save(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(bodega);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Bodega> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Bodega obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}
}
