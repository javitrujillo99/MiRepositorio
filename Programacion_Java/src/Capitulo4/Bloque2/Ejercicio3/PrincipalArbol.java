package Capitulo4.Bloque2.Ejercicio3;

public class PrincipalArbol {

	public static void main(String[] args) {
		
		Rama tronco = new Rama();
		Rama rama01 = new Rama();
		tronco.setExtension1(new Rama());
		tronco.setExtension2(new Fruto());
		tronco.setExtension3(new Hoja());
		
		rama01.setExtension1(new Fruto());
		rama01.setExtension2(new Rama());
		rama01.setExtension3(null);

	}

}
