package lista03_AtribuicaoOperacoes;

import java.util.Scanner;

public class Lista3Q15_Area {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Vamos calcular a �rea de um octaedro regular. Sua F�rmula � A=2a�V3.");//n�o consegui inserir o simbolo de raiz quadrada ent�o usei o V
		System.out.println("Por gentileza informe o valor da aresta:");
		int a = leia.nextInt();
		
		double A = (2 * (a*a) * Math.sqrt(3));
				
		System.out.println("A �rea deste octaedro regular � " + String.format("%.4f", A));
		

		leia.close();

	}

}
