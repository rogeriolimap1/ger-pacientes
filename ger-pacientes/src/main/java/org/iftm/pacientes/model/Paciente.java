package org.iftm.pacientes.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private Date dataNascimento;
	private String nomeMae;
	private String nomePai;
	private int cpf;
	private int rg;
	private int foneCelular;
	private int foneFixo;
	private String email;
	private String enderecoRuaNumero;
	private int Numero;
	private String cidade;
	private String estado;
	private int cep;
	private String tipoContratoSessao;
	private int numeroSessoesMes;
	private LocalDateTime dataModificacao = LocalDateTime.now();
	private BigDecimal valorSessao;
	private BigDecimal valorTotal;
	
}
