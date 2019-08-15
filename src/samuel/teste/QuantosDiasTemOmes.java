package samuel.teste;

import java.util.Scanner;

public class QuantosDiasTemOmes {

	public static void main(String[] args) {

		int opcao;

		do {

			System.out.println(" ______________________");
			System.out.println("| Digite um dos meses |");
			System.out.println("|------------------   |");
			System.out.println("| 1 =   JANEIRO       |");
			System.out.println("| 2 =   FEVEREIRO     |");
			System.out.println("| 3 =   MARCO         |");
			System.out.println("| 4 =   ABRIL         |");
			System.out.println("| 5 =   MAIO          |");
			System.out.println("| 6 =   JUNHO         |");
			System.out.println("| 7 =   JULHO         |");
			System.out.println("| 8 =   AGOSTO        |");
			System.out.println("| 9 =   SETEMBRO      |");
			System.out.println("| 10 =  OUTUBRO       |");
			System.out.println("| 11=   NOVEMBRO      |");
			System.out.println("| 12 =  DEZEMBRO      |");
			System.out.println("|_____________________|");
			Scanner scan = new Scanner(System.in);
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\n");
				System.out.println("O mes escolhido foi JANEIRO e tem : 31 DIAS");
				break;

			case 2:
				System.out.println("\n");
				System.out.println("O mes escolhido foi FEVEREIRO e tem : 28 DIAS");
				break;

			case 3:
				System.out.println("\n");
				System.out.println("O mes escolhido foi MARCO e tem : 31 DIAS");
				break;

			case 4:
				System.out.println("\n");
				System.out.println("O mes escolhido foi ABRIL e tem : 30 DIAS");
				break;

			case 5:
				System.out.println("\n");
				System.out.println("O mes escolhido foi MAIO e tem : 31 DIAS");
				break;

			case 6:
				System.out.println("\n");
				System.out.println("O mes escolhido foi JUNHO e tem : 30 DIAS");
				break;

			case 7:
				System.out.println("\n");
				System.out.println("O mes escolhido foi JULHO e tem : 31 DIAS");
				break;

			case 8:
				System.out.println("\n");
				System.out.println("O mes escolhido foi AGOSTO e tem : 31 DIAS");
				break;

			case 9:
				System.out.println("\n");
				System.out.println("O mes escolhido foi SETEMBRO e tem : 30 DIAS");
				break;

			case 10:
				System.out.println("\n");
				System.out.println("O mes escolhido foi OUTUBRO e tem : 31 DIAS");
				break;

			case 11:
				System.out.println("\n");
				System.out.println("O mes escolhido foi NOVEMBRO e tem : 30 DIAS");
				break;

			case 12:
				System.out.println("\n");
				System.out.println("O mes escolhido foi DEZEMBRO e tem : 31 DIAS");
				break;

			default:
				System.out.println("Opção inválida, tente novamente!");
			}

		} while (opcao > 12);
		{

		}
		System.out.println("\nOBRIGADO POR USAR NOSSO PROGRAMA !");

	}
}
