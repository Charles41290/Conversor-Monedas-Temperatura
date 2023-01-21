package com.alura.conversor_de_monedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	
	public void convertirPesosArgentinosADolares(double montoAConvertir) {
		double montoConvertido = montoAConvertir*0.0055;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Dolares-Americanos");
	}
	
	public void convertirPesosArgentinosAEuros(double montoAConvertir) {
		double montoConvertido = montoAConvertir*0.0050;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Euros");
	}
	
	public void convertirPesosArgentinosALibras(double montoAConvertir) {
		double montoConvertido = montoAConvertir*0.0044;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		
	}
	
	public void convertirPesosArgentinosAYen(double montoAConvertir) {
		double montoConvertido = montoAConvertir*0.71;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Euros");
	}
	
	public void convertirPesosArgentinosAWon(double montoAConvertir) {
		double montoConvertido = montoAConvertir*6.72;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Euros");
	}
	
	
}
