package controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import model.CallCenter;
import model.Empleado;
import model.Llamada;
import model.Persona;

//Clase que maneja las llamadas
public class Dispatcher {
	private static final int maxNumeroLlamadasConcurrentes = 10;
	private ExecutorService executor;
	private CallCenter callCenter;
	private int numeroLlamada = 1;

	public Dispatcher(CallCenter callCenter) {
		this.callCenter = callCenter;
		//Al inicializar executor se envia el numero maximo permitido (maxNumeroLlamadasConcurrentes=10)
		executor = Executors.newFixedThreadPool(maxNumeroLlamadasConcurrentes);
	}
	
	//Este metodo asigna llamada a empleado disponible
	public void dispatchCall(Persona cliente) {
		Empleado empleadoDisponible = callCenter.getEmpleadoDisponible();
		if (empleadoDisponible != null) {
			//Al ejecutar la llamada se imprime el numeroLlamada el cual aumenta si se asigna de lo contrario no aumenta
			Runnable llamada = new Llamada(numeroLlamada, cliente, empleadoDisponible);
			executor.execute(llamada);			
			numeroLlamada++;
		}

		else {
			//No hay empleados disponibles para tomar la llamada, por tanto se añade a clientes en espera
			callCenter.addClienteEnEspera(cliente);
		}
	}
	
	//The shutdown() method prevents clients to send more work to the executor service
	public void terminarDispatch() throws InterruptedException {
		executor.shutdown();
		executor.awaitTermination(15, TimeUnit.SECONDS);
		System.out.println("Llamadas finalizadas.");
	}

}
