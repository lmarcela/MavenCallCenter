package model;

import java.time.LocalDateTime;


public class Llamada implements Runnable {
	private int numeroLlamada;
	private Empleado empleado;
	private Persona cliente;

	public Llamada(int numeroLlamada, Persona cliente, Empleado empleado) {
		this.numeroLlamada = numeroLlamada;
		this.cliente = cliente;
		this.empleado = empleado;
	}

	@Override
	public void run() {
		//La duración de la llamada debe ser de entre 5 - 10 segundos
		int duracion = (int) Math.floor(Math.random()*(10-5+1)+5);
		String tipo = "";
		if(empleado.getTipo()==1) {
			tipo+="Operador";
		}
		else if(empleado.getTipo()==2) {
			tipo+="Supervisor";
		}
		else {
			tipo+="Director";
		}
		try {
			System.out.println(Thread.currentThread().getName()+":\t Llamada # "+numeroLlamada+" atendida por "+empleado.getNombre()+" ("+tipo+")"+", Cliente: "+cliente.getNombre()+", Fecha-Hora: "+ LocalDateTime.now()+", Duración: "+duracion+" segundos.");
			Thread.sleep(duracion*1000);//Se multiplica por 1000 para pasar segundos a milisegundos
			System.out.println(Thread.currentThread().getName()+ ":\t Finalizó llamada # "+numeroLlamada+", Fecha-Hora: "+LocalDateTime.now());
			empleado.setDisponible(true);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Empleado getEmpleado() {
		return empleado;
	}
}
