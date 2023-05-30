package org.example;

public class Circle extends Shape {

    Coords coordsA;
    Coords coordsB;

    public Circle () {

        color = Color.BLUE;

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

    public int hashCode() {

        return 111;
    }

}

