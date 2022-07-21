package lista03_AtribuicaoOperacoes;

import java.util.Scanner;

public class Lista3Q16_Empresa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Vamos calular o lucro da sua empresa.");
		System.out.println("Primeiro me informe o total de despesas que voc� teve:");
		int despesa = leia.nextInt();
		
		System.out.println("Agora me informe a receita que voc� teve:");
		int receita = leia.nextInt();
		
		float lucro = receita - despesa;
		float porcentagem = (receita*100)/despesa;
		
		System.out.println("Com base nestas informa��es declaramos que seu lucro foi de R$ " + String.format("%.2f", lucro) + ", uma porcentarem de " + String.format("%.0f", porcentagem) + "%.");
		
		leia.close();


	}

}
