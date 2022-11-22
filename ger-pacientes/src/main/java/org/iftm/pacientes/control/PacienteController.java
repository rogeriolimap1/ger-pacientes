package org.iftm.pacientes.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {
	@GetMapping("/sobre")
	public String sobre() {return "sobre"; }
}
