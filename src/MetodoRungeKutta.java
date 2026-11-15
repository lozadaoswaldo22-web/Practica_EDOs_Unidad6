import java.util.Locale;

public class MetodoRungeKutta {

    // Implementacion de la funcion f(x, y) = x + y
    public static double evaluarFuncion(double x, double y) {
        return x + y;
    }

    // Solucion analitica exacta: y(x) = 2*e^(x) - x - 1
    public static double solucionExacta(double x) {
        return 2.0 * Math.exp(x) - x - 1.0;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1;
        double xFinal = 0.3;

        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("==================================================================");
        System.out.printf(" METODO DE RUNGE-KUTTA 4TO ORDEN - RK4 (h = %.2f, Pasos N = %d)%n", h, nPasos);
        System.out.println("==================================================================");
        System.out.println("n\t x_n\t y_n (RK4)\t y_exacta\t Error Abs.");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.8f%n",
                0, x, y, solucionExacta(x), Math.abs(solucionExacta(x) - y));

        for (int i = 0; i < nPasos; i++) {
            // Calculo de las 4 pendientes (k1, k2, k3, k4)
            double k1 = evaluarFuncion(x, y);
            double k2 = evaluarFuncion(x + (h / 2.0), y + (h / 2.0) * k1);
            double k3 = evaluarFuncion(x + (h / 2.0), y + (h / 2.0) * k2);
            double k4 = evaluarFuncion(x + h, y + h * k3);

            // Actualizacion ponderada de y junto con el avance de x en h
            y = y + (h / 6.0) * (k1 + 2.0 * k2 + 2.0 * k3 + k4);
            x = x + h;

            double yExacta = solucionExacta(x);
            double errorAbs = Math.abs(yExacta - y);

            System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.8f%n",
                    (i + 1), x, y, yExacta, errorAbs);
        }
    }
}