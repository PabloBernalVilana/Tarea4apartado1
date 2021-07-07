package tarea4Apartado1;
/* @Author Pablo Bernal Vilana
 * Declara dos variables numericas
 * Muestra por consola la suma, resta,
 * multiplicacion, division y modulo
 */

public class MainApp {

	public static void main(String[] args) {
		// Declaracion y asignacion del valor de las variables
		int numero1 = 20;
		int numero2 = 10;
		// Operaciones
		// numero1 + numero 2
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		// numero1 - numero 2
		System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		// numero1 * numero 2
		System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		// numero1 / numero 2
		System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		// numero1 % numero 2
		System.out.println(numero1 + " % " + numero2 + " = " + (numero1 % numero2));
	}

}
