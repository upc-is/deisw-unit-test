package whitebox;

/**
 * 
 * @author USUARIO
 *
 * # Requisitos funcional:
 * - El valor del nodo no puede ser modificado
 * - Cuando se inserte un nuevo nodo, se inserte al final
 * 
 * # Modificaciones
 * - cambio de nombre de atributos: The Principle of Least Surprise
 * - Cambio la lógica de negocio (basica): The Boy Scout Rule
 * - VCarificado que los métodos cumplas con el principio: Single Responsibility Principle  
 */

public class ListaEnlazada {
	// Nodo Inicial
	private Nodo primero;
	// Nodo Final
	private Nodo ultimo;

	// Constructor de la clase
	public ListaEnlazada() {
		this.primero = null;
		this.ultimo = null;
		System.out.println("Soy lista enlazada : 1.0");
	}

	// Crea la lista a partir de un arreglo de valores
	public int crearSimple(int[] valores) {
		// por cada elemento del arreglo crea un nodo
		for (int valor : valores) {	// foreach
			// Nuevo objeto nodo
			Nodo nuevoNodo = new Nodo(valor);

			// Si la lista esta vacia, crea una nueva
			if (this.primero == null) {				
				this.primero = nuevoNodo;
				this.ultimo = nuevoNodo;
			}
			// Si la lista NO está vacia, entonces el último nodo apunta al nuevo nodo
			else {
				this.ultimo.setSiguiente(nuevoNodo);
				// El nuevo nodo toma la posicion del ultimo elemento en las variables
				this.ultimo = nuevoNodo;
			}
		}
		return getCantidad();
	}
	public int crearListaOrdenada(int[] valores) {
		return 0;
	}
	public int getCantidad() {
		int cantidad = 0;
		Nodo nodo = this.primero;
		while (nodo != null) {
			cantidad++;
			nodo = nodo.getSiguiente();
		}
		return cantidad;
	}

	// retorna la lista de forma ordenada
	public void mostrarLista() {
		int contador = 1;
		Nodo nodo = this.primero;
		
		while (nodo != null) {
			System.out.println(contador++ + ": " + nodo.getValor());
			nodo = nodo.getSiguiente();
		}
	}
}

//Objeto Nodo de la lista
class Nodo {
	private int valor;
	// Verificar que un objeto este instanciado
	// Puede generar un NullPointException
	private Nodo siguiente;

	public Nodo(int valor) {
		this.valor = valor;
		this.siguiente = null;
	}

	public int getValor() {
		return this.valor;
	}
	
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Nodo getSiguiente() {
		return this.siguiente;
	}
	
}
