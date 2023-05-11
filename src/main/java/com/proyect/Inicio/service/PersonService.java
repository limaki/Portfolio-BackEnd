package com.proyect.Inicio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyect.Inicio.model.Person;


@Service
public interface PersonService {
	
	public List<Person> findAll();
	public Person save(Person person);
	public Person findById(Integer id);
	public void delete(Integer id);

}
