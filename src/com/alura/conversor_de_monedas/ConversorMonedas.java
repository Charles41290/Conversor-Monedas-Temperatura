package com.alura.conversor_de_monedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	
	public void convertirPesosArgentinosADolares(double montoAConvertir) {
		double montoDolares = montoAConvertir*0.0055;
		montoDolares = (double) Math.round(montoDolares*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoDolares+" dolares americanos");
	}
}
