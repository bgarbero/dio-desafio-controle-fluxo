package application;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

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

		} catch (ParseExcpetion e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro }

		}

	}
	
	static String contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
			return ("O segundo parâmetro deve ser maior que o primeiro");
		} else {
			int contagem = parametroDois - parametroUm;
			for (int i = 0; i <= contagem; i++) {
				return ("Imprimindo o número ", i);
			}
		}
	}

}
