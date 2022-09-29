package figures;

public class Circulo extends Figura {
    public double r;

    public Circulo(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }

    public String toString() {
        return "El círculo de radio " + this.r + " tiene de área: " + this.area();
    }

    @Override
    public int compareTo(Figura o) {
        return 0;
    }
}

