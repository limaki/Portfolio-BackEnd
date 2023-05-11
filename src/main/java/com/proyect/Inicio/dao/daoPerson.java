package com.proyect.Inicio.dao;
import org.springframework.data.repository.CrudRepository;

import com.proyect.Inicio.model.Person;


public interface daoPerson extends CrudRepository<Person, Integer>{

}