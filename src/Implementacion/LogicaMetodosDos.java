package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.MetodosDos;
import Model.Empleados;

public class LogicaMetodosDos implements MetodosDos {
private List<Empleados> lista = new ArrayList<Empleados>();
	
	@Override
	public Empleados buscarNumEmpleado(int numEmpleado) {
	    for (Empleados e : lista) {
	        if (e.getNumEmp() == numEmpleado) {
	            return e; // si lo encuentra, lo regresa inmediatamente
	        }
	    }
	    return null; // si no lo encuentra
	}

	@Override
	public void editarSueldo(Empleados empleado) {
		// TODO Auto-generated method stub
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNumEmp() == empleado.getNumEmp()) {
				lista.set(i, empleado);
				break; 
			}
		}
	}

	@Override
	public void eliminarNumEmpleado(int numEmpleado) {
		// TODO Auto-generated method stub
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNumEmp() == numEmpleado) {
				lista.remove(i);
				System.out.println("Se eliminó");
				break; 
			}else
				System.out.println("No se encontró al empleado");
		}
	}

}
