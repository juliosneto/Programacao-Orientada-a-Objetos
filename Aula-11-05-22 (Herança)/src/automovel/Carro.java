package automovel;

public class Carro extends Automovel{
	int qtdAir;
	int volPorta;
	boolean multimidia;
	
	Carro (String nome, String marca, int anoFab, int kmRod, String cor, int qtdAir, int volPorta, boolean multimidia) {
		super(nome, marca, anoFab, kmRod, cor);
		
		this.qtdAir = qtdAir;
		this.volPorta = volPorta;
		this.multimidia = multimidia;
		
		if (this.multimidia = true) {
			System.out.println("O carro possui Central Multim�dia.");
		} else {
			System.out.println("O carro n�o possui Central Multim�dia");
		}
	}
	
	public String ToString () {
		String descricao = "Nome: " + this.nome;
		descricao += "\nMarca: " + this.marca;
		descricao += "\nAno do Fabrica��o: " + this.anoFab;
		descricao += "\nQuil�metros rodados: " + this.kmRod;
		descricao += "\nCor: " + this.cor;
		descricao += "\nQuantidade de Air Bags: " + this.qtdAir;
		descricao += "\nVolume do porta-malas: " + this.volPorta;
		
		return descricao;
	}
	
	
}
