package exercicio2;

import java.text.DecimalFormat;

public class CompanhiaArea {
	
	Boing[] boings;
	Monomotor[] monomotores;
	Bimotor[] bimotores;
	
	public Boing[] getBoings() {
		return boings;
	}



	public void setBoings(Boing[] boings) {
		this.boings = boings;
	}



	public Monomotor[] getMonomotores() {
		return monomotores;
	}



	public void setMonomotores(Monomotor[] monomotores) {
		this.monomotores = monomotores;
	}



	public Bimotor[] getBimotores() {
		return bimotores;
	}



	public void setBimotores(Bimotor[] bimotores) {
		this.bimotores = bimotores;
	}
	
	public double retornaFaturamentoPassagens(){
		
		double faturamentoTotal = 0;
		double faturamentoBimotor = 0;
		double faturamentoBoing = 0;
		double faturamentoMonomotor = 0;
		
		for (Bimotor bimotor : bimotores) {
			
			faturamentoBimotor += ( bimotor.getValorPassagem() * bimotor.getLugares() );
			
		}
		
		for (Boing boing : boings) {
			
			faturamentoBoing += ( boing.getValorPassagem() * boing.getLugares() );
			
		}
		
		for (Monomotor monomotor : monomotores) {
			
			faturamentoMonomotor += ( monomotor.getValorPassagem() * monomotor.getLugares() );
		}
		
		faturamentoTotal = ( faturamentoBimotor + faturamentoBoing + faturamentoMonomotor );
		
		return faturamentoTotal;
		
	}


}
