import java.util.Arrays;

public class SmartWatch extends SmartDevice{
    protected String[] colorCorrea = new String[3];

    public SmartWatch() {
    }

    public SmartWatch(String nombre, float peso, float alto, float ancho, int ramGb, float version, String[] color, String[] colorCorrea) {
        super(nombre, peso, alto, ancho, ramGb, version, color);
        this.colorCorrea = colorCorrea;
    }

    public String[] getColorCorrea() {
        return colorCorrea;
    }

    @Override
    public String toString() {
        return  ", nombre='" + nombre + '\'' +
                ", version=" + version +
                ", peso=" + peso +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", ramGb=" + ramGb +
                ", color=" + Arrays.toString(color) +
                "colorCorrea=" + Arrays.toString(colorCorrea);
    }
}
