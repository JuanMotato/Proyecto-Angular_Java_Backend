package com.restrepo.ws.rest.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.restrepo.ws.rest.client.JPAUtil;
import com.restrepo.ws.rest.vo.PersonaVo;

public class PersonaDao {

	
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	
	public void registrarPersona(PersonaVo personaVo) {
		
		entity.getTransaction().begin();
		entity.persist(personaVo);
		entity.getTransaction().commit();
		
		
		
	}
	public void actualizarPersona(PersonaVo personaVo) {
		
		entity.getTransaction().begin();
		entity.merge(personaVo);
		entity.getTransaction().commit();
	}
	
	public PersonaVo buscarPersona(Long id ) {

		PersonaVo persona = new PersonaVo();
		persona=entity.find(PersonaVo.class, id);
		return persona;
	}
	
	public void eliminarPersona(Long id){
		
		PersonaVo persona = new PersonaVo();
		persona=entity.find(PersonaVo.class,id);
		System.out.println(persona);
		entity.getTransaction().begin();
		entity.remove(persona);
		entity.getTransaction().commit();

	}
	
	public List<PersonaVo> listaPersonas(){
		
		List<PersonaVo> listaPersonas= new ArrayList<>();
		Query q=entity.createQuery("SELECT per FROM PersonaVo per");
		listaPersonas=q.getResultList();
		
		return listaPersonas;
	}
}
