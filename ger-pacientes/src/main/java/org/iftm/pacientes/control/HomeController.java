package org.iftm.pacientes.control;

import java.util.List;
import java.util.Optional;

import org.iftm.pacientes.model.Paciente;
import org.iftm.pacientes.model.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


public class HomeController{
	@Autowired
	private PacienteRepository pacRepository;

	@GetMapping("/home")
	public String home(Model model) {
		
		List<Paciente> pacientes;
		pacientes = pacRepository.findAll();
		model.addAttribute("pacientes", pacientes);
		return "home";
	}
	
	@GetMapping("delete/{id}")
    public String delete(@PathVariable int id) {  
    	Optional<Paciente> paciente = pacRepository.findById(id);
    	if (paciente.isPresent()) {
            		pacRepository.delete(paciente.get());
    	}        
        return "redirect:/home";
    }
	
	@PostMapping("/add")
    public String novo(Paciente paciente) {
        pacRepository.save(paciente);
        return "redirect:/home";
    }
	
}