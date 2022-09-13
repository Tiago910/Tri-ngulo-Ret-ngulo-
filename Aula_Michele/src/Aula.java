import java.util.Scanner;

public class Aula {
	

	public static void main(String[] args) {
		
		System.out.println("Digite um Numero de A");
		Scanner leia = new Scanner(System.in); 
		double A = leia.nextDouble();
		System.out.println("Digite um Numero de B");
		double B = leia.nextDouble();
		System.out.println("Digite um Numero de C");
		double C = leia.nextDouble();
        double aux;
		
		if (B > A && B > C) {
			aux = A;
			A = B;
			B = aux;
		} else if (C > A) {
			aux = A;
			A = C;
			C = aux;
		}
		if (A<0 || B<0 || C<0) { 
			System.out.println("ENTRADA INVALIDA");
		} 
		else if (A>99 || B>99 || C>99) {
			System.out.println("ENTRADA INVALIDA");
		}
		else {
			if (A >= (B + C)) System.out.println("NAO FORMA TRIANGULO");
			if (A*A == (B*B) + (C*C)) System.out.println("TRIANGULO RETANGULO");
			if (A*A > (B*B) + (C*C)) System.out.println("TRIANGULO OBTUSANGULO");
			if (A*A < (B*B) + (C*C)) System.out.println("TRIANGULO ACUTANGULO");
			if (A == B && A == C) System.out.println("TRIANGULO EQUILATERO");
			if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) System.out.println("TRIANGULO ISOSCELES");
		}
	}
}
