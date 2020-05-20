package whitebox;

public class Main {
	public static void main(String[] args) {

		// Arreglo generico
		int[] arregloBase = Helper.generarArrayAleatorio(20);

		// Ejecución de la lista enlazada simple
		ListaEnlazada lista = new ListaEnlazada();
		lista.crearSimple(arregloBase);
		lista.mostrarLista();

	}
}
