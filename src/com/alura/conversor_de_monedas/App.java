package com.alura.conversor_de_monedas;
import javax.swing.*;

public class App {
	public static void main(String[] args) {
		
		Object[] valores = { "Conversor de monedas", "Conversor de temperatura" };
		String opciones = (JOptionPane.showInputDialog(null,
				"Seleccion el tipo de conversión", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null,
				valores, valores[0])).toString();
		
		switch (opciones) {
			case "Conversor de monedas":
				String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
				new ConversorMonedas().convertirPesosArgentinosADolares(Double.valueOf(input));
				break;
		
			case "Conversor de temperatura":
				String input2 = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
				System.out.println("Conversor de monedas");
				break;
	
			default:
				break;
		}
		
	
		
	}
}
