public class AquaticAnimal {
    /* Declare sus variables de objeto y clase aqui */
  static int maxStarveCycles = 0;
  private char tipo;
    private int starveCycles;

    public AquaticAnimal(char t) {
        this.tipo = tipo;
        this.starveCycles = tipo == 'S' ? maxStarveCycles : 0;
    }

    public char getTipo() {
        return tipo;
    }
    public int getStarveCycles() {
        return starveCycles;
    }

    public void starve() {
        if (tipo == 'S') {
            starveCycles--;
        }
    }
    public void feed() {
        starveCycles = maxStarveCycles;
    }
    public String toString() {
       return String.valueOf(tipo);
    }
}
