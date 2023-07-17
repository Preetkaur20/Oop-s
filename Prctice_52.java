class circle {
    public int r;

    circle() {
        System.out.println("I am non param Constructor");
    }

    circle(int a) {
        System.out.println("I am circle's parameterized constructor");
        this.r = a;
    }

    public double area() {
        return Math.PI * this.r * this.r;
    }
}

class cylinder extends circle {
    public int h;

    cylinder(int r, int h) {
        super(r);
        System.out.println("I am a cylinder's parametrized constructor");
        this.h = h;
    }

    public double volume() {
        return Math.PI * this.r * this.r * this.h;
    }
}

public class Prctice_52 {
    public static void main(String[] args) {

        // problem 1
        // circle c = new circle(10);
        // System.out.println(c.area());

        cylinder b = new cylinder(10, 10);

    }
}
