package Model;

public class Empleados {
	private int numEmp;
	private String nombre;
	private float sueldo;
	
	public Empleados(int numEmp, String nombre, float sueldo) {
		this.numEmp = numEmp;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Empleados [numEmp=" + numEmp + ", nombre=" + nombre + ", sueldo=" + sueldo + "]\n";
	}
	public int getNumEmp() {
		return numEmp;
	}
	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
