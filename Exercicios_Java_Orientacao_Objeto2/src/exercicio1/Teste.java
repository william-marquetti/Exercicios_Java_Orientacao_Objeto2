package exercicio1;

public class Teste {
	
	public static void main(String[] args) {
		
		Apostas aposta1 = new Apostas(new int[] {2, 9, 10, 11, 25, 59});
		Apostas aposta2 = new Apostas(new int[] {2, 9, 10, 5, 14, 59});
		Apostas aposta3 = new Apostas(new int[] {12, 15, 30, 38, 39, 40});
		Apostas aposta4 = new Apostas(new int[] {3, 5, 6, 10, 11, 12});
		Apostas aposta5 = new Apostas(new int[] {2, 4, 8, 26, 35, 38});
		
		Apostas.setResultado(new int[] {59, 25, 11, 9, 10, 2});
		
		Apostas.verificaResultado(aposta1);
		System.out.println();
		Apostas.verificaResultado(aposta5);
		
	}

}
