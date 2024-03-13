package atividade02;

public class TestaPrograma {

		public static void main(String[] args) {
			
			Orientador o1 = new Orientador("Dory");
			Orientador o2 = new Orientador("Sirlon");
			Orientador o3 = new Orientador("Rafael");
			
		
			try {
				Estudante a1 = new Estudante(1, o1);
				Estudante a2 = new Estudante(2, o1);
				Estudante a3 = new Estudante(3, o1);
				//Estudante a4 = new Estudante(4, o1); //Orientador atingiu limite máximo de alunos				
				Estudante a5 = new Estudante(5, o2);
				a5.addOrientador(o2);
				a5.addOrientador(o3); //Aluno atingiu limite máximo de orientadores
			} catch (LimiteOrientadorException e) {
				System.out.println("Erro: " + e.getMessage());
			} catch (LimiteEstudantesException e) {
				System.out.println("Erro: " + e.getMessage());
			}		
		}
}
