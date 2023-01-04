import java.util.Arrays;

public class SmartPhone extends SmartDevice{
    protected int capacidadGb;

    public SmartPhone() {
    }

    public SmartPhone(String nombre, float peso, float alto, float ancho, int ramGb, float version, String[] color, int capacidadGb) {
        super(nombre, peso, alto, ancho, ramGb, version, color);
        this.capacidadGb = capacidadGb;
    }

    public float getCapacidadGb() {
        return capacidadGb;
    }

    @Override
    public String toString() {
        return  ", nombre='" + nombre + '\'' +
                ", version=" + version +
                ", peso=" + peso +
                ", alto=" + alto +
                ", ancho=" + ancho +
                "capacidadGb=" + capacidadGb +
                ", ramGb=" + ramGb +
                ", color=" + Arrays.toString(color);
    }
}

