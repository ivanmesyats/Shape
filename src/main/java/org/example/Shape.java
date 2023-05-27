package org.example;
abstract class  Shape {

    public Shape() {
    }

    public abstract double calculateArea ();

    double sArea;

    private String color;


    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }



//    public double calculateArea() {
//        return 0;
//    }



    public double calculatePerimeter() {
        return 0;
    }

    public double sqr(double a) {
        return a * a;
    }

    ;

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
//            return true;
//        }

        Shape c = (Shape) obj;
        if (this.calculateArea() == c.calculateArea() && this.getColor() == c.getColor()) {
            System.out.println("having same area");
            return true;
        } else
            return false;
    }


}