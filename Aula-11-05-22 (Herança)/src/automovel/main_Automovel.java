package automovel;

public class main_Automovel {

	public static void main(String[] args) {
		Carro BMW = new Carro("X7", "BMW", 2022, 0, "Preto", 7, 750, true);
		
		System.out.println(BMW.ToString());
		BMW.ligar();
		BMW.acelerar();
		
		Moto GSX = new Moto("GSX-S1000F", "Suzuki", 2019, 9000, "Vermelha", "A3", 999, false);
		
		System.out.println(GSX.ToString());
		GSX.ligar();
		GSX.acelerar();
	}
}
