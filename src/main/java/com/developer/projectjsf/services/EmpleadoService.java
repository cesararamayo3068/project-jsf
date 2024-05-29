/**
 * 
 */
package com.developer.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.developer.projectjsf.entity.Empleado;

/**
 * @author Cesar
 * clase que permite realizar la logica de negocio para empleados.
 */
public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Cesar");
		empleadoIBM.setPrimerApellido("Gomez");
		empleadoIBM.setSegundoApellido("Perez");
		empleadoIBM.setPuesto("Developer Java");
		empleadoIBM.setEstatus(true);
		

		empleadoMicrosoft.setNombre("Diego");
		empleadoMicrosoft.setPrimerApellido("Vazquez");
		empleadoMicrosoft.setSegundoApellido("Roldan");
		empleadoMicrosoft.setPuesto("Developer Frontend");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Yamila");
		empleadoApple.setPrimerApellido("Iglesias");
		empleadoApple.setSegundoApellido("Roldan");
		empleadoApple.setPuesto("Developer Flutter");
		empleadoApple.setEstatus(true);
	
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}

}
