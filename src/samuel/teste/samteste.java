package samuel.teste;

import javax.swing.JOptionPane;

public class samteste {

	public static void main(String[] args) {

		int opc = 6;
		double a, a1;

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma das opções:\n \n1 - MULTIPLICAÇÃO \n2 - DIVISÃO \n3 - SOMA \n4 - MÓDULO \n5 - SUBTRAÇÃO\n6 - SAIR\n "));

			switch (opc) {
			case 1:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado da multiplicação destes números é: " + a * a1);
				break;

			case 2:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado da divisão destes números é: " + a / a1);
				break;

			case 3:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado da soma destes números é: " + (a + a1));
				break;

			case 4:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado do módulo destes números é: " + a % a1);
				break;

			case 5:
				a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 1 :"));
				a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor nº 2 :"));
				JOptionPane.showMessageDialog(null, "O resultado da subtração destes números é: " + (a - a1));
				break;

			case 6:
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
				break;

			}
		} while (opc > 6);
		{
		}
	}
}
