/**
 * Miembros del equipo
 * 
 * @author Juan Ramón Varó
 * @author Mari Carmen Correa Heras
 * @author Daniel del Río Pérez
 * @author Verónica Bonis Martín
 * @since 23/01/2021
 * @version 1.1
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Cociente
 * 
 */

public class Calculadora {

	/**
	 * Esta clase corresponde al bloque 1, referente a la Suma del ejercicio 1 de
	 * Entornos de desarrollo. Trabajo en grupo
	 * 
	 * @author Juan Ramón Varó
	 * @since 21/01/2021
	 * @version 1.0
	 * @see Calculadora
	 */

	/**
	 * Esta clase corresponde al bloque 3, referente al producto del ejercicio 1 de
	 * Entornos de desarrollo. Trabajo en grupo
	 * 
	 * @author Daniel del Río Pérez.
	 * @since 23/01/2021
	 * @version 1.0
	 */
	public static class Producto {

		/**
		 * Este metodo multiplica dos numeros reales.<br>
		 * Casos especiales:
		 * 
		 * <br>Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.
		 * 
		 * 
		 * @param n1 representa el primer numero real a multiplicar.
		 * @param n2 representa el segundo numero real a multiplicar.
		 * 
		 * @return el resultado de la multiplicacion de ambos numeros reales.
		 * 
		 * @see Calculadora
		 */

		public static double producto(double n1, double n2) {

			// casos especiales

			if (n2 < 0 || n2 == 0)
				return 1;

			return n1 * n2;

		}

		/**
		 * Este metodo multiplica dos numeros enteros.<br>
		 * Casos especiales:
		 * 
		 * <br>Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.
		 * 
		 * 
		 * @param n1 representa el primer numero entero a multiplicar.
		 * 
		 * @param n2 representa el segundo numero entero a multiplicar.
		 * 
		 * @return la multiplicación de ambos numeros enteros.
		 */

		public static int producto(int n1, int n2) {

			// casos especiales

			if (n2 < 0 || n2 == 0)
				return 1;

			return n1 * n2;

		}

		/**
		 * Este método multiplica tres numeros reales.<br>
		 * Casos especiales:
		 * 
		 * 
		 * <br>Si el algun argumento es cero o negativo, entonces el resultado es 1.0.
		 * 
		 * @param n1 representa el primer numero real a multiplicar.
		 * @param n2 representa el segundo numero real a multiplicar.
		 * @param n3 representa el tercer numero real a multiplicar.
		 * 
		 * @return el resultado de la multiplicacion de los tres números reales.
		 */

		public static double producto(double n1, double n2, double n3) {

			// casos especiales

			if (n1 <= 0 || n2 <= 0 || n3 <= 0)
				return 1;

			return n1 * n2 * n3;

		}

		/**
		 * 
		 * Este metodo devuelve la potencia del n1 elevado al n2.<br>
		 * Casos especiales:
		 * 
		 * <br>Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.
		 * <br>Si el segundo argumento es 1.0, entonces el resultado es el mismo que el del
		 * primer argumento.
		 * 
		 * 
		 * 
		 * @param n1 representa la base entera.
		 * @param n2 representa la potencia.
		 * 
		 * 
		 * 
		 * @return el resultado de elevar n1 a n2.
		 * 
		 * 
		 */
		public static int potencia(int n1, int n2) {

			// casos especiales

			if (n2 <= 0)
				return 1;
			if (n2 == 1)
				return n1;

			return (int) Math.pow(n1, n2);// se hace un casting para convertir a entero el resultado.

		}

	}

}
