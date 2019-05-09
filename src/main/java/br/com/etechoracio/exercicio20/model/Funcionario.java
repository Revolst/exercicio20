package br.com.etechoracio.exercicio20.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.etechoracio.exercicio20.enums.TipoFuncionarioEnum;

@Table (name="TBL_FUNCIONARIO")
@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue
	@Column(name="ID_FUNCIONARIO")
	private Long id;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Column(name="TX_FONE")
	private String fone;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TP_FUNCIONARIO")
	private TipoFuncionarioEnum tipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_CADASTRO")
	private java.util.Date dataCadastro; 

}
