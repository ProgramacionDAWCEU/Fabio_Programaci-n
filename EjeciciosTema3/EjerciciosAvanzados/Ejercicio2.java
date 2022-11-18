package EjerciciosAvanzados;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String coordenadas [][] = new String[3][3];
		Integer jugador = 1;
		//Tablero 3*3
		
		for ( int i = 0; i < 3; i++) {
			System.out.println();
			for ( int j = 0; j < 3; j++) {
				coordenadas[i][j] = "-";
				System.out.print(coordenadas[i][j] + "\t");
				
			}
		}
		
		
		int fila;
		int columna;
		
		//Jugador 1
		for ( int x = 0; x < coordenadas.length; x++) {
			for ( int y = 0; y < coordenadas.length; y++) {
				if ( jugador == 1) { //jugador 1
					do {
						System.out.println("Dime las coordenadas(Jugador1)");
						 fila = scanner.nextInt();
						 columna = scanner.nextInt();
						 
					}while(coordenadas[fila][columna]=="*" ||coordenadas[fila][columna]=="O");
					coordenadas[fila][columna] = "*";
					jugador++;
					for ( int i = 0; i < 3; i++) {
						System.out.println();
						for ( int j = 0; j < 3; j++) {
							System.out.print(coordenadas[i][j] + "\t");
						}
					}
					
					//comprobar si ha ganado
					
					//comprobar filas
					int g = 0;
					for ( int i = 0; i < coordenadas.length; i++) {
						if ( coordenadas[0][g] == "*" && coordenadas[0][g+1] == "*" && coordenadas[0][g+2] == "*" ) {
							System.out.println("Jugador 1 ha ganado");
							break;
						}else if ( coordenadas[1][g] == "*" && coordenadas[1][g+1] == "*" && coordenadas[1][g+2] == "*" ) {
							System.out.println("Jugador 1 ha ganado");
							break;
						}else if ( coordenadas[2][g] == "*" && coordenadas[2][g+1] == "*" && coordenadas[2][g+2] == "*" ) {
							System.out.println("Jugador 1 ha ganado");
							break;
						}
					}
					
					//comprobar columnas
					
					for ( int i = 0; i < coordenadas.length; i++) {
						if ( coordenadas[g][0] == "*" && coordenadas[g+1][0] == "*" && coordenadas[g+2][0] == "*" ) {
							System.out.println("Jugador 1 ha ganado");
							break;
						}else if ( coordenadas[g][1] == "*" && coordenadas[g+1][1] == "*" && coordenadas[g+2][1] == "*" ) {
							System.out.println("Jugador 1 ha ganado");
							break;
						}else if ( coordenadas[g][2] == "*" && coordenadas[g+1][2] == "*" && coordenadas[g+2][2] == "*" ) {
							System.out.println("Jugador 1 ha ganado");
							break;
						}
					}
					
					//comprobar diagonales
					
					
					
				} else {
					
					//Jugador 2
					
					do {
						System.out.println("Dime las coordenadas(Jugador2)");
						 fila = scanner.nextInt();
						 columna = scanner.nextInt();
						 
					}while(coordenadas[fila][columna]=="O" ||coordenadas[fila][columna]=="*" );
					coordenadas[fila][columna] = "O";
					jugador=1;
					
					for ( int i = 0; i < 3; i++) {
						System.out.println();
						for ( int j = 0; j < 3; j++) {
							System.out.print(coordenadas[i][j] + "\t");
						}
					}
					//comprobar si ha ganado 
					
					//comprobar filas
					int g = 0;
					for ( int i = 0; i < coordenadas.length; i++) {
						if ( coordenadas[0][g] == "*" && coordenadas[0][g+1] == "*" && coordenadas[0][g+2] == "*" ) {
							System.out.println("Jugador 2 ha ganado");
							break;
						}else if ( coordenadas[1][g] == "*" && coordenadas[1][g+1] == "*" && coordenadas[1][g+2] == "*" ) {
							System.out.println("Jugador 2 ha ganado");
							break;
						}else if ( coordenadas[2][g] == "*" && coordenadas[2][g+1] == "*" && coordenadas[2][g+2] == "*" ) {
							System.out.println("Jugador 2 ha ganado");
							break;
						}
					}
					
					//comprobar columnas
					
					for ( int i = 0; i < coordenadas.length; i++) {
						if ( coordenadas[g][0] == "*" && coordenadas[g+1][0] == "*" && coordenadas[g+2][0] == "*" ) {
							System.out.println("Jugador 2 ha ganado");
							break;
						}else if ( coordenadas[g][1] == "*" && coordenadas[g+1][1] == "*" && coordenadas[g+2][1] == "*" ) {
							System.out.println("Jugador 2 ha ganado");
							break;
						}else if ( coordenadas[g][2] == "*" && coordenadas[g+1][2] == "*" && coordenadas[g+2][2] == "*" ) {
							System.out.println("Jugador 2 ha ganado");
							break;
						}
					}
					
					//comprobar diagonales
					
					
				}
				
				
				
		
				
				}
			
			}
		
	}

}
