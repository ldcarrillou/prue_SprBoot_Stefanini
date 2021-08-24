package com.coomeva.sprboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coomeva.sprboot.modelo.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
	@SuppressWarnings("unchecked")
	Persona save(Persona persona);
}
