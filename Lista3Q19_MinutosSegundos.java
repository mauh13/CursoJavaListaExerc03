package lista03_AtribuicaoOperacoes;

import java.util.Scanner;

public class Lista3Q19_MinutosSegundos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

	System.out.println("Favor informar uma hora cheia:");
	int hora = leia.nextInt();
	
	int minutos = hora * 60;
	int segundos = minutos * 60;
	
	System.out.println("Esta hora corresponde a " + minutos + " minutos e " + segundos + " segundos.");
	

		leia.close();

		

	}

}
