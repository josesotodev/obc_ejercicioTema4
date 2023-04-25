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
		case "otoño":
		case "Otoño":	
				System.out.println("Es otoño");
			break;
		case "invierno":
		case "Invierno":
				System.out.println("Es invierno");
			break;
			
		default:
			System.out.println("El valor no es uan estación.");
			break;
			
		}
	}
	
}
