import figures.*;
import java.util.Arrays;

public class GestorClases {
    public static void sort (Figura [] v){
        Arrays.sort(v);
    }
    public static double suma (Figura[] v){
        double ret = 0;
        for (Figura f: v){
            System.out.println(f);
            ret += f.area();
        }
        return ret;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[1];
        v[0] = new Circulo(5);

        double r = GestorClases.suma(v);

        System.out.println("El área total es: " + r);
    }
}
