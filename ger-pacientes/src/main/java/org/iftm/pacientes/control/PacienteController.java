package org.iftm.pacientes.control;

import org.iftm.pacientes.model.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteController {
	@GetMapping("/sobre")
	public String sobre() {return "sobre"; }
	
	  @GetMapping("/form")
	    public String pacientesForm(Paciente paciente) {    	
	        return "addPacienteForm";
	    }
	  
	  
}
