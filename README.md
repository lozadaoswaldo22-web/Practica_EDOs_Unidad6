# Práctica Unidad 6: Resolución Numérica de EDOs en Java (Euler y RK4)

Implementación modular en Java de los algoritmos numéricos del **Método de Euler** y el **Método de Runge-Kutta de 4to Orden (RK4)** para la resolución de Ecuaciones Diferenciales Ordinarias (EDOs) con problemas de valor inicial (PVI). Ambos programas calculan las aproximaciones numéricas, evalúan la solución analítica exacta en cada paso y determinan el error absoluto de truncamiento de manera tabular en consola.

## Estructura del Proyecto

Dentro del directorio `src/` se encuentran las dos clases principales listas para compilar y ejecutar:

* **`src/MetodoEuler.java`**: Resuelve la EDO `y' = x - y` con condición inicial `y(0) = 1` en el intervalo `[0.0, 0.3]`, comparando contra la solución exacta `y(x) = x - 1 + 2*e^(-x)`. Ejecuta de forma automatizada tres simulaciones consecutivas variando el tamaño de paso (`h = 0.10`, `h = 0.05` y `h = 0.01`) para demostrar la reducción del error absoluto al refinar la malla.
* **`src/MetodoRungeKutta.java`**: Resuelve la EDO `y' = x + y` con condición inicial `y(0) = 1` en el intervalo `[0.0, 0.3]`, comparando contra la solución exacta `y(x) = 2*e^(x) - x - 1`. Calcula las cuatro pendientes intermedias (`k1`, `k2`, `k3`, `k4`) con tamaño de paso `h = 0.10` y actualiza el valor ponderado de `y_n`.

## Requisitos del Sistema

Para descargar y ejecutar este proyecto en cualquier equipo se requiere:
* **Java Development Kit (JDK):** Versión 11 o superior (verificar con `java -version` y `javac -version` en terminal).
* **Git:** (Opcional) Para clonar el repositorio desde la línea de comandos.

## Instrucciones de Descarga, Compilación y Ejecución

### Opción A: Desde la Terminal (CMD / PowerShell / Bash)

1. Clonar el repositorio (o descargarlo como archivo ZIP desde el botón verde `<> Code` -> `Download ZIP` y extraerlo):
   git clone https://github.com/TU_USUARIO/Practica_EDOs_Unidad6.git

2. Entrar a la carpeta de código fuente (`src`):
   cd Practica_EDOs_Unidad6/src

3. Compilar ambos archivos Java:
   javac MetodoEuler.java MetodoRungeKutta.java

4. Ejecutar el Método de Euler:
   java MetodoEuler

5. Ejecutar el Método de Runge-Kutta de 4to Orden (RK4):
   java MetodoRungeKutta

### Opción B: Desde un IDE (IntelliJ IDEA / NetBeans / Eclipse / VS Code)

1. Descargar el repositorio como ZIP (botón verde `<> Code` -> `Download ZIP`) y descomprimir la carpeta, o clonarlo con Git.
2. Abrir el IDE (por ejemplo, **IntelliJ IDEA**) y seleccionar **Open**.
3. Seleccionar la carpeta raíz **`Practica_EDOs_Unidad6`** y hacer clic en **OK**.
4. En el panel del proyecto, desplegar la carpeta **`src`**.
5. Abrir **`MetodoEuler.java`** o **`MetodoRungeKutta.java`**, hacer clic derecho dentro del editor y seleccionar **Run 'MetodoEuler.main()'** o **Run 'MetodoRungeKutta.main()'** para visualizar las tablas de resultados en la consola.

## Datos Académicos
* **Autor:** Oswaldo Lozada Hernández
* **Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)
* **Carrera:** Ingeniería en Sistemas Computacionales
* **Asignatura:** SCC-1017 Métodos Numéricos (Unidad 6)
* **Docente:** Víctor Hugo Vásquez Herrera