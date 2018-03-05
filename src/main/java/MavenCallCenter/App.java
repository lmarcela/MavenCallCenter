package MavenCallCenter;

import controller.Dispatcher;
import model.CallCenter;
import model.Empleado;
import model.Persona;

public class App 
{
	
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
    
    public static CallCenter crear4Empleados10Clientes(){
		System.out.println( "1. Creación de empleados" );    
 		Empleado empleado1 = new Empleado("Operador1",1); 
 		Empleado empleado2 = new Empleado("Operador2",1);
 		Empleado empleado3 = new Empleado("Supervisor3", 2);
 		Empleado empleado4 = new Empleado("Director4", 3);
 		
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

    public static CallCenter crear10Empleados30Clientes(){
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
 		Persona cliente11 = new Persona("Cliente11");
 		Persona cliente12 = new Persona("cliente12");
 		Persona cliente13 = new Persona("cliente13");
 		Persona cliente14 = new Persona("cliente14");
 		Persona cliente15 = new Persona("cliente15");
 		Persona cliente16 = new Persona("cliente16");
 		Persona cliente17 = new Persona("cliente17");
 		Persona cliente18 = new Persona("cliente18");
 		Persona cliente19 = new Persona("cliente19");
 		Persona cliente20 = new Persona("cliente20");
 		Persona cliente21 = new Persona("Cliente21");
 		Persona cliente22 = new Persona("cliente22");
 		Persona cliente23 = new Persona("cliente23");
 		Persona cliente24 = new Persona("cliente24");
 		Persona cliente25 = new Persona("cliente25");
 		Persona cliente26 = new Persona("cliente26");
 		Persona cliente27 = new Persona("cliente27");
 		Persona cliente28 = new Persona("cliente28");
 		Persona cliente29 = new Persona("cliente29");
 		Persona cliente30 = new Persona("cliente30");

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
 		callCenter.addPersona(cliente11);
 		callCenter.addPersona(cliente12);
 		callCenter.addPersona(cliente13);
 		callCenter.addPersona(cliente14);
 		callCenter.addPersona(cliente15);
 		callCenter.addPersona(cliente16);
 		callCenter.addPersona(cliente17);
 		callCenter.addPersona(cliente18);
 		callCenter.addPersona(cliente19);
 		callCenter.addPersona(cliente20);
 		callCenter.addPersona(cliente21);
 		callCenter.addPersona(cliente22);
 		callCenter.addPersona(cliente23);
 		callCenter.addPersona(cliente24);
 		callCenter.addPersona(cliente25);
 		callCenter.addPersona(cliente26);
 		callCenter.addPersona(cliente27);
 		callCenter.addPersona(cliente28);
 		callCenter.addPersona(cliente29);
 		callCenter.addPersona(cliente30);
 		return callCenter;
	}
}
