package com.coomeva.sprboot.service;

import java.util.List;

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
	@Override
	public List<Persona> findAll() {
		//return null;
		return this.personaRepository.findAll();
	}
	@Override
	public void deletePersona(int codigo) {
		this.personaRepository.deleteById((long) codigo);
		
	}
}
