package com.coomeva.sprboot.controllers;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coomeva.sprboot.modelo.Persona;
import com.coomeva.sprboot.service.IPersonaService;
import com.coomeva.sprboot.util.RestResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PersonaController {

	@Autowired
	protected IPersonaService personaService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String personaJson) throws JsonMappingException, JsonProcessingException {
		this.mapper = new ObjectMapper();
		Persona persona = this.mapper.readValue(personaJson, Persona.class);
		
		if(!this.validate(persona)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), 
					"Los campos obligatorios no estan diligenciados");
		}
		this.personaService.save(persona);
		//return null;
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");
	}
	
	@RequestMapping(value = "/getPersonas", method = RequestMethod.GET)
	//public QueryResult getUsers() {
	public List<Persona> getUsers() {
		return this.personaService.findAll();
	}
	
	private boolean validate(Persona persona) {
		boolean isValid = true;
		
		if(StringUtils.trimToNull(persona.getNombre()) == null) {
			isValid = false;
		}
		if(StringUtils.trimToNull(persona.getUsername()) == null) {
			isValid = false;
		}
		if(persona.getIdentificacion() <= 0) {
			isValid = false;
		}
		return isValid;
	}
}
