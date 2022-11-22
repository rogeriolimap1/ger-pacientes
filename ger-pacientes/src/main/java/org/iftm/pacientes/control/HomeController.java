package org.iftm.pacientes.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Autowired
private PacientesRepository pacRepository;

@GetMapping("/home")
public String home(Model model) {
	List<Paciente> pacientes;
	pacientes = pacRepository.findAll();
	model.addAttribute("pacientes", pacientes);
	return "home";
}
