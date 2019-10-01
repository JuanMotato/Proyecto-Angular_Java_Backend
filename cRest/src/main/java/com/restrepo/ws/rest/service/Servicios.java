package com.restrepo.ws.rest.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restrepo.ws.rest.jpa.JPAUtil;
import com.restrepo.ws.rest.dao.PersonaDao;
import com.restrepo.ws.rest.vo.PersonaVo;


@Path("/PruebaMota")
public class Servicios {
	
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	@POST
	@Path("/registrar")
	@Consumes({MediaType.APPLICATION_JSON})
	public void RegistrarPersona(PersonaVo personaVo){
		
		PersonaDao dao= new PersonaDao();
		dao.registrarPersona(personaVo);
		
		
	}
	
	@DELETE
	@Path("/eliminarPersona/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void eliminarLibros(@PathParam("id") Long id) {
		
	System.out.println("pasa por el servcio");

	PersonaDao dao= new PersonaDao();
	dao.eliminarPersona(id);
	
	}
	
	@PUT
	@Path("/actualizarPersona")
	@Consumes({MediaType.APPLICATION_JSON})
	public void actualizarPersona(PersonaVo personaVo){
		
		PersonaDao dao= new PersonaDao();
		dao.actualizarPersona(personaVo);
	
	}
	
	@GET
	@Path("/consultarPersona/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public PersonaVo consultarPersona(@PathParam("id") Long id){
		
		PersonaDao dao= new PersonaDao();
		
		return dao.buscarPersona(id);
	}
	
	@GET
	@Path("/listaPersonas")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<PersonaVo> listaPersonas(){
		
		PersonaDao dao= new PersonaDao();
		
		return dao.listaPersonas();
	}

	

	
	

	

}
