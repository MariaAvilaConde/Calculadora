public class Calculadora {

    public int sumar(int a, int b) {
        System.out.println("Método sumar() llamado con a = " + a + ", b = " + b);
        int resultado = a + b;
        System.out.println("Resultado de sumar: " + resultado);
        return resultado;
    }

    public int restar(int a, int b) {
        System.out.println("Método restar() llamado con a = " + a + ", b = " + b);
        int resultado = a - b;
        System.out.println("Resultado de restar: " + resultado);
        return resultado;
    }

    public int multiplicar(int a, int b) {
        System.out.println("Método multiplicar() llamado con a = " + a + ", b = " + b);
        int resultado = a * b;
        System.out.println("Resultado de multiplicar: " + resultado);
        return resultado;
    }

    public int dividir(int a, int b) {
        System.out.println("Método dividir() llamado con a = " + a + ", b = " + b);
        if (b == 0) {
            System.out.println("⚠️ Error: intento de división por cero.");
            throw new ArithmeticException("No se puede dividir por cero");
        }
        int resultado = a / b;
        System.out.println("Resultado de dividir: " + resultado);
        return resultado;
    }

    public int porcentaje(int parte, int total) {
        System.out.println("Método porcentaje() llamado con parte = " + parte + ", total = " + total);
        if (total == 0) {
            System.out.println("⚠️ Error: intento de calcular porcentaje con total = 0.");
            throw new ArithmeticException("No se puede calcular porcentaje con total = 0");
        }
        int resultado = (parte * 100) / total;
        System.out.println("Resultado de porcentaje: " + resultado + "%");
        return resultado;
    }

    public double raizCuadrada(double x) {
        System.out.println("Método raizCuadrada() llamado con x = " + x);
        if (x < 0) {
            System.out.println("⚠️ Error: raíz cuadrada de número negativo.");
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        double resultado = Math.sqrt(x);
        System.out.println("Resultado de raizCuadrada: " + resultado);
        return resultado;
    }

}
