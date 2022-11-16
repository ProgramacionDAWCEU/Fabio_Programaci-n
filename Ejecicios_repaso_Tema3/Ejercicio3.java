package programas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		
		System.out.println("¿Que nota buscas?");
		Integer nota = scanner.nextInt();
		Integer pos = 0;
		
		
		for ( int i = 0; i < listaNotas.length; i++) {
			if ( nota != listaNotas[i] ) {
				System.out.println("No");
			
			}else if ( nota == listaNotas[i]) {
				pos = i;
				System.out.println("si " + i);
				break;
			}
		}
		
		
		
		scanner.close();
		
		

	}

}
