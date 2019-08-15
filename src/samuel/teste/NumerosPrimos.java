package samuel.teste;

import java.util.*;

public class NumerosPrimos {
	public static void main(String[] args) {

System.out.println("Digite um número: ");
int n1, i, resultado = 0;
Scanner scan = new Scanner (System.in);                       
		 n1 = scan.nextInt();
				   
for (i = 2; i <= n1 / 2; i++) { 
	if (n1 % i == 0) 
		       resultado++;
		       break;
}

	

if (resultado == 0) {  
		    System.out.println(" O número "+n1+" é um número primo");
} else { 
	
		     System.out.println(" O número "+n1+" não é um número primo");
	 
}
	}
}