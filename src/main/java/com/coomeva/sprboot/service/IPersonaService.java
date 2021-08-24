package com.coomeva.sprboot.service;

import java.util.List;

import com.coomeva.sprboot.modelo.Persona;

public interface IPersonaService {

	/**
	 * Guarda una persona
	 * 
	 * @param persona
	 * @return la persona guardada
	 */
	Persona save(Persona persona);

	/**
	 * Recupera la lista de personas
	 * @return lista de personas
	 */
	List<Persona> findAll();

}
