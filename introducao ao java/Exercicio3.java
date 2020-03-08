/* Construa um algoritmo que, dado o valor de um produto e o valor 
 * fornecido pelo cliente (maior ou igual ao valor do produto), 
 * informe o troco a ser fornecido, especificando a quantidade 
 * de notas de 50, 20, 10, 5, 2 e moedas de 1.
 */
import java.util.*;

class Exercicio3{
	public static void main (String args[]){
		int valor_compra = 0;
		int dinheiro = 0;
		
		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da compra");
		// leitura de um numero inteiro
		valor_compra = sc.nextInt();
		
		System.out.println("Informe o dinheiro entregue");
		dinheiro = sc.nextInt();
		// calcula o troco que o cliente ira receber
		int troco = dinheiro - valor_compra;
		
		// variavel para armazenar a qtd de notas de 100
		int n100 = (int) troco / 100;
		troco = troco % 100;
		
		// if simples em java
		// so exibe a msg se o numero de notas for maior que zero
		if (n100 > 0){
			System.out.printf("Você deve entregar %d notas de 100 \n", n100);
		}
		
		int n50 = (int) troco / 50;
		troco = troco % 50;
		
		if (n50 > 0){
			System.out.printf("Você deve entregar %d notas de 50 \n", n50);
		}
		
		int n20 = (int) troco / 20;
		troco = troco % 20;
		
		if (n20 > 0){
			System.out.printf("Você deve entregar %d notas de 20 \n", n20);
		}
		
		int n10 = (int) troco / 10;
		troco = troco % 10;
		
		if (n10 > 0){
			System.out.printf("Você deve entregar %d notas de 10 \n", n10);
		}
		
		int n5 = (int) troco / 5;
		troco = troco % 5;
		
		if (n5 > 0){
			System.out.printf("Você deve entregar %d notas de 5 \n", n5);
		}
		
		int n2 = (int) troco / 2;
		troco = troco % 2;
		
		if (n2 > 0){
			System.out.printf("Você deve entregar %d notas de 2 \n", n2);
		}
		
		
		int moedas1 = (int) troco / 1;
		troco = troco % 1;
		
		if (moedas1 > 0){
			System.out.printf("Você deve entregar %d moerdas de 1 \n", moedas1);
		}
		
	}
}

