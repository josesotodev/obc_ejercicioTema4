package obc_ejercicioTema4;


public class CondicionWhile {

	CondicionIF generaNumero = new CondicionIF();
	
	int numeroWhile = generaNumero.generaNumeros();
	
	public void condicionWhile() {
		while(numeroWhile<3) {
		numeroWhile++;
		System.out.println(numeroWhile);
		}
	}
	
	
	
}
