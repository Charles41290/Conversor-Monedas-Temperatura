package com.alura.conversor_de_monedas;

import javax.swing.JOptionPane;

public class Function {
	
	//public void mostrarOpcionesDeMonedas(String monto) {
	public void mostrarOpcionesDeMonedas(double monto) {
		Object[] valores = { "Pesos Argentinos a Dólares americanos", "Pesos Argentinos a Euros",
				"Pesos Argentinos a Libra esterlina", "Pesos argentinos a Yen japonés",
				"Pesos Argentinos a Won surcoreano"};
		Object opcionMoneda = (JOptionPane.showInputDialog(null,
				"Elija la moneda a la cual desea convertir", "Monedas",
				JOptionPane.INFORMATION_MESSAGE, null,
				valores, valores[0]));
		
		/*
		if (opcionMoneda == null) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else {
			try {
				double montoDouble = Double.parseDouble(monto);
				evaluarOpcion(opcionMoneda.toString(), montoDouble);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Ingreso inválido. Ingrese valores numéricos");
			}
		}*/
		
		if (opcionMoneda == null) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else {
			evaluarOpcion(opcionMoneda.toString(), monto);
		}
	
	}
	
	public void evaluarOpcion(String opciones, double monto) {
		switch (opciones) {
		case "Pesos Argentinos a Dólares americanos":
			new ConversorMonedas().convertirPesosArgentinosADolares(monto);
			break;

		default:
			break;
		}
		
	}

}
