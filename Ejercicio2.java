package programas;

public class Ejercicio2 {

	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		Integer suma = 0;
		Integer contador = 0;
		for ( int i = 0; i < listaNotas.length; i++ ) {
			if ( listaNotas[i] >= 5 ) {
				suma = suma + listaNotas[i];
				contador++;
			}
		}
		
		System.out.println("La nota media de aprobados  es : " + suma/contador);

	}

}
