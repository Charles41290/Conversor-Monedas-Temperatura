package com.alura.conversor_de_monedas;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	
	public void mostrarOpcionesDeTemperatura(double temp) {
		Object[] valores = { "Celsius a Farentheit", "Farenheit a Celsius"};
		Object opcionTemperatura = (JOptionPane.showInputDialog(null,
				"Elija la moneda a la cual desea convertir", "Monedas",
				JOptionPane.INFORMATION_MESSAGE, null,
				valores, valores[0]));
		
		
		if (opcionTemperatura == null) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else {
			evaluarOpcion(opcionTemperatura.toString(), temp);
		}
	
	}
	

	public void evaluarOpcion(String opciones, double temp) {
		switch (opciones) {
				case "Celsius a Farentheit":
					new ConversorTemperaturas().convertirCelsiusAFarenheit(temp);
					break;	
				case "Farenheit a Celsius":
					new ConversorTemperaturas().convertirFarenheitACelsius(temp);
					break;

		}
		
	}

}
