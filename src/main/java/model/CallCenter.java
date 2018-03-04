package model;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CallCenter {
	private Map<Integer, Deque<Empleado>> empleadosEnTurno;
	private Deque<Persona> clientesEnEspera;

	public CallCenter() {
		empleadosEnTurno = new HashMap<Integer, Deque<Empleado>>();
		clientesEnEspera = new LinkedList<Persona>();
		//cliente 1=Operador; 2=Supervisor; 3=Director
		empleadosEnTurno.put(1, new LinkedList<Empleado>());
		empleadosEnTurno.put(2, new LinkedList<Empleado>());
		empleadosEnTurno.put(3, new LinkedList<Empleado>());	

	}

	public void addEmpleadoATurno(Empleado empleado) {
		empleadosEnTurno.get(empleado.getTipo()).add(empleado);
	}

	public Map<Integer, Deque<Empleado>> getEmpleadosEnTurno() {
		return empleadosEnTurno;
	}

	public Deque<Persona> getPersonasEnEspera() {
		return clientesEnEspera;
	}

	public void addPersona(Persona cliente) {
		clientesEnEspera.add(cliente);
	}

	public Persona getClienteEnEspera() {
		return clientesEnEspera.poll();
	}

	public void addClienteEnEspera(Persona cliente) {
		clientesEnEspera.offerFirst(cliente);
	}	

	public Empleado getEmpleadoDisponible() {
		Empleado empleado = null;
		boolean empleadoDisponible = false;
		int prioridad = 1;
		while (prioridad < 4 && empleadoDisponible == false) {
			Deque<Empleado> empleadoATomarLlamada = empleadosEnTurno.get(prioridad);
			int tam = empleadoATomarLlamada.size(); 
			while (tam>0) {
				empleado = empleadoATomarLlamada.poll();
				empleadoATomarLlamada.offer(empleado);
				if (empleado.isDisponible()) {
					empleadoDisponible = true;
					empleado.setDisponible(false);
					break;
				} else {
					empleado = null;
				}
				tam--;
			}
			prioridad++;
		}
		return empleado;
	}
}
