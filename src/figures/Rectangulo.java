package figures;

import org.w3c.dom.css.Rect;

public class Rectangulo extends Figura{
    private double l1;
    private double l2;

    public Rectangulo(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area(){
        return this.l1 * this.l2;
    }

    public double getL1(){
        return l1;
    }

    public double getL2(){
        return l2;
    }

    public String toString(){
        return "El rectángulo de altura " + this.l1 + " y lado" + this.l2 + " tiene como área: " + this.area();
    }

    @Override
    public int compareTo(Figura o) {
        return 0;
    }
}
