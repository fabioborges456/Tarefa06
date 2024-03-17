package tarefa06deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio13_Sexo {

	/*
	 * 12. Elaborar um programa que efetue a leitura do nome e do sexo de uma
	 * pessoa, apresentando com saída uma das seguintes mensagens: "Ilmo Sr.", se o
	 * sexo informado como masculino, ou a mensagem "Ilma Sra.", para o sexo
	 * informado como feminino. Apresente também junto da mensagem de saudação o
	 * nome previamente informado.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu Nome: ");
		String nome = sc.next();

		System.out.println("Digite o seu Sexo: ");
		String sexo = sc.next();

		String sexo01 = "Masculino";

		if (sexo.equalsIgnoreCase(sexo01)) {
			System.out.println("Ilmo Sr " + nome + " Muito Prazer");
		} else {
			System.out.println("Ilma Sra." + nome + " Muito Prazer");
		}

		sc.close();
	}
}
