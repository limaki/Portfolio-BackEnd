package com.proyect.Inicio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyect.Inicio.model.Proyectos;

@Service
public interface ProyectosService {
	
	public List<Proyectos> findAll();
	public Proyectos save(Proyectos proyectos);
	public Proyectos findById(Integer id);
	public void delete(Integer id);

}
