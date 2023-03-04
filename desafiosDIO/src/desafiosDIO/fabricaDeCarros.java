package desafiosDIO;

import java.util.Scanner;

public class fabricaDeCarros {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor correspondente ao custo da Fabrica: ");
		int custoFabrica = scan.nextInt();
		System.out.println("Digite o valor correspondente a porcentagem do distribuidor: ");
		int porcentagemDistribuidor = scan.nextInt();
		System.out.println("Digite o valor correspondente ao percentual dos impostos: ");
		int PercentualImpostos = scan.nextInt();
		
		
		int Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100 ;
		int ValorImpostos = (custoFabrica * PercentualImpostos) / 100;

		int custoFinal = custoFabrica + Distribuidor + ValorImpostos;

		System.out.println("O valor final do carro é: " + custoFinal);
		
		scan.close();
	}

}
