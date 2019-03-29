package com.codenotfound.primefaces;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import models.Alumno;


@ApplicationScoped
@ManagedBean
public class AlumnosBean2 {
	private ArrayList<String> alumnos;
	
	
	@PostConstruct
	public void init() {
		alumnos = new ArrayList<>();
		alumnos.add("Zacarías");
		alumnos.add("Juan");
		alumnos.add("Ana");
	}


	public ArrayList<String> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(ArrayList<String> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	
}
