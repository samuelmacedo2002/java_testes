package samuel.teste;

import javax.swing.JOptionPane;

public class samteste {

	public static void main(String[] args) {

		int opc = 6;
		double a, a1;

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma das op��es:\n \n1 - MULTIPLICA��O \n2 - DIVIS�O \n3 - SOMA \n4 - M�DULO \n5 - SUBTRA��O\n6 - SAIR\n "));

			switch (opc) {
			case 1:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado da multiplica��o destes n�meros �: " + a * a1);
				break;

			case 2:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado da divis�o destes n�meros �: " + a / a1);
				break;

			case 3:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado da soma destes n�meros �: " + (a + a1));
				break;

			case 4:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado do m�dulo destes n�meros �: " + a % a1);
				break;

			case 5:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor n� 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado da subtra��o destes n�meros �: " + (a - a1));
				break;

			case 6:
				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida, tente novamente!");
				break;

			}
		} while (opc > 6);
		{
		}
	}
}
