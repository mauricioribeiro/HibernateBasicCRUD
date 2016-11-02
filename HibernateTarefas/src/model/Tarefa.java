package model;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tarefas")
public class Tarefa {
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private boolean finalizado;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_finalizado", nullable = true)
	private Calendar dataFinalizacao;
	
	public Long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	  
}