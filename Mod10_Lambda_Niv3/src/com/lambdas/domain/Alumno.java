package com.lambdas.domain;

public class Alumno {

	String nombre;
	int edad;
	String curso;
	double nota;
	
	public Alumno(String nombre, int edad, String curso, double nota) {
		this.nombre  = nombre;
		this.edad    = edad;
		this.curso   = curso;
		this.nota    = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getCurso() {
		return curso;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + ", nota=" + nota + "]";
	}
	
	
	
	
}
