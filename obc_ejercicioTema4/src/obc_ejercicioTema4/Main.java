package obc_ejercicioTema4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		CondicionIF condicionIf = new CondicionIF();
		CondicionWhile condicionWhile = new CondicionWhile();
		CondicionDoWhile condicionDoWhile = new CondicionDoWhile();
		
		int numero = generaNumeros();
		
		
		System.out.println("\nCondicion IF \n");
		condicionIf.comparaNumero(numero);
		System.out.println("\nCondicion While \n");
		condicionWhile.condicionWhile(numero);
		System.out.println("\nCondicion Do-While \n");
		condicionDoWhile.condicionDoWhile(numero);
	}	
	
	public static int generaNumeros() {
		
		Random rand = new Random();
		int numeroAleatorio = (int)(rand.nextInt(5-(-5)+1)-5);
		return numeroAleatorio;		
	}
}
