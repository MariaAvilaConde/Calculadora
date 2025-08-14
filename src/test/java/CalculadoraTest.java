import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc;

    @BeforeEach
    void setup() {
        System.out.println("Iniciando prueba...");
        calc = new Calculadora();
    }

    @AfterEach
    void cleanup() {
        System.out.println("Prueba finalizada!");
    }

    @Test
    void testSumar() {
        System.out.println("Ejecutando testSumar...");
        int resultado = calc.sumar(3, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(7, resultado, "La suma debe ser 7");
    }

    @Test
    void testDividir() {
        System.out.println("Ejecutando testDividir...");
        int resultado = calc.dividir(12, 4);
        System.out.println("Resultado: " + resultado);
        assertEquals(3, resultado, "La división debe ser 3");
    }

    // 📌 Test para restar (positivos y negativos)
    @Test
    void testRestarPositivos() {
        System.out.println("Ejecutando testRestarPositivos...");
        assertEquals(2, calc.restar(5, 3), "La resta debe ser 2");
    }

    @Test
    void testRestarNegativos() {
        System.out.println("Ejecutando testRestarNegativos...");
        assertEquals(-8, calc.restar(-5, 3), "La resta debe ser -8");
    }

    // 📌 Test para multiplicar
    @Test
    void testMultiplicarConCero() {
        System.out.println("Ejecutando testMultiplicarConCero...");
        assertEquals(0, calc.multiplicar(0, 10), "Cualquier número multiplicado por 0 debe ser 0");
    }

    @Test
    void testMultiplicarPositivos() {
        System.out.println("Ejecutando testMultiplicarPositivos...");
        assertEquals(20, calc.multiplicar(4, 5), "4 * 5 debe ser 20");
    }

    @Test
    void testMultiplicarNegativos() {
        System.out.println("Ejecutando testMultiplicarNegativos...");
        assertEquals(-15, calc.multiplicar(3, -5), "3 * -5 debe ser -15");
    }

    // 📌 Test para porcentaje
    @Test
    void testPorcentajeNormal() {
        System.out.println("Ejecutando testPorcentajeNormal...");
        assertEquals(25, calc.porcentaje(25, 100), "25 de 100 debe ser 25%");
    }

    @Test
    void testPorcentajeResultadoDecimalTruncado() {
        System.out.println("Ejecutando testPorcentajeResultadoDecimalTruncado...");
        assertEquals(33, calc.porcentaje(1, 3), "1 de 3 es aproximadamente 33%");
    }

    @Test
    void testPorcentajeDivisionPorCero() {
        System.out.println("Ejecutando testPorcentajeDivisionPorCero...");
        assertThrows(ArithmeticException.class, () -> calc.porcentaje(50, 0),
                "Debe lanzar ArithmeticException al dividir por cero");
    }

        // 📌 Test para raíz cuadrada
    @Test
    void testRaizCuadradaPositiva() {
        System.out.println("Ejecutando testRaizCuadradaPositiva...");
        assertEquals(5.0, calc.raizCuadrada(25.0), 0.0001, "La raíz cuadrada de 25 debe ser 5");
    }
    
    @Test
    void testRaizCuadradaCero() {
        System.out.println("Ejecutando testRaizCuadradaCero...");
        assertEquals(0.0, calc.raizCuadrada(0.0), 0.0001, "La raíz cuadrada de 0 debe ser 0");
    }
    
    @Test
    void testRaizCuadradaDecimal() {
        System.out.println("Ejecutando testRaizCuadradaDecimal...");
        assertEquals(2.0, calc.raizCuadrada(4.0), 0.0001, "La raíz cuadrada de 4 debe ser 2");
    }
    
    @Test
    void testRaizCuadradaNegativa() {
        System.out.println("Ejecutando testRaizCuadradaNegativa...");
        assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-9),
            "Debe lanzar IllegalArgumentException al intentar calcular la raíz de un número negativo");
    }

}
