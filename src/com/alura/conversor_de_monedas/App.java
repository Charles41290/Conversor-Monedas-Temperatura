package com.alura.conversor_de_monedas;
import javax.swing.*;

public class App {
	public static void main(String[] args) {
		
		Object[] valores = { "Conversor de monedas", "Conversor de temperatura" };
		String opciones = (JOptionPane.showInputDialog(null,
				"Seleccion el tipo de conversión", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null,
				valores, valores[0])).toString();
		
		System.out.println(opciones);
		
	}
}
