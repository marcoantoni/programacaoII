class Calculadora{
	int numero1;
	int numero2;
	
	public int somar(int n1, int n2){
		int soma = n1 + n2;
		return soma;
	}
	
	public void mostrarAtributos(){
		System.out.printf("\nO valor do numero1 eh %d", numero1);
		System.out.printf("\nO valor do numero2 eh %d", numero2);
	}
	
	public void modificarAtributos(int n1, int n2){
		numero1 = n1;
		numero2 = n2;
	}
	
	public static void main(String[] args){
		// criando um objeto da classe Calculadora
		// o comando new e responsavel por fazer isso
		Calculadora calc = new Calculadora();
		// chamando o memtodo somar da classe Calculadora
		// o metodo só está acessível apos criae o objeto da classe
		int somaTemp = calc.somar(19, 14);
		System.out.printf("A soma eh %d", somaTemp);
			
		// essa é a forma que não deve ser utilizada para acessar atributos da classe
		// o correto é usar métodos para fazer isso
		//System.out.printf("\nO valor do numero1 eh %d", calc.numero1);
		//System.out.printf("\nO valor do numero2 eh %d", calc.numero2);
		
		// chamando o metodo modificar atributo
		calc.modificarAtributos(28, 14);
		// chamando o metodo mostraAtributos
		calc.mostrarAtributos();

	}
}
