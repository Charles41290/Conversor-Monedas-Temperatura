package com.alura.conversor_de_monedas;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {
	
	public void convertirCelsiusAFarenheit(double temp) {
		double tempFarenheit = temp*1.8+32;
		tempFarenheit =  (double) Math.round(tempFarenheit*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				tempFarenheit+" Farenheit");
		evaluarOpcionfinal();
	}
	
	public void convertirFarenheitACelsius(double temp) {
		double tempCelsius = (temp-32)/1.8;
		tempCelsius =  (double) Math.round(tempCelsius*100d/100);
		JOptionPane.showMessageDialog(null, "El resultado de la conversion es: "+
				tempCelsius+" Farenheit");
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
