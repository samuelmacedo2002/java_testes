package samuel.teste;

import java.util.*;

public class samuelteste3 {
	public static void main(String[] args) {
		float n1;
		float n2;
		float soma;
		int opcao;
		System.out.println(" __________________");
		System.out.println("| Digite um número |");
		System.out.println("|------------------|");
		System.out.println("| 1 = MULTIPLICAÇÃO|");
		System.out.println("| 2 = DIVISÃO      |");
		System.out.println("| 3 =   SOMA       |");
		System.out.println("| 4 =  MÓDULO      |");
		System.out.println("|__________________|");
		Scanner scan = new Scanner(System.in);
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("\n");
			System.out.println("Digite o valor nº 1 :");
			Scanner sca = new Scanner(System.in);
			n1 = sca.nextFloat();

			System.out.println("Digite o valor nº 2 :");
			Scanner sc = new Scanner(System.in);
			n2 = sc.nextFloat();

			System.out.println("O resultado da multiplicação destes números é: " + n1 * n2);
			break;

		case 2:
			System.out.println("Digite um número :");
			Scanner a = new Scanner(System.in);
			n1 = a.nextFloat();

			System.out.println("Digite outro número :");
			Scanner b = new Scanner(System.in);
			n2 = b.nextFloat();

			System.out.println("O resultado da divisão destes números é: " + n1 / n2);
			break;

		case 3:
			System.out.println("Digite um número :");
			Scanner c = new Scanner(System.in);
			n1 = c.nextFloat();

			System.out.println("Digite outro número :");
			Scanner d = new Scanner(System.in);
			n2 = d.nextFloat();

			System.out.println("O resultado da soma destes números é: " + (n1 + n2));
			break;

		case 4:
			System.out.println("Digite um número :");
			Scanner e = new Scanner(System.in);
			n1 = e.nextFloat();

			System.out.println("Digite outro número :");
			Scanner f = new Scanner(System.in);
			n2 = f.nextFloat();

			System.out.println("O resultado do módulo destes números é: " + n1 % n2);
			break;
		}

		System.out.println("\nObrigado por utilizar nosso programa!");

	}
}
