package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos2;
import Model.Empleados;

public class LogicaMetodos2 implements Metodos2 {
	
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

	}

	@Override
	public void eliminarNumEmpleado(int numEmpleado) {
		// TODO Auto-generated method stub

	}

}
