import java.util.Locale;

public class MetodoEuler {

    // Implementacion de la funcion f(x, y) = x - y
    public static double evaluarFuncion(double x, double y) {
        return x - y;
    }

    // Solucion analitica exacta: y(x) = x - 1 + 2*e^(-x)
    public static double solucionExacta(double x) {
        return x - 1.0 + 2.0 * Math.exp(-x);
    }

    // Metodo auxiliar para ejecutar los 3 valores de h automaticamente
    public static void ejecutarSimulacion(double x0, double y0, double h, double xFinal) {
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("============================================================");
        System.out.printf(" METODO DE EULER (h = %.2f, Total de pasos N = %d)%n", h, nPasos);
        System.out.println("============================================================");
        System.out.println("n\t x_n\t y_n (Euler)\t y_exacta\t Error Abs.");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f%n",
                0, x, y, solucionExacta(x), Math.abs(solucionExacta(x) - y));

        for (int i = 0; i < nPasos; i++) {
            double pendiente = evaluarFuncion(x, y);
            y = y + h * pendiente;
            x = x + h;

            double yExacta = solucionExacta(x);
            double errorAbs = Math.abs(yExacta - y);

            System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f%n",
                    (i + 1), x, y, yExacta, errorAbs);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x0 = 0.0;
        double y0 = 1.0;
        double xFinal = 0.3;

        // Ejecuta h = 0.1, h = 0.05 y h = 0.01 en una sola corrida
        double[] valoresH = {0.1, 0.05, 0.01};
        for (double h : valoresH) {
            ejecutarSimulacion(x0, y0, h, xFinal);
        }
    }
}