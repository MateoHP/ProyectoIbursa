package Main;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import Implementacion.LogicaMetodos2;
import Model.Empleados;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sacanner para la lectura
			Scanner lectura =null;
				
				// DEcalaracion de variables
			int numEmpleado, menuPrinc, indice;
			String nombre;
			float sueldo;
				
			Empleados empleado;
				
			LogicaMetodos imp = new LogicaMetodos();
			LogicaMetodos2 imp2 = new LogicaMetodos2();

		do {
			System.out.println("Menu principal");
			System.out.println("1--Alta");
			System.out.println("2---Mostrar");
			System.out.println("3--Buscar");
			System.out.println("4--Editar");
			System.out.println("5--Eliminar");
			System.out.println("6--Buscar por numEmpleado");
			System.out.println("7--Editar el sueldo buscando por numEmpleado");
			System.out.println("8--Eliminar buscando por numEmpleado");
			System.out.println("9--Salir");
			
			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();
			
		switch (menuPrinc) {
		case 1:
			try {
				System.out.println("Ingrese el numEmpleado");
				lectura = new Scanner(System.in);
				numEmpleado = lectura.nextInt();
				
				System.out.println("Ingrese el Nombre");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				System.out.println("Ingrese el sueldo");
				lectura = new Scanner(System.in);
				sueldo = lectura.nextFloat();

				
				//Crear objeto
				empleado = new Empleados(numEmpleado, nombre, sueldo);
				
				//Guardar
				imp.guardar(empleado);
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error al guardar");
			}
			break;
			
		case 2:
			if (imp.mostrar().size() > 0)
				System.out.println(imp.mostrar());
			else
				System.out.println("No hay registros");
			break;
		case 3:
			try {
				System.out.println("Ingrese el indice del registro a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				
				//Buscar 
				empleado = imp.buscar(indice);
				System.out.println("Se encontró " + empleado);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("No existe ese registro");
			}
			break;
		case 4:
			try {
				System.out.println("Ingrese el indice del registro a editar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				
				//Buscar 
				empleado = imp.buscar(indice);
				System.out.println("Se encontró " + empleado);
				
				//Proceso para editar
				System.out.println("Ingresa el nuevo nombre");
				lectura = new Scanner (System.in);
				nombre = lectura.nextLine();
				//Actualizo el objeto
				empleado.setNombre(nombre);
				
				//Actualizar en la lista
				imp.editar(indice, empleado);
				System.out.println("Se editó");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("No existe ese registro");
			}
			break;
		case 5:
			try {
				System.out.println("Ingrese el indice del registro a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				
				//Eliminar 
				imp.eliminar(indice);
				System.out.println("Se eliminó");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ese registro no existe");
			} 
				
			break;
		case 6://Buscar por numEmpleado
			System.out.println("Ingrese el número de empleado a buscar");
			lectura =  new Scanner(System.in);
			numEmpleado = lectura.nextInt();
			
			empleado = imp2.buscarNumEmpleado(numEmpleado);
			System.out.println("Se encontró: " + empleado);
			
			break;
		case 7://Editar el sueldo buscando por numEmpleado
			break;
		case 8://Eliminar buscando por numEmpleado
			break;
		case 9:
			break;
			
		}
	}while(menuPrinc < 9);

	}
}
