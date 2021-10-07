package com.lambda.view;

import java.util.*;
import com.lambdas.domain.Alumno;
import java.util.stream.*;


public class Main {

	public static void main(String[] args) {
	
	List<Alumno> alumnos = new ArrayList<Alumno>();
	
	alumnos.add(new Alumno("Pedro", 13, "Java", 7.8));    alumnos.add(new Alumno("Ana", 32, "PHP", 5.8));
	alumnos.add(new Alumno("Sonia", 27, "Java", 6.1));    alumnos.add(new Alumno("Ricardo", 31, "React", 5.9));
	alumnos.add(new Alumno("María", 45, "Angular", 9.8)); alumnos.add(new Alumno("Susana", 38, "Java", 6.7));
	alumnos.add(new Alumno("Juanjo", 21, "C++", 9.9));    alumnos.add(new Alumno("Gema", 49, "PHP", 4.1));
	alumnos.add(new Alumno("Ramón", 26, "Java", 6.3));    alumnos.add(new Alumno("Lucia", 16, "Angular", 9.8));

	
	System.out.println("***FILTRADOS POR NOMBRE Y EDAD***");
	
	List<Object> listaFiltrada1 = alumnos.stream()
			                             .flatMap(c -> Stream.of(c.getNombre(), c.getEdad()))
			                             .collect(Collectors.toList());
	System.out.println(listaFiltrada1);

	
	System.out.println("***FILTRADOS POR PRIMERA LETRA DE NOMBRE (A)***");
	List<Alumno> listaFiltrada2 = alumnos.stream() 
				                         .filter(n -> n.getNombre().charAt(0) == 'a' || n.getNombre().charAt(0) == 'A')
				                         .collect(Collectors.toList());
	System.out.println(listaFiltrada2);
	
	
	System.out.println("***FILTRADOS POR NOTA MAYOR DE 5***");
	alumnos.stream() 
	       .filter(n -> n.getNota() > 5)
	       .forEach(System.out::println);
	
	
	System.out.println("***FILTRADOS POR NOTA MAYOR DE 5 Y CURSO DIFERENTE A PHP***");
	alumnos.stream()
	       .filter(n -> n.getNota() > 5)
	       .filter(n -> !n.getCurso().equalsIgnoreCase("PHP"))
	       .forEach(System.out::println);
	
	
	System.out.println("***FILTRADOS POR MAYORÍA DE EDAD E ITINERARIO JAVA***");
	alumnos.stream()
	       .filter(n -> n.getEdad() > 17)
	       .filter(n -> !n.getCurso().equalsIgnoreCase("Java"))
	       .forEach(System.out::println);
	}

}
