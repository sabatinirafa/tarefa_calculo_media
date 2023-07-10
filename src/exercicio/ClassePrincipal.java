package exercicio;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Aluno rafael = new Aluno();

		float nota1 = 7.5f;
		float nota2 = 5f;
		float nota3 = 10f;
		float nota4 = 9.5f;
		
		float media = rafael.calcularMedia(nota1, nota2, nota3, nota4);
		
		rafael.exibirMedia(media);
	}
}
