package figures;

public abstract class Figura implements Comparable<Figura> {
    public abstract double area();
    public int comparteTo(Figura f){
        return (int)(this.area() - f.area());
    }
}
