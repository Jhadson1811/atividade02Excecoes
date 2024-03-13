package atividade02;

import java.util.ArrayList;
import java.util.List;

public class Orientador {

	private String nome; 
	private List<Estudante> listaEstudantes = new ArrayList<>();
	
	public Orientador(String nome) {
			this.nome = nome;
	}
	
	public void addEstudante(Estudante e) throws LimiteEstudantesException{
		if(e != null && !listaEstudantes.contains(e) && listaEstudantes.size() < 3) {
			listaEstudantes.add(e);
			if(!e.getListaOrientadores().contains(this)) {
				e.addOrientador(this);
			}
		} else {
			throw new LimiteEstudantesException("O aluno não foi inserido! Motivos que podem ter causado a exceção:\n"
					+ "1-Aluno vazio\n"
					+ "2-Aluno já vinculado ao orientador\n"
					+ "3-Orientador já atingiu limite máximo de Alunos\n");
		}
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Estudante> getListaAlunos() {
		return listaEstudantes;
	} 
	
	
}
