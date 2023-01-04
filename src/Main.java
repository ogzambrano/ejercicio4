public class Main {
    public static void main(String[] args) {

        SmartDevice[] smart = new  SmartDevice[2];

        smart[0] = new SmartPhone("nokia",12.5f,20f,11.5f,8,3.1f,new String[]{"amarillo", "azul"},128);
        smart[1] = new SmartWatch("watch",3.5f,5f,5f,8,1.1f,new String[]{"blanco", "morado"},new String[]{"negro, rojo"});

        System.out.println("caracteristicas del SmartPhone");
        System.out.println(smart[0]);

        System.out.println("caracteristicas del SmartWatch");
        System.out.println(smart[1]);

    }
}