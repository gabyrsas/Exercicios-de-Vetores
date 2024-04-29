package vetores;

import java.util.Scanner;

public class Matriz {

			public static void main(String[] args) {
				
				int numeros[][] = { {3,9,5}, {7,1,2}, {8,6,9} };

			
				int somaDiagonalPrincipal = 0;
				int somaDiagonalSecundaria = 0;

				
				for(int indiceLinha = 0; indiceLinha < numeros.length; indiceLinha++) {
					
					for(int indiceColuna = 0; indiceColuna < numeros.length; indiceColuna++) {
						
						System.out.print(numeros[indiceLinha][indiceColuna]);	
					}

					System.out.println();
				}

				
				System.out.println("Elementos da Diagonal Principal:");
		        for (int contador = 0; contador < numeros.length; contador++) {
		            System.out.print(numeros[contador][contador] + " ");
		            somaDiagonalPrincipal += numeros[contador][contador];
		        }
		        System.out.println("\nSoma de todos os elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		        
		        System.out.println("Elementos da Diagonal Secundária:");
		        for (int contador = 0; contador < numeros.length; contador++) {
		            System.out.print(numeros[contador][numeros.length - 1 - contador] + " ");
		            somaDiagonalSecundaria += numeros[contador][numeros.length - 1 - contador];
		        }
		        System.out.println("\nSoma de todos os elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
		    }

			}
		   