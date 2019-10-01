package com.restrepo.ws.rest.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class PersonaVo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String telefono;
	@Column
	private String documento;
	@Column
	private String direccion;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
//	
//	private String usuario;
//	private String pass;
//	private boolean validacion;
//	public String getUsuario() {
//		return usuario;
//	}
//	public void setUsuario(String usuario) {
//		this.usuario = usuario;
//	}
//	public String getPass() {
//		return pass;
//	}
//	public void setPass(String pass) {
//		this.pass = pass;
//	}
//	public boolean isValidacion() {
//		return validacion;
//	}
//	public void setValidacion(boolean validacion) {
//		this.validacion = validacion;
//	}
//	
	

}

