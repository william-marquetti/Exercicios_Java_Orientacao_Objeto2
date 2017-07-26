package exercicio2;

import java.text.DecimalFormat;

public class Teste {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		// array de objetos do tipo boing sem tamanho fixo
		Boing[] boings = { new Boing(), new Boing() };
		
		// array de objetos do tipo monomotor sem tamanho fixo
		Monomotor[] monomotores = { new Monomotor(), new Monomotor(), new Monomotor() };
		
		// array de objetos do tipo bimotor sem tamanho fixo
		Bimotor[] bimotores = { new Bimotor(), new Bimotor() };
	
		CompanhiaArea cp1 = new CompanhiaArea();
		cp1.setBimotores(bimotores);
		cp1.setBoings(boings);
		cp1.setMonomotores(monomotores);
		
		System.out.println("Faturamento total: R$ "+ df.format(cp1.retornaFaturamentoPassagens()));
		
	}
	
}
