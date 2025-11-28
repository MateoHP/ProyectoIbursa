package Interface;

import Model.Empleados;

public interface Metodos2 {
	
	public Empleados buscarNumEmpleado (int numEmpleado);
	public void editarSueldo(Empleados empleado);
	public void eliminarNumEmpleado(int numEmpleado);
	
}
