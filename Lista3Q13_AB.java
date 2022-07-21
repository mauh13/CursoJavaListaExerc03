package lista03_AtribuicaoOperacoes;

public class Lista3Q13_AB {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("A = " + a + " e B = " + b);
		
		int c = a;
		a = b;
		b = c;
		System.out.println("A = " + a + " e B = " + b);
	}

}
