package com.codenotfound.primefaces;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import models.Alumno;

@SessionScoped
@ManagedBean
public class AlumnosBean {
	private ArrayList<Alumno> alumnos;
	private Alumno alumno;
	
	
	@PostConstruct
	public void init() {
		alumnos = new ArrayList<>();
		alumno = new Alumno();
		
		alumnos.add(new Alumno("Zacarías", "Samaniego", 27));
		alumnos.add(new Alumno("Juan", "Perez", 58));
		alumnos.add(new Alumno("Ana", "Rosa", 30));
	}


	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
	public void agregarAlumno() {
		boolean valido = !alumno.getNombre().equals("") && !alumno.getApellido().equals("") && alumno.getEdad() != 0; 
		System.out.println("Alumno: " + alumno);
//		if(valido) {
			alumnos.add(alumno);
			System.out.println(alumno);
//		}
		alumno = new Alumno();
	}
	
	
}
