package samuel.teste;

import java.util.*;

public class samuelteste3 {
	public static void main(String[] args) {
		float n1;
		float n2;
		float soma;
		int opcao;
		System.out.println(" __________________");
		System.out.println("| Digite um n�mero |");
		System.out.println("|------------------|");
		System.out.println("| 1 = MULTIPLICA��O|");
		System.out.println("| 2 = DIVIS�O      |");
		System.out.println("| 3 =   SOMA       |");
		System.out.println("| 4 =  M�DULO      |");
		System.out.println("|__________________|");
		Scanner scan = new Scanner(System.in);
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("\n");
			System.out.println("Digite o valor n� 1 :");
			Scanner sca = new Scanner(System.in);
			n1 = sca.nextFloat();

			System.out.println("Digite o valor n� 2 :");
			Scanner sc = new Scanner(System.in);
			n2 = sc.nextFloat();

			System.out.println("O resultado da multiplica��o destes n�meros �: " + n1 * n2);
			break;

		case 2:
			System.out.println("Digite um n�mero :");
			Scanner a = new Scanner(System.in);
			n1 = a.nextFloat();

			System.out.println("Digite outro n�mero :");
			Scanner b = new Scanner(System.in);
			n2 = b.nextFloat();

			System.out.println("O resultado da divis�o destes n�meros �: " + n1 / n2);
			break;

		case 3:
			System.out.println("Digite um n�mero :");
			Scanner c = new Scanner(System.in);
			n1 = c.nextFloat();

			System.out.println("Digite outro n�mero :");
			Scanner d = new Scanner(System.in);
			n2 = d.nextFloat();

			System.out.println("O resultado da soma destes n�meros �: " + (n1 + n2));
			break;

		case 4:
			System.out.println("Digite um n�mero :");
			Scanner e = new Scanner(System.in);
			n1 = e.nextFloat();

			System.out.println("Digite outro n�mero :");
			Scanner f = new Scanner(System.in);
			n2 = f.nextFloat();

			System.out.println("O resultado do m�dulo destes n�meros �: " + n1 % n2);
			break;
		}

		System.out.println("\nObrigado por utilizar nosso programa!");

	}
}
