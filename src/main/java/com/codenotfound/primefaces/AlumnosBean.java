package com.codenotfound.primefaces;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import models.Alumno;

@RequestScoped
@ManagedBean
public class AlumnosBean {
	private ArrayList<Alumno> alumnos;
	
	
	@PostConstruct
	public void init() {
		alumnos = new ArrayList<>();
		
		
		alumnos.add(new Alumno("Zacarías", "Samaniego", 27));
		alumnos.add(new Alumno("Juan", "Perez", 58));
		alumnos.add(new Alumno("Ana", "Rosa", 30));
	}


	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
}
