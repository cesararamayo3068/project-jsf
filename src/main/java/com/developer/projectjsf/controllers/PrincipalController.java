/**
 * 
 */
package com.developer.projectjsf.controllers;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.developer.projectjsf.entity.Empleado;
import com.developer.projectjsf.services.EmpleadoService;

/**
 * @author Cesar Clase Controller que se encarga de procesar informacion para la
 *         pantalla principal.
 */

@ManagedBean
@ViewScoped
public class PrincipalController {

	private List<Empleado> empleados;

	private EmpleadoService empleadoService = new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}

	public void consultarEmpleados() {
		this.empleados = empleadoService.consultarEmpleados();

	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	

}
