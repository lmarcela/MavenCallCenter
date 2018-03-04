package MavenCallCenter;

import controller.Dispatcher;
import model.CallCenter;
import model.Empleado;
import model.Persona;

public class App 
{
	
	public static CallCenter crear10EmpleadosClientes(){
		System.out.println( "1. Creación de empleados" );    
 		Empleado empleado1 = new Empleado("Operador1",1);
 		Empleado empleado2 = new Empleado("Operador2",1);
 		Empleado empleado3 = new Empleado("Operador3", 1);
 		Empleado empleado4 = new Empleado("Operador4", 1);
 		Empleado empleado5 = new Empleado("Operador5", 1);
 		Empleado empleado6 = new Empleado("Supervisor6", 2);
 		Empleado empleado7 = new Empleado("Supervisor7", 2);
 		Empleado empleado8 = new Empleado("Supervisor8", 2);
 		Empleado empleado9 = new Empleado("Director9", 3);
 		Empleado empleado10 = new Empleado("Director10", 3);
 		
 		System.out.println("2. Creación de clientes");
 		Persona cliente1 = new Persona("Cliente1");
 		Persona cliente2 = new Persona("cliente2");
 		Persona cliente3 = new Persona("cliente3");
 		Persona cliente4 = new Persona("cliente4");
 		Persona cliente5 = new Persona("cliente5");
 		Persona cliente6 = new Persona("cliente6");
 		Persona cliente7 = new Persona("cliente7");
 		Persona cliente8 = new Persona("cliente8");
 		Persona cliente9 = new Persona("cliente9");
 		Persona cliente10 = new Persona("cliente10");

 		System.out.println("Añadiendo empleados y clientes al CallCenter...");
 		CallCenter callCenter = new CallCenter();
 		callCenter.addEmpleadoATurno(empleado1);
 		callCenter.addEmpleadoATurno(empleado2);
 		callCenter.addEmpleadoATurno(empleado3);
 		callCenter.addEmpleadoATurno(empleado4);
 		callCenter.addEmpleadoATurno(empleado5);
 		callCenter.addEmpleadoATurno(empleado6);
 		callCenter.addEmpleadoATurno(empleado7);
 		callCenter.addEmpleadoATurno(empleado8);
 		callCenter.addEmpleadoATurno(empleado9);
 		callCenter.addEmpleadoATurno(empleado10);
 		
 		callCenter.addPersona(cliente1);
 		callCenter.addPersona(cliente2);
 		callCenter.addPersona(cliente3);
 		callCenter.addPersona(cliente4);
 		callCenter.addPersona(cliente5);
 		callCenter.addPersona(cliente6);
 		callCenter.addPersona(cliente7);
 		callCenter.addPersona(cliente8);
 		callCenter.addPersona(cliente9);
 		callCenter.addPersona(cliente10);
 		return callCenter;
	}
    public static void main( String[] args )
    {    	
    	CallCenter callCenter = crear10EmpleadosClientes();
 		
 		try {
 			System.out.println("CallCenter empezó ejecución");
			EjecutarCallCenter(callCenter);
		} catch (InterruptedException e) {
			System.err.println("Error - "+e.getMessage());
		}
     		
    }
    
    public static boolean EjecutarCallCenter(CallCenter callCenter) throws InterruptedException {

    	try {
    		Dispatcher dispatcher= new Dispatcher(callCenter);    	
    		Persona clienteEnEspera = callCenter.getClienteEnEspera();
    		while (clienteEnEspera != null) {
    			//System.out.println("Ingreso llamada de "+clienteEnEspera.getNombre());
    			dispatcher.dispatchCall(clienteEnEspera);
    			clienteEnEspera = callCenter.getClienteEnEspera();
    		}
    		dispatcher.terminarDispatch();
    		return true;
		} catch (Exception e) {
			return false;
		}
    	
	}
}
