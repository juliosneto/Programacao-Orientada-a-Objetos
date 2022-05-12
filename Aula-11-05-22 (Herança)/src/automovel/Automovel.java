package automovel;

public class Automovel {
	String nome;
	String marca;
	int anoFab;
	int kmRod;
	String cor;
	
	void ligar () {
		System.out.println("O autom�vel " + nome + " est� ligado.");
	}
	
	void acelerar () {
		System.out.println("*barulho de motor girando*");
	}
	
	Automovel(String nome, String marca, int anoFab, int kmRod, String cor) {
		this.nome = nome;
		this.marca = marca;
		this.anoFab = anoFab;
		this.kmRod = kmRod;
		this.cor = cor;
	}
}
