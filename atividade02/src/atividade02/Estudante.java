package atividade02;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
	
	private int matricula;
	private List<Orientador> listaOrientadores = new ArrayList<>();

	
	
	public Estudante(int matricula, Orientador orientador) {
		this.matricula = matricula;
		this.addOrientador(orientador);
	}

	public void addOrientador(Orientador o) throws LimiteEstudantesException {
		if(o != null && !listaOrientadores.contains(o) && listaOrientadores.size() < 2) {
			listaOrientadores.add(o);
			if(!o.getListaAlunos().contains(this)) {
				o.addEstudante(this);
			}
		} else {
			throw new LimiteOrientadorException("O orientador não foi inserido! Motivos que podem ter causado a exceção\n"
					+ "1-Orientador vazio\n"
					+ "2-Orientador ja vinculado ao aluno\n"
					+ "3-Aluno já atingiu limite máximo de orientadores\n");
		}
	}
	
	public List<Orientador> getListaOrientadores() {
		return listaOrientadores;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estudante [matricula=" + matricula + "]";
	}
	
	
}
