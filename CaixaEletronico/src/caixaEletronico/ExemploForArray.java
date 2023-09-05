package caixaEletronico;

public class ExemploForArray {

	public static void main(String[] args) {
		String alunos [] = {"LUCIANO", "MARCELO", "BRUNO", "THAMYRES"};
		
		for (int x = 0; x < alunos.length; x++) {
			
			
			System.out.println("O aluno no indice x = " + x +" é " + alunos[x]);
		}
		
		//Forma abreviada
		/*for(String aluno : alunos) {
		  System.out.println(alunos);
		}*/
		
		
		
		
		
	}

}
