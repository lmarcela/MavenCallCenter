package model;

public class Empleado extends Persona{
	private int tipo;
	private boolean disponible;

	public Empleado(String nombre, int tipo) {
		super(nombre);
		this.tipo = tipo;
		this.disponible = true;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
