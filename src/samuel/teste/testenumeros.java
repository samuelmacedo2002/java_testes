package samuel.teste;

import java.util.*;

public class testenumeros {
public static void main(String[] args) {
	
	int n;
	
	System.out.println("Digite um número: ");
	Scanner scan = new Scanner (System.in);
	n = scan.nextInt();
	
		
	while (n<=30) {
		if(n%2!=0) {
		System.out.println(n++);
		n++;
		}
		}
}
}


