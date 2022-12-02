package org.iftm.pacientes.control;

import java.util.Optional;

import org.iftm.pacientes.model.Paciente;
import org.iftm.pacientes.model.repository.PacienteRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteController {
	@GetMapping("/sobre")
	public String sobre() {return "sobre"; 
	}
	
	@GetMapping("/form")
	public String pacientesForm(Paciente paciente) {    	
	return "addPacienteForm";
	}
	
	  @GetMapping("form/{id}")
	    public String updateForm(Model model, @PathVariable int id) {
	    	Optional<Paciente> paciente = pacRepository.findById(id);
	    	if (paciente.isPresent()) {
	    		model.addAttribute("paciente", paciente.get());
	    		return "atualizaPacienteForm";
	    	}else {
	    		return "redirect:/home";
	    	}
	    }
	  
	  @PostMapping("update/{id}")
	    public String alterarProduto(Paciente paciente, @PathVariable int id) {
	        pacRepository.save(paciente);
	        return "redirect:/home";
	    }


	  
	  
}
