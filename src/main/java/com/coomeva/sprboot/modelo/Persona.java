package com.coomeva.sprboot.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
@Access(AccessType.FIELD)
public class Persona extends ParentEntity {

	private static final long serialVersionUID = 1085548142822407049L;
	
	private String nombre;
	private String apellido;
	private String fecha_nacimiento;
	private String username;
	private String password;
	private int identificacion;
	private int codigo_tipo_identificacion;
	private int codigo_estado;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public int getCodigo_tipo_identificacion() {
		return codigo_tipo_identificacion;
	}
	public void setCodigo_tipo_identificacion(int codigo_tipo_identificacion) {
		this.codigo_tipo_identificacion = codigo_tipo_identificacion;
	}
	public int getCodigo_estado() {
		return codigo_estado;
	}
	public void setCodigo_estado(int codigo_estado) {
		this.codigo_estado = codigo_estado;
	}
		
}
