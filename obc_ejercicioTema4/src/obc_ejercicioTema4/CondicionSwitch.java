package obc_ejercicioTema4;

public class CondicionSwitch {

	public void condicionSwitch(String estacion) {
		
		switch (estacion) {
		case "primavera":
		case "Primavera":
				System.out.println("Es primavera");
			break;
		case "verano":
		case "Verano":	
				System.out.println("Es verano");
			break;
		case "oto�o":
		case "Oto�o":	
				System.out.println("Es oto�o");
			break;
		case "invierno":
		case "Invierno":
				System.out.println("Es invierno");
			break;
			
		default:
			System.out.println("El valor no es uan estaci�n.");
			break;
			
		}
	}
	
}
