package animal;

public class Peixe extends Animal{
	String caracteristica;
	
	Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double vmed, String caracteristica) {
		super(nome, comprimento, numPatas, cor, ambiente, vmed);
		this.caracteristica = caracteristica;
	}
	
	public String ToString() {
		String mensagem = "Animal: " + this.nome;
		mensagem += "\nComprimento: " + this.comprimento;
		mensagem += "\nNumero de Patas: " + this.numPatas;
		mensagem += "\nCor: " + this.cor;
		mensagem += "\nAmbiente: " + this.ambiente;
		mensagem += "\nCaraceterística: " + this.caracteristica;
		
		return mensagem;
	}
}
