package com.alura.conversor_de_monedas;

import javax.swing.JOptionPane;

public class FunctionMonedas {
	
	public void mostrarOpcionesDeMonedas(double monto) {
		Object[] valores = { "Pesos Argentinos a Dólares americanos", "Pesos Argentinos a Euros",
				"Pesos Argentinos a Libra esterlina", "Pesos argentinos a Yen japonés",
				"Pesos Argentinos a Won surcoreano", 
				"Dólares americanos a pesos Argentinos" , "Euros a Pesos argentinos",
				"Libra esterlina a Pesos argentinos", "Yen japonés a Pesos argentinos",
				"Won surcoreano Pesos argentinos", 
				};
		Object opcionMoneda = (JOptionPane.showInputDialog(null,
				"Elija la moneda a la cual desea convertir", "Monedas",
				JOptionPane.INFORMATION_MESSAGE, null,
				valores, valores[0]));
		
		
		if (opcionMoneda == null) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else {
			evaluarOpcion(opcionMoneda.toString(), monto);
		}
	
	}
	

	public void evaluarOpcion(String opciones, double monto) {
		switch (opciones) {
				case "Pesos argentinos a Dólares americanos":
					new ConversorMonedas().convertirPesosArgentinosADolares(monto);
					break;	
				case "Pesos Argentinos a Euros":
					new ConversorMonedas().convertirPesosArgentinosAEuros(monto);
					break;
				case "Pesos Argentinos a Libras esterlinas":
					new ConversorMonedas().convertirPesosArgentinosALibras(monto);
					break;
				case "Pesos argentinos a Yen japonés":
					new ConversorMonedas().convertirPesosArgentinosAYen(monto);
					break;
				case "Pesos Argentinos a Won surcoreano":
					new ConversorMonedas().convertirPesosArgentinosAWon(monto);
					break;
					
					
				case "Dólares americanos a pesos Argentinos":
					new ConversorMonedas().convertirDolaresAPesosArgentinos(monto);
					break;	
				case "Euros a Pesos argentinos":
					new ConversorMonedas().convertirEurosAPesosArgentinos(monto);
					break;
				case "Libra esterlina a Pesos argentinos":
					new ConversorMonedas().convertirLibrasAPesosArgentinos(monto);
					break;
				case "Yen japonés a Pesos argentinos":
					new ConversorMonedas().convertirYenAPesosArgentinos(monto);
					break;
				case "Won surcoreano Pesos argentinos":
					new ConversorMonedas().convertirWonAPesosArgentinos(monto);
					break;
				default:
					break;
		}
		
	}

}
