package exercicio1;

import java.util.Arrays;

public class Apostas {

	private int[] aposta = new int[6];
	private static int[] resultado = new int[6];
	
	Apostas(int[] aposta){
		this.aposta = aposta;
		
	}
	
	public int[] getAposta() {
		return aposta;
	}

	public void setAposta(int[] aposta) {
		this.aposta = aposta;
	}

	public static int[] getResultado() {
		return resultado;
	}

	public static void setResultado(int[] resultado) {
		Apostas.resultado = resultado;
	}
	
	public static void verificaResultado(Apostas aposta){
		
		
		Arrays.sort(Apostas.resultado);
		Arrays.sort(aposta.getAposta());
		
		boolean acerto = true;
	
		for ( int aux1 = 0; aux1 < aposta.getAposta().length; aux1++ ){
							
				if ( aposta.getAposta()[aux1] != Apostas.resultado[aux1]){
					acerto = false;
					break;
				}			
		}
	
		
		if (acerto == true){
			System.out.println("Parabéns! Você ganhou!");
			
			System.out.println("Resultado: ");
			for (int i : resultado) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		} else {
			System.out.println("Não foi dessa vez...");
			
			System.out.println("Resultado: ");
			for (int i : resultado) {
				System.out.print(i+" ");
			}
			System.out.println();
			
			System.out.println("Aposta: ");
			for (int i : aposta.getAposta()) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		
	}


}
