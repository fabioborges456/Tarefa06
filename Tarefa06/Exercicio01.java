package tarefa06deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio01_LerDoisValoresNumerico {

	/*
	 * 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença
	 * do maior pelo menor valor.
	 */

	public static void main(String[]Args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro valor: ");
		int valor01 = sc.nextInt();
		
		System.out.println("Digite o segundo Valor: ");
		int valor02 = sc.nextInt();
		
		if(valor01 > valor02) {
			System.out.println("A diferencia entre os dois valores digitados é: "+(valor01-valor02));
		}else {
			System.out.println("A diferencia entre os dois valores digitados é: "+(valor02-valor01));
		}
		
		
		sc.close();
	}
	
}
