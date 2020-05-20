package testing;

public class Operaciones {
    private int a, b, c, d;

    public Operaciones(int a, int b, int c, int d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int calcular( int m, int n ) {
        int result = 0;
        result = (a * b * m) + (c * n) + d;
        return result;
    }

    public int insertar( int m, int n ) {
    	if(n == 0) {
    		throw new NullPointerException("ERROR de división por cero");
    	}
        int result = 0;
        result = ((a * b * m) + (c * d)) / n;
        return result;
    }
    public boolean delete(int id) {
        System.out.println("Dato eliminado de la base de datos");
        return true;
    }
    public void reset() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
    }

}
