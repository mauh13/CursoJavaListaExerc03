package lista03_AtribuicaoOperacoes;

public class Lista3Q14_ABC {

	public static void main(String[] args) {

	System.out.println("Exerc�cio A:");
		int a = 10;
		int b = 20;
		System.out.println("B = " + b);
		b = 5;
		System.out.println("A = " + a + " e B = " + b);
		System.out.println("");
	
	System.out.println("Exerc�cio B:");
		a = 30;
		b = 20;
		int c = a + b;
		System.out.println("C = " + c);
		b = 10;
		System.out.println("B = " + b + " e C = " + c);
		c = a + b;
		System.out.println("A = " + a + ", B = " + b + " e C =" + c);
		System.out.println("");
	
	System.out.println("Exerc�cio C:");
		a = 10;
		b = 20;
		c = a;
		b = c;
		a = b;
		System.out.println("A = " + a + ", B = " + b + " e C =" + c);
		System.out.println("");
		
	System.out.println("Exerc�cio D:");
		a = 10;
		b = a + 1;// n�o entendi a l�gica do ++
		a = b + 1;
		b = a + 1;
		System.out.println("A = " + a);
		a = b + 1;
		System.out.println("A = " + a + " e B = " + b);
		System.out.println("");
		
	System.out.println("Exerc�cio E:");
		a = 10;
		b = 5;
		c = a + b;
		b = 20;
		a = 10;
		System.out.println("A = " + a + ", B = " + b + " e C =" + c);
		System.out.println("");
	
	System.out.println("Exerc�cio F:");
		int x = 1;
		int y = 2;
		int z = y - x;
		System.out.println("Z = " + z);
		x = 5;
		y = x + z;
		System.out.println("X = " + x + ", Y = " + y + " e Z =" + z);
		
	}

}
