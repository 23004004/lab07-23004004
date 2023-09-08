import java.util.*;

public class Ocean {
    /* Declare sus variables de objeto y clase aqui */
   public static int defaultCapacity = 0;  // Ejemplo de capacidad default
    private AquaticAnimal[][] oceano;

    public Ocean(int dimensions) {
       int size = dimension < defaultCapacity ? defaultCapacity : dimension;
        this.oceano = new AquaticAnimal[size][size];
    }

    public int getCapacity() {
        return oceano.length;
    }

    public void fill(int fila, int columna, char t) {
       oceano[fila][columna] = new AquaticAnimal(t);
    }

    public void empty(int fila, int columna) {
        oceano[fila][columna] = null;
    }

    public void cycle() {
        /* Escriba su implementacion aqui */
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < oceano.length; i++) {
            for (int j = 0; j < oceano[i].length; j++) {
                if (oceano[i][j] == null) {
                    builder.append("-");
                } else {
                    builder.append(oceano[i][j]);
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
