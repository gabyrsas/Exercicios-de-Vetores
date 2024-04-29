package vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		int num[]= {2,5,1,3,4,9,7,8,10,6};
		Scanner leia = new Scanner(System.in);
		System.out.println("escolha um numero para verificar");
		int num2 = leia.nextInt();
		int posicao = -1;
		//i por causa da linha d vetor 
		for (int i = 0; i < num.length; i++ ) {
			if (num[i] == num2) {
			posicao = i;
					break;
			}
		}
			if (posicao != -1) {
				System.out.println("O "+ num2+ " esta na posição " + posicao);
			}else{
				System.out.println("O " + num2 + " não foi encontrado, escolha outro número");
			}
		}
	}


