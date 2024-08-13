package view;

import controller.FatorialDuploController;

public class Principal {

	public static void main(String[] args) {

		FatorialDuploController fatorialDuploController = new FatorialDuploController();
			int n = 7;
			int resultado = fatorialDuploController.FatorialDuplo(n);
			System.out.println("O fatorial duplo de " + n + " é igual a: " + resultado);
	}
}

