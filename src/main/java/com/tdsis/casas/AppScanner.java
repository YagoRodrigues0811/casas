package com.tdsis.casas;

import java.util.Scanner;

public class AppScanner {

	public static void main(String[] args) {

		// Declaração
		int opcao = 0;
		double num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		OpcaoInvalidaThread opT = new OpcaoInvalidaThread();
		// Inicio
		try {
			System.out.println("Digite o Primeiro número da Operação");
			num1 = sc.nextDouble();
			System.out.println("Digite o Segundo número da Operação");
			num2 = sc.nextDouble();
			System.out.println("Digite a Operação a ser realizada");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			opcao = sc.nextInt();
			MetodosAuxiliares mt = new MetodosAuxiliares();
			System.out.println("O Resultado é "+mt.mostrarResultado(num1, num2, opcao, opT));
		} catch (Exception e) {
			// TODO: handle exception
			opT.run();
		}
	}
			
	

	}

