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
			System.out.println("O carro possui Central Multimídia.");
		} else {
			System.out.println("O carro não possui Central Multimídia");
		}
	}
	
	public String ToString () {
		String descricao = "Nome: " + this.nome;
		descricao += "\nMarca: " + this.marca;
		descricao += "\nAno do Fabricação: " + this.anoFab;
		descricao += "\nQuilômetros rodados: " + this.kmRod;
		descricao += "\nCor: " + this.cor;
		descricao += "\nQuantidade de Air Bags: " + this.qtdAir;
		descricao += "\nVolume do porta-malas: " + this.volPorta;
		
		return descricao;
	}
	
	
}
