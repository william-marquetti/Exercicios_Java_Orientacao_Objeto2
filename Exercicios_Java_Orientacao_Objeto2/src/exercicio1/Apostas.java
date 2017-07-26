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
	
		System.out.println(aposta.getAposta()[0]);
		
		if (Apostas.resultado == aposta.getAposta()){
			System.out.println("Aposta Ganhadora");
		} else {
			System.out.println("Perdeu");
			
			System.out.println("Resultado: ");
			for (int i : resultado) {
				System.out.print(i+" ");
			}
			
			System.out.println("Aposta: ");
			for (int i : aposta.getAposta()) {
				System.out.print(i+" ");
			}
			
		}
		
	}


}
