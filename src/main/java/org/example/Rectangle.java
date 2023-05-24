package org.example;
public class Rectangle extends Shape {
    Coords coordsA;
    Coords coordsB;
    Coords coordsC;
    //Coords coords4;
    public double  calculateArea() {
        return (twoPointsDisatce(coordsA,coordsB)) * (twoPointsDisatce(coordsB, coordsC));
    }

    public double  calculatePerimeter()  {
        return 2*(twoPointsDisatce(coordsA,coordsB)+twoPointsDisatce(coordsB, coordsC));
    }

    public String toString () {

        return "I am Rectangle ";
    }

    public int hashCode() {

        return 321;
    }

    public boolean equals(Object obj ) {
        if (!super.equals(obj)) {
            return false;
        }

        Rectangle c = (Rectangle) obj;
        if (this.calculateArea() == c.calculateArea() && this.color == c.color) {
            System.out.println("having same area");
            return true;
        } else
        return false;
    }

}
