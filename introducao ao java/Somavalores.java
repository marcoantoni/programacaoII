class Somavalores{
	
	public static void main (String args[]){
		// exemplo de laco de repeticao for
		int inicio = 10;
		int fim = 5;
		int soma = 0;
		
		// caso o valor inicial seja maior que o final é necessário trocar o conteúdo das variaveis
		if (inicio > fim){
			int aux = inicio;
			inicio = fim;
			fim = aux;
		}
		
		// primeiro: e a condicao de inicio do laco de repeticao
		// segundo: é a condicao de saida do laco 
		// terceiro: incremento da variavel i apos cada execucao
		for (int i = inicio; i <= fim; i++){
			System.out.printf("i = %d \n", i);
			soma = soma + i;
		}
		System.out.printf("A soma eh %d", soma);
		
	}
}
