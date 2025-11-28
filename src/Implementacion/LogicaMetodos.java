package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;
import Model.Empleados;

public class LogicaMetodos implements Metodos{
	
	private List<Empleados> lista = new ArrayList<Empleados>();
	
	//Polimorfismo de sobreescritura
	
	//Validad que el numEmpleado y el nombre no se repitan
	@Override
	public void guardar(Empleados empleado) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		for(Empleados e: lista) {
			if (e.getNumEmp() == empleado.getNumEmp()||e.getNombre().equals(empleado.getNombre())) {
				System.out.println("Ese registro ya existe");
				bandera = true;
				break;
			}
		}
		if (!bandera) {
			lista.add(empleado);
			System.out.println("Se guardó");
		}
		
	}

	@Override
	public List<Empleados> mostrar() {
		// TODO Auto-generated method stub
		List<Empleados> listaNueva = lista;
		return listaNueva;
	}

	@Override
	public Empleados buscar(int indice) {
		// TODO Auto-generated method stub
		Empleados empleado = lista.get(indice);
		return empleado;
	}

	@Override
	public void editar(int indice, Empleados empleado) {
		// TODO Auto-generated method stub
		lista.set(indice, empleado);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}
	
}
