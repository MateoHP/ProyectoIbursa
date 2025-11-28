package Interface;
//Es una plantilla para declarar los metodos vacíos (abstractos)

import java.util.List;

import Model.Empleados;

public interface Metodos {
	//Metodos
	//1---Procedimientos --- no tienen valor de retorno
	// sintaxis: modificadordAcceso void(vacio) nombreProced(parametros o argumentos)
	
	
	//2--Funciones---- siempre tienen valor de retorno
	// sintaxis: modificadordAcceso tipoRetorno nombreProced(parametros o argumentos)
	//Estar atento al tipo de retorno que tendrá y su va a lllevar parámetros, si lleva cuantos y de que tipo
	
	public void guardar(Empleados empleado);
	public List<Empleados> mostrar();
	public Empleados buscar(int indice);
	public void editar(int indice, Empleados empleado);
	public void eliminar(int indice);
}
