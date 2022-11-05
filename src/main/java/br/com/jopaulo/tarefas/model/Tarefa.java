package br.com.jopaulo.tarefas.model;

import java.time.LocalDate;

public class Tarefa {

	private String descricao;
	private TarefaStatus status;
	private LocalDate dataEntrega;
	private boolean visivil;
	private TarefaCategoria categoria;
	private Usuario usuario;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TarefaStatus getStatus() {
		return status;
	}
	public void setStatus(TarefaStatus status) {
		this.status = status;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public boolean isVisivil() {
		return visivil;
	}
	public void setVisivil(boolean visivil) {
		this.visivil = visivil;
	}
	public TarefaCategoria getCategoria() {
		return categoria;
	}
	public void setCategoria(TarefaCategoria categoria) {
		this.categoria = categoria;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
