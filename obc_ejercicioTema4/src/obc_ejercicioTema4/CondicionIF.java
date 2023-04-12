package obc_ejercicioTema4;

import java.util.Random;

public class CondicionIF {

	public void comparaNumero() {
			
			int numeroIf = generaNumeros();
			
			if(numeroIf > 0) {
				System.out.println("El número " + numeroIf + " es positivo");
			} else if (numeroIf < 0) {
				System.out.println("El número " + numeroIf + " es negativo");
			} else {
				System.out.println("El número es 0");
			}
		}
		
		public int generaNumeros() {
			
			Random rand = new Random();
			int numeroAleatorio = (int)(rand.nextInt(5-(-5)+1)-5);
			return numeroAleatorio;		
		}
	
}
