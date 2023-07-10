package exercicio;

public class Aluno {
	
	
	public float calcularMedia(float nota1, float nota2, float nota3, float nota4) {
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		return media;
	}
	
	public void exibirMedia(float media) {
		System.out.println(media);
	}

}
