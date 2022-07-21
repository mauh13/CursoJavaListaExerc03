package lista03_AtribuicaoOperacoes;

public class Lista3Q18_Acoes {

	public static void main(String[] args) {
		
		float compra = 32.87f;
	    float venda = 33.92f;
	    int quant = 1000;
	    float comiss = 0.02f;
	    float totcompra;
	    float totvenda;
	    float totdespcompra;
	    float totdespvenda;
	    float totlucrovenda;
	    float totlucrocompra;
	    float totlucro;
	    	totcompra = compra * quant;
	    	totvenda = venda * quant;
	    	totdespcompra = totcompra * comiss;
	    	totdespvenda = totvenda * comiss;
	    	totlucrovenda = totvenda - totdespvenda; 
	    	totlucrocompra = totcompra + totdespcompra;
	    	totlucro = totlucrovenda - totlucrocompra;
	    System.out.println("Valor total da compra: " + totcompra);
	    System.out.println("Valor da comissão compra: " + totdespcompra);
	    System.out.println("Valor total da venda: " + totvenda);
	    System.out.println("Valor comissão de venda: " + totdespvenda);
	    System.out.println("Lucro ou prejuizo: " + totlucro);

	}

}
