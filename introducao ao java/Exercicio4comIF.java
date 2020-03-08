class Exercicio4comIF{
	public static void main (String []args){
		int dia = 5;
		int mes = 3;
		int ano = 2020;
		String mesextenso = "";
		
		if (mes == 1){
			mesextenso = "Janeiro";
		} else if (mes == 2){
			mesextenso = "Fevereiro";
		} else if (mes == 3){
			mesextenso = "Marco";
		} else if (mes == 4){
			mesextenso = "Abril";
		} else if (mes == 5){
			mesextenso = "Maio";
		} else if (mes == 6){
			mesextenso = "Junho";
		} else if (mes == 7){
			mesextenso = "Julho";
		} else if (mes == 8){
			mesextenso = "Agosto";
		} else if (mes == 9){
			mesextenso = "Setembro";
		} else if (mes == 10){
			mesextenso = "Outubro";
		} else if (mes == 11){
			mesextenso = "Novembro";
		} else if (mes == 12){
			mesextenso = "Dezembro";
		}
		System.out.printf("%d de %s de %d", dia, mesextenso, ano);
	}
}
