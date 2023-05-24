package org.example;

public class Circle extends Shape {

    Coords coordsA;
    Coords coordsB;


    public String paint() {
        return "yellow";
    }

    public double calculateArea() {

        return Math.PI * (sqr(twoPointsDisatce(coordsA, coordsB)));
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * twoPointsDisatce(coordsA, coordsB);

    }


    public String toString() {

        return "I am Circle ";
    }


    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }
        Circle c = (Circle) obj;
        if (this.calculateArea() == c.calculateArea() && this.color == c.color) {
            System.out.println("having same area");
            return true;
        } else
        return false;

    }

}

