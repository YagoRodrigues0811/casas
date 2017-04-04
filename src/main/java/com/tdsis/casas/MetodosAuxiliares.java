package com.tdsis.casas;

import java.io.IOException;

public class MetodosAuxiliares {

	public String mostrarResultado(double num1, double num2, int opcao, OpcaoInvalidaThread opT) throws IOException {
		double resultado;
		switch (opcao) {
		case 1:
			resultado = num1 + num2;
			return ""+resultado;
			
		case 2:
			resultado = num1 - num2;
			return ""+resultado;
			
		case 3:
			resultado = num1 * num2;
			return ""+resultado;
			
		case 4:
			resultado = num1 / num2;
			return ""+resultado;
			
		default:
			opT.run();
			
			
		}
		
		System.exit(0);
		return null;
	}
}
