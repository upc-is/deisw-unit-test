package testing;

public class Principal {
	public static void main(String args[]) {
		System.out.println("Hello programmers");
		
		Operaciones ope = new Operaciones(1, 2, 3, 4);
		int result = ope.calcular(5, 6);
		System.out.println(result); 
		
	}
}
