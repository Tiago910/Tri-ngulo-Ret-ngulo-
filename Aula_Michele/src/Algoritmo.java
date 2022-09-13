import java.util.Scanner;

public class Algoritmo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int n = sc.nextInt();

		int[] vetor = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor: ");
			vetor[i] = sc.nextInt();
		}

		int funcao = ordenacaoCriterio(vetor, n);

		if (funcao == 0) {
			System.out.println("Retorno: " + funcao);
			System.out.println("Lista Normal: ");
			for (int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i]);
			}
		} else {
			System.out.println("Retorno: " + funcao);
			System.out.println();
			System.out.println("Lista Normal:");
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Vetor = " + i + vetor[i]);
			}

			
			//algoritmo ordenado
			System.out.println();
			int aux = 0;
			for (int i = 0; i < (vetor.length - 1); i++) {
				for (int j = 1; j < vetor.length; j++) {
					if (vetor[i] > vetor[j]) {
						aux = vetor[j];
						vetor[j] = vetor[i];
						vetor[i] = aux; 
					}
				}
			}
			
			System.out.println("Lista Ordenado:");
			for (int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i]);
			}
			
		}

		sc.close();
	}

	public static int ordenacaoCriterio(int[] vet, int n) {

		int cont = 0;
		if (n >= 4 && n <= 10) {
			cont += 1;
		}
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > 10000 && vet[i] < 99999) {
				cont += 1;
			}
		}

		if (cont > 1) {
			return 1;
		} else {
			return 0;
		}
	}

}