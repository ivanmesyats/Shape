package org.example;
public class Shape {

    public Shape() {
    }

    double sArea;

    public String color = "blue";

    public double calculateArea() {
        return 0;
    }

    ;

    public double calculatePerimeter() {
        return 0;
    }

    public String paint() {
        color = "green";
        return color;
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
            return true;
        }

    }