import java.util.*;

class Exercicio1{
	
	// isso é um comentário simples
	/* este é um comentário de mais de uma linha
	 * continuação do comentario
	 * essa função é a principal de um programa em Java.
	 * ele deve existir
	 */
	public static void main(String args[]){
		// declaracao das variaveis para armazenar a nota lida e o peso
		float nota1;
		float nota2;
		float nota3;
		
		// declaracao de variaveis do tipo inteiro
		int peso1, peso2, peso3;
		
		// fazendo uma leitura do teclado
		Scanner sc = new Scanner(System.in);
		 
		// dando um print para o usuário informar a nota 1
		System.out.println("Informe a Nota 1");
		
		// lendo a nota 1 do usuário que é um float
		nota1 = sc.nextFloat();
		
		System.out.println("Informe o peso da nota1");
		peso1 = sc.nextInt();
		

		// dados referente a nota 2
		System.out.println("Informe a Nota 2");
		
		nota2 = sc.nextFloat();
		
		System.out.println("Informe o peso da nota2");
		peso2 = sc.nextInt();
		
		// dados referente a nota 3
		System.out.println("Informe a Nota 3");
		
		nota3 = sc.nextFloat();
		
		System.out.println("Informe o peso da nota3");
		peso3 = sc.nextInt();
		
		// calculando a media ponderada das notas
		// importante lembrar que é preciso declarar a variavel antes dela ser usada
		float media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 10;
		
		// jeito 1 de dar um print em uma variavel. O + serve para concatenar o conteudo da variavel ao texto de saida
		System.out.println("A média final do aluno eh " + media);
			
		// jeito 2 de dar um print em uma variavel
		System.out.printf("A média final do aluno eh %f", media);
	}
	
}
