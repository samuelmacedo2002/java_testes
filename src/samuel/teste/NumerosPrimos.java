package samuel.teste;

import java.util.*;

public class NumerosPrimos {
	public static void main(String[] args) {

System.out.println("Digite um n�mero: ");
int n1, i, resultado = 0;
Scanner scan = new Scanner (System.in);                       
		 n1 = scan.nextInt();
				   
for (i = 2; i <= n1 / 2; i++) { 
	if (n1 % i == 0) 
		       resultado++;
		       break;
}

	

if (resultado == 0) {  
		    System.out.println(" O n�mero "+n1+" � um n�mero primo");
} else { 
	
		     System.out.println(" O n�mero "+n1+" n�o � um n�mero primo");
	 
}
	}
}