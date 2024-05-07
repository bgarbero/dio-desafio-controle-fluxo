package application;

import java.util.Scanner;

import model.entities.ParametrosInvalidosException;

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

	static String contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
		} else {
			StringBuilder resultado = new StringBuilder();
			int contagem = parametroDois - parametroUm;
			for (int i = 0; i <= contagem; i++) {
				 resultado.append("Imprimindo o número ").append(i).append("\n");
			}
			return resultado.toString();
		}
	}
}