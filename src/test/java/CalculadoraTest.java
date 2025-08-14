import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Variable para almacenar la instancia de Calculadora
    Calculadora calc;

    // Este método se ejecuta ANTES de cada prueba (@Test)
    @BeforeEach
    void setup() {
        System.out.println("Iniciando prueba...");
        // Creamos una nueva instancia de la calculadora antes de cada prueba
        calc = new Calculadora();
    }

    // Este método se ejecuta DESPUÉS de cada prueba (@Test)
    @AfterEach
    void cleanup() {
        System.out.println("Prueba finalizada!");
    }

    // Prueba unitaria para el método sumar
    @Test
    void testSumar() {
        System.out.println("Ejecutando testSumar...");
        int resultado = calc.sumar(3, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(7, resultado, "La suma debe ser 7");
    }

    // Prueba unitaria para el método dividir
    @Test
    void testDividir() {
        System.out.println("Ejecutando testDividir...");
        int resultado = calc.dividir(12, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(3, resultado, "La división debe ser 3");
    }
}
