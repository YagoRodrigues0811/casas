package com.tdsis.casas;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, resultado = 0;
		JOptionPane.showMessageDialog(null, "Hello World!");
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para multiplicação"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro para multiplicação"));
			resultado = num1 * num2;
			JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Número inválido!!");
		}

	}
}
