package examen;

import java.util.ArrayList;
import java.util.Collections;

public class Simulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
		Estudiante p1= new Estudiante("ewfdf32334", "Jose", Genero.MASCULINO, "12-09-19970", 78, 3);
		Estudiante p2= new Estudiante("43fedfdf34", "Maria", Genero.FEMENINO, "12-09-19970", 78, 10);
		Estudiante p3= new Estudiante("34rfgdgr33", "Juan", Genero.MASCULINO, "12-09-19970", 69, 4);
		Estudiante p4= new Estudiante("324t56f467", "Katiusca", Genero.FEMENINO, "12-09-19970", 78, 6);
		Estudiante p5= new Estudiante("124fefghh5", "Ivan", Genero.MASCULINO, "12-09-19970", 50, 7);
		listaEstudiante.add(p1);
		listaEstudiante.add(p2);
		listaEstudiante.add(p3);
		listaEstudiante.add(p4);
		listaEstudiante.add(p5);
		System.out.println("El estudiante 1: Su estado es:" );
		p1.aprobarCiclo();
		System.out.println("\n Lista de estudiantes:");
		System.out.println(listaEstudiante);
		System.out.println("\n Lista Ordenada de Estudiante :");
		Collections.sort(listaEstudiante);
		System.out.println(listaEstudiante);
		System.out.println("\n El estudiante  Mayor ");
		System.out.println(Collections.max(listaEstudiante));
		System.out.println("\n El estudiante  Menor ");
		System.out.println(Collections.min(listaEstudiante));
		//***********************************************************************************************
		ArrayList<Administrativo> listaAdministrativo = new ArrayList<Administrativo>();
		Administrativo a1= new Administrativo("24rsdfw234", "Jose Sanchez", Genero.MASCULINO, "21-34-1245", "gerente", 4007);
		Administrativo a2= new Administrativo("23456ftttf", "pilar herrera", Genero.FEMENINO, "21-4-1245", "abogado", 500);
		Administrativo a3= new Administrativo("0923311518", "Rosa Melano", Genero.FEMENINO, "21-3-1223", "iongeniero", 3445);
		Administrativo a4= new Administrativo("245467e569", "Ivan Sanchez", Genero.MASCULINO, "2-6-1235", "licenciado", 2353);
		Administrativo a5= new Administrativo("09ty564333", "juana Silva", Genero.FEMENINO, "23-7-1645", "tenico",2563);
		listaAdministrativo.add(a1);
		listaAdministrativo.add(a2);
		listaAdministrativo.add(a3);
		listaAdministrativo.add(a4);
		listaAdministrativo.add(a5);
		System.out.println("Se le cancelara al docente dos meses: ");
		a1.pagar();
		a1.pagar();
		a1.pagar();
		System.out.println("\n Lista de Administrativo:");
		System.out.println(listaAdministrativo);
		System.out.println("\n Lista Ordenada de Administrativo :");
		Collections.sort(listaAdministrativo);
		System.out.println(listaAdministrativo);
		System.out.println("\n El Administrativo  Mayor ");
		System.out.println(Collections.max(listaAdministrativo));
		System.out.println("\n El Administrativo  Menor ");
		System.out.println(Collections.min(listaAdministrativo));
		//***************************************************************************************
		ArrayList<Profesor> listaProfesor = new ArrayList<Profesor>();
		Profesor pr1 = new Profesor("12jdfhd345", "Pepe  Chalen", Genero.MASCULINO, "12-08-2000", 3000, "Poo", 2);
		Profesor pr2 = new Profesor("253jdgas34", "Julio MyN", Genero.MASCULINO, "12-08-2001", 3000, "fisica", 3);
		Profesor pr3 = new Profesor("6uencfw835", "Victor Cochea", Genero.MASCULINO, "12-08-1999", 3000, "Quimica", 1);
		Profesor pr4 = new Profesor("1sfdgs3tr5", "Andrea Lozano", Genero.FEMENINO, "12-08-2003", 3000, "Matematicas", 2);
		Profesor pr5 = new Profesor("3udgwfz934", "Colcha  ", Genero.MASCULINO, "12-08-1999",3000, "Ciencias", 5);
		listaProfesor.add(pr1);
		listaProfesor.add(pr2);
		listaProfesor.add(pr3);
		listaProfesor.add(pr4);
		listaProfesor.add(pr5);
		System.out.println("\n Pago de Docentes");
		pr1.pagar();
		pr2.pagar();
		pr3.pagar();
		pr4.pagar();
		pr5.pagar();
		System.out.println("\n Lista de Profesor:");
		System.out.println(listaProfesor);
		System.out.println("\n Lista Ordenada de Administrativo :");
		Collections.sort(listaProfesor);
		System.out.println(listaProfesor);
		System.out.println("\n El Administrativo  Mayor ");
		System.out.println(Collections.max(listaProfesor));
		System.out.println("\n El Administrativo  Menor ");
		System.out.println(Collections.min(listaProfesor));
	}
	
}
