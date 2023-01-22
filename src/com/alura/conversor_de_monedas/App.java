package com.alura.conversor_de_monedas;
import javax.swing.*;

public class App {
	public static void main(String[] args) {
		inicializarPrograma();	
	}
	
	public static void inicializarPrograma() {
		
		Object[] valores = { "Conversor de monedas", "Conversor de temperatura" };
		Object opcionMenuPrincipal = (JOptionPane.showInputDialog(null,
				"Seleccion el tipo de conversión", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null,
				valores, valores[0]));
		
		if (opcionMenuPrincipal == null) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else {
			evaluarOpcion(opcionMenuPrincipal.toString());
		}
		
	}
	
	public static void evaluarOpcion(String opcion) {
		switch (opcion) {
			case "Conversor de monedas":
				Object monto = JOptionPane.showInputDialog("Ingrese el valor a convertir");
				if (monto == null) {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				} else {
					String montoString = monto.toString();
					if (!montoString.isEmpty()) {
						try {
							double montoDouble = Double.parseDouble(montoString);
							new Function().mostrarOpcionesDeMonedas(montoDouble);
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Ingreso inválido. Ingrese valores numéricos");
							evaluarOpcion(opcion);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor no ingresado. Ingrese el monto a convertir");
						evaluarOpcion(opcion);
					}
				}
				break;
		}
	}

}
