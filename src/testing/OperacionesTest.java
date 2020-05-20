package testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {

    static Operaciones ope;

    @BeforeAll
    static void init() {
        System.out.println("INIT:");
        ope = new Operaciones(1, 2, 3, 4);
    }

    @BeforeEach
    void beforeReset() {
        System.out.println("Reset");
        ope.reset();
    }

    @Test
    void testCalcular() {
        System.out.println("Calcular");
        int result = ope.calcular(5, 6);
        assertEquals(12, result, "Revisa tu codigo, tiene errores ");
    }
    @Test
    void testCalcular2() {
        System.out.println("Calcular");
        int result = ope.calcular(5, 6);
        assertNotEquals(0, result, "Revisa tu codigo, tiene errores ");
    }
    @Test
    void testInsertar() {
        System.out.println("Insertar");
        int result = ope.insertar(4, 7);
        assertEquals(0, result, "Revisa tu codigo, tiene errores ");
    }
    @Test
    void testInsertarCero() {
        System.out.println("InsertarZero");
        Assertions.assertThrows(NullPointerException.class, () -> {
            ope.insertar(4, 0);
        });

    }

    @AfterAll
    static void finish() {
        System.out.println("FINISH");
    }

}