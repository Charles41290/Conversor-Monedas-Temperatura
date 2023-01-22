package com.alura.conversor_de_monedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	public void convertirPesosArgentinosADolares(double montoAConvertir) {
		double montoConvertido = montoAConvertir*0.0055;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Dolares-Americanos");
		evaluarOpcionfinal();
	}
	
	public void convertirDolaresAPesosArgentinos(double montoAConvertir) {
		double montoConvertido = montoAConvertir*(1/0.0055);
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Dolares-Americanos");
		evaluarOpcionfinal();
	}
	
	public void convertirPesosArgentinosAEuros(double montoAConvertir) {
		double montoConvertido = montoAConvertir*0.0050;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Euros");
		evaluarOpcionfinal();
	}
	
	public void convertirEurosAPesosArgentinos(double montoAConvertir) {
		double montoConvertido = montoAConvertir*(1/0.0050);
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Libras esterlinas");
		evaluarOpcionfinal();
	}
	

	public void convertirPesosArgentinosALibras(double montoAConvertir) {
		double montoConvertido = montoAConvertir*0.0044;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Libras esterlinas");
		evaluarOpcionfinal();
	}
	
	public void convertirLibrasAPesosArgentinos(double montoAConvertir) {
		double montoConvertido = montoAConvertir*(1/0.0044);
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Libras esterlinas");
		evaluarOpcionfinal();
		
	}

	public void convertirPesosArgentinosAYen(double montoAConvertir) {
		double montoConvertido = montoAConvertir*0.71;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Yenes");
		evaluarOpcionfinal();
	}
	
	public void convertirYenAPesosArgentinos(double montoAConvertir) {
		double montoConvertido = montoAConvertir*(1/0.71);
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Yenes");
		evaluarOpcionfinal();
		
	}
	
	public void convertirPesosArgentinosAWon(double montoAConvertir) {
		double montoConvertido = montoAConvertir*6.72;
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Wones");
		evaluarOpcionfinal();
	}
	
	public void convertirWonAPesosArgentinos(double montoAConvertir) {
		double montoConvertido = montoAConvertir*(1/6.72);
		montoConvertido = (double) Math.round(montoConvertido*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				montoConvertido+" Wones");
		evaluarOpcionfinal();
	}
	
	public void evaluarOpcionfinal() {
		Object opcionFinal = JOptionPane.showConfirmDialog(null,
				"¿Desea continuar?", "Seleccione una opción", JOptionPane.YES_NO_CANCEL_OPTION);
		if(JOptionPane.YES_OPTION == Integer.parseInt(opcionFinal.toString())) {
			App.inicializarPrograma();
		} else if(JOptionPane.NO_OPTION == Integer.parseInt(opcionFinal.toString())) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else if(JOptionPane.CANCEL_OPTION == Integer.parseInt(opcionFinal.toString())) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
	}



	

	



	
	
	
}
