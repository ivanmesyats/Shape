package org.example;
abstract class  Shape {

    public Shape() {
    }

    public abstract double calculateArea ();

    double sArea;

    public Color color;


    public double calculatePerimeter() {
        return 0;
    }

    public double sqr(double a) {
        return a * a;
    }



    public double twoPointsDisatce(Coords coords1, Coords coords2) {

        return Math.sqrt(sqr(coords2.x - coords1.x) + sqr(coords2.y - coords1.y));
    }

    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }


        Shape c = (Shape) obj;
        if (this.calculateArea() == c.calculateArea() && this.color == c.color) {
            System.out.println("having same area");
            return true;
        } else
            return false;
    }

}