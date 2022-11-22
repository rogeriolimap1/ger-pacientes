package org.iftm.pacientes.model.repository;

import org.iftm.pacientes.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
 
}

