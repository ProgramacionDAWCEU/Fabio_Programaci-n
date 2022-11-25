package EjerciciosAvanzados;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tablero[][] = new String[10][10];
		
		
		//Imprimimos el tablero
		for ( int i = 0; i < tablero.length; i++) {
			System.out.println();
			for ( int j = 0; j < tablero.length; j++) {
				tablero[i][j] = "*";
				System.out.print(tablero[i][j] + "\t");
			}
		}
		System.out.println();
		System.out.println("-----------------------");
		
		//Ubicamos las minas
		
		Random rand = new Random();
		
		//Hay que calcular unas coordenadas aleatorias para ubicar las minas
		String ubicacion[][] = new String[10][10];
		
		for ( int i = 0; i < 5; i++) {
			int x = rand.nextInt(10);
			int y = rand.nextInt(10);
			ubicacion[x][y] = "M";
		}
		
		//Turno del jugador
		
		int fila = 0;
		int columna = 0;
		int fin = 0;
		do {
			
		for ( int x = 0; x < tablero.length; x++) {
			for ( int y = 0; y < tablero.length; y++) {
				System.out.println("Escriba fila");
				fila = scanner.nextInt();
				System.out.println("Escriba columna");
				columna = scanner.nextInt();
				
				//Se compara por si las coordenadas coincide con una mina
				
				if ( ubicacion[fila][columna] == "M") {
					System.out.println("Ha perdido");
					fin++;
					
					//Se muestra el tablero con las minas
					for ( int i = 0; i < tablero.length; i++) {
						System.out.println();
						for ( int j = 0; j < tablero.length; j++) {
							tablero[i][j] = "*";
							System.out.print(tablero[i][j] + "\t");
						}
					}//
					
					break;
					
				}else {//
					if ( fin != 1) {
						//Se muestra el tablero con los espacios en blanco correspondientes
						
						
						
						
						
						//Se le pide al usuario que ubique donde cree que estan las minas ( 1 por turno ) 
						
						Integer mina[][] = new Integer[10][10];
						
						System.out.println("Indique donde cree que hay una mina");
						System.out.println("Fila");
						int fila_mina = scanner.nextInt();
						System.out.println("Columna");
						int columna_mina = scanner.nextInt();
						//se muestra el tablero con la marcacion de la mina
						
						for ( x = 0; x < tablero.length; x++) {
							System.out.println();
							for ( y = 0; y < tablero.length; y++) {
								tablero[fila_mina][columna_mina] = "O";
								System.out.print(tablero[x][y] + "\t");
							}
						}
					}else {
						break;
					}
					
					
				}//
			}
		}//
		} while ( fin == 0);
		
	}

}
