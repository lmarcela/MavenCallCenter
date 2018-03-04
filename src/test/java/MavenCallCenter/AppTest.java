package MavenCallCenter;

import org.junit.Assert;
import org.junit.Test;
import model.CallCenter;

public class AppTest 
{
	@Test
    public void Procesar10LlamadasAlMismoTiempo()    {
    	CallCenter callCenter = App.crear10EmpleadosClientes();
 		
 		try {
 			System.out.println("CallCenter empezó ejecución"); 	
 			boolean res = App.EjecutarCallCenter(callCenter);
 			//Assert.assertTrue(res);
		} catch (InterruptedException e) {
			System.err.println("Error - "+e.getMessage());
		}
    }
	
	/*@Test
    public void EntraLlamadaYNoHayEmpleadoDisponible()    {
    	CallCenter callCenter = App.crear10EmpleadosClientes();
 		
 		try {
 			System.out.println("CallCenter empezó ejecución"); 			
 			Assert.assertTrue(App.EjecutarCallCenter(callCenter));
		} catch (InterruptedException e) {
			System.err.println("Error - "+e.getMessage());
		}
    }*/
}
