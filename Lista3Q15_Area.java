package lista03_AtribuicaoOperacoes;

import java.util.Scanner;

public class Lista3Q15_Area {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Vamos calcular a área de um octaedro regular. Sua Fórmula é A=2a²V3.");//não consegui inserir o simbolo de raiz quadrada então usei o V
		System.out.println("Por gentileza informe o valor da aresta:");
		int a = leia.nextInt();
		
		double A = (2 * (a*a) * Math.sqrt(3));
				
		System.out.println("A área deste octaedro regular é " + String.format("%.4f", A));
		

		leia.close();

	}

}
