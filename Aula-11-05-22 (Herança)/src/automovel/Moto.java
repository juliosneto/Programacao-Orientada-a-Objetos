package automovel;

public class Moto extends Automovel {
	String categoria;
	int cilindrada;
	boolean bau;
	
	Moto (String nome, String marca, int anoFab, int kmRod, String cor, String categoria, int cilindrada, boolean bau) {
		super(nome, marca, anoFab, kmRod, cor);
		
		this.categoria = categoria;
		this.cilindrada = cilindrada;
		this.bau = bau;
		
		if (this.bau = false) {
			System.out.println("A moto possui baú.");
		} else {
			System.out.println("A moto não possui baú.");
		}
	}
	
	public String ToString () {
		String descricao = "Nome: " + this.nome;
		descricao += "\nMarca: " + this.marca;
		descricao += "\nAno do Fabricação: " + this.anoFab;
		descricao += "\nQuilômetros rodados: " + this.kmRod;
		descricao += "\nCor: " + this.cor;
		descricao += "\nCategoria: " + this.categoria;
		descricao += "\nCilindradas: " + this.cilindrada;
		
		return descricao;
	}
}
