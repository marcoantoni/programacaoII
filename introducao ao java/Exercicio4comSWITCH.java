class Exercicio4comSWITCH{
	public static void main (String[] args){
		int dia = 5;
		int mes = 14;
		int ano = 2020;
		String mesextenso = "";
		// testa o conteudo da variavel mes
		switch (mes){
			// caso o valor da variavel mes seja 1
			case 1:
				mesextenso = "Janeiro";
				break;
				
			case 2: 
				mesextenso = "Fevereiro";
				break;
			case 3: 
				mesextenso = "Março";
				break;
			// default ocorre quando a condicao nao bater com nenhum teste nos "case" acima
			default:
				mesextenso = "MES INVALIDO";
			
		}
		System.out.printf("%d de %s de %d", dia, mesextenso, ano);
	}
}
