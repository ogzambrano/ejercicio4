public class SmartDevice {
    protected String nombre;
    protected float peso;
    protected float alto;
    protected float ancho;
    protected int ramGb;
    protected float version;
    protected String[] color = new String[2];

    public SmartDevice() {
    }

    public SmartDevice(String nombre, float peso, float alto, float ancho, int ramGb, float version, String[] color) {
        this.nombre = nombre;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.ramGb = ramGb;
        this.version = version;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public float getAlto() {
        return alto;
    }

    public float getAncho() {
        return ancho;
    }

    public float getRamGb() {
        return ramGb;
    }

    public float getVersion() {
        return version;
    }

    public String[] getColor() {
        return color;
    }
}

