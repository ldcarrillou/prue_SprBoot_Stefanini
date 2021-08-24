package com.coomeva.sprboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coomeva.sprboot.dao.IPersonaRepository;
import com.coomeva.sprboot.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	protected IPersonaRepository personaRepository;
	@Override
	public Persona save(Persona persona) {
		return this.personaRepository.save(persona);
	}
}
