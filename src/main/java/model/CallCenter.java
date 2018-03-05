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
	
	//Metodo usado al añadir empleados al CallCenter
	public void addEmpleadoATurno(Empleado empleado) {
		empleadosEnTurno.get(empleado.getTipo()).add(empleado);
	}

	//Metodo usado al crear cliente
	public void addPersona(Persona cliente) {
		clientesEnEspera.add(cliente);
	}

	//Metodo usado al EjecutarCallCenter (.poll obtiene y remueve la cabeza)
	public Persona getClienteEnEspera() {
		return clientesEnEspera.poll();
	}

	/*Metodo usado cuando no hay empleados disponibles para tomar la llamada,
	 * por tanto se añade a clientes en espera (.offerFirst lo añade a la cabeza)	 */
	public void addClienteEnEspera(Persona cliente) {
		clientesEnEspera.offerFirst(cliente);
	}	

	/*Metodo usado por dispatchCall para asignar empleado a una llamada*/
	public Empleado getEmpleadoDisponible() {
		Empleado empleado = null;
		boolean empleadoDisponible = false;
		/*Prioridad se inicializa en 1 porque: 
		 * El proceso de la atención de una llamada telefónica en primera instancia debe ser atendida por un operador,
		 * si no hay ninguno libre debe ser atendida por un supervisor (prioridad = 2),
		 * y de no haber tampoco supervisores libres debe ser atendida por un director (prioridad=3)
		 */
		int prioridad = 1;
		/*Prioridad < 4 porque la prioridad 3 es el maximo tipo de empleado a recibir la llamada.
		 * El proceso se repite hasta que se encuentra un empleado disponible (empleadoDisponible = true)*/
		while (prioridad < 4 && empleadoDisponible == false) {
			//Se obtienen los empleados de acuerdo a la prioridad (tipo)
			Deque<Empleado> empleadoATomarLlamada = empleadosEnTurno.get(prioridad);
			int tam = empleadoATomarLlamada.size(); 
			/*Al finalizar el while se disminuye tam con el fin que no se repita cuando no haya mas empleados de 
			esa prioridad a analizar*/
			while (tam>0) {
				//.poll obtiene y remueve la cabeza del contenedor Deque
				empleado = empleadoATomarLlamada.poll();
				//.offer Añade al final el elemento que se envia
				empleadoATomarLlamada.offer(empleado);
				if (empleado.isDisponible()) {
					/*Cuando obtiene el empleado que va a atender la llamada se sale de los while y se retorna. 
					 * Ademas se cambia su disponibilidad a false*/
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
