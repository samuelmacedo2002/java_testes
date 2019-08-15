package samuel.teste;
import java.util.Scanner;
public class samuelteste2 {
public static void main(String[] args) {
	int dias = 365;
	int n1,n2,n3,soma;
	System.out.println("Digite um número : ");
	Scanner scan = new Scanner(System.in);
	n1 = scan.nextInt();
	
	System.out.println("Digite outro número : ");
	Scanner sc = new Scanner(System.in);
	n2 = sc.nextInt();
	
	soma = (n1+n2);
System.out.println("O resultado da soma dos números é : "+soma);

if (soma % 2 == 0 ) {
System.out.println("O resultado da soma é par");
}else{
	System.out.println("O resultado da soma é ímpar");
}
}
}