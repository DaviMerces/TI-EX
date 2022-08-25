import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x,y,r;
		
		System.out.print("Digite o primeiro número:");
		x=sc.nextInt();
		System.out.print("Digite o segundo número:");
		y=sc.nextInt();
		
		r=x+y;
		
		System.out.printf("Resposta = %d",r);
		sc.close();

	}

}
