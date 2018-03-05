package MavenCallCenter;

import org.junit.Assert;
import org.junit.Test;
import model.CallCenter;

public class AppTest 
{
	@Test
    public void Procesar10LlamadasAlMismoTiempo()    {
		System.out.println("----------------TEST PRINCIPAL----------------"); 	
    	CallCenter callCenter = App.crear10EmpleadosClientes();
 		
 		try {
 			System.out.println("CallCenter empezó ejecución"); 	
 			Assert.assertTrue(App.EjecutarCallCenter(callCenter));
		} catch (InterruptedException e) {
			System.err.println("Error - "+e.getMessage());
		}
    }
	
	@Test
    public void EntraLlamadaYNoHayEmpleadoDisponible()    {

		System.out.println("----------------TEST EntraLlamadaYNoHayEmpleadoDisponible----------------"); 	
    	CallCenter callCenter = App.crear4Empleados10Clientes();
 		
 		try {
 			System.out.println("CallCenter empezó ejecución"); 			
 			Assert.assertTrue(App.EjecutarCallCenter(callCenter));
		} catch (InterruptedException e) {
			System.err.println("Error - "+e.getMessage());
		}
    }
	
	@Test
    public void EntranMasDe10LlamadasConcurrentes()    {

		System.out.println("----------------TEST EntranMasDe10LlamadasConcurrentes----------------"); 	
    	CallCenter callCenter = App.crear10Empleados30Clientes();
 		
 		try {
 			System.out.println("CallCenter empezó ejecución"); 			
 			Assert.assertTrue(App.EjecutarCallCenter(callCenter));
		} catch (InterruptedException e) {
			System.err.println("Error - "+e.getMessage());
		}
    }
}
