package lista3;

public class Teste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("abc1234","Palio","azul");
		Carro c2 = new Carro("abc1234","Palio","azul");
		Carro c3 = new Carro("xzy4321","Fox","verde");
		
		System.out.println( "c1.equals(c1): " + c1.equals(c1) );
		System.out.println( "c1.equals(c2): " + c1.equals(c2) );
		System.out.println( "c1.equals(c3): " + c1.equals(c3) );
		
		System.out.println( "c1.hashCode(): " + c1.hashCode() );
		System.out.println( "c2.hashCode(): " + c2.hashCode() );
		System.out.println( "c3.hashCode(): " + c3.hashCode() );
		
	}

}
