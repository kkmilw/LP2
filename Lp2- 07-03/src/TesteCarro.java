
public class TesteCarro {
	public static void main(String[] args ) {
		Carro c1 = new Carro("Palio", "Gol", "azul");
		Carro c2 = new Carro("Palio", "Gol", "azul");
		
		System.out.println("c1: " + c1.hashCode());
		System.out.println("c2: " + c2.hashCode());
	}

}
