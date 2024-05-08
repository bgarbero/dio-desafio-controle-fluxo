package application;

import java.util.Scanner;

import Exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		sc.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
		} else {
			int contagem = parametroDois - parametroUm;
			for (Integer i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número "+ i);
			}
		}
	}
}