package lista03_AtribuicaoOperacoes;

import java.util.Scanner;

public class Lista3Q17_IdadeDias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Ol� seja bem-vindo(a), qual seu nome?");
		String nome = leia.nextLine();
		
		System.out.println(nome + ", gostaria de saber sua idade. Em que ano voc� nasceu?");
		int ano = leia.nextInt();
		
		int idade = 2022 - ano;
		float dias = idade * 365.25f;
		
		System.out.println(nome + ", ent�o voc� tem (ou far� este ano) " + idade + " anos e viveu aproximadamente " + dias + " dias.");
		
			
		leia.close();
		
	
		
	}

}
