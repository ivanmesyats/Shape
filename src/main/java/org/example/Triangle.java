package org.example;
public class Triangle extends Shape {
   Coords coordsA;
   Coords coordsB;
   Coords coordsC;

    public Triangle () {

        color = Color.RED;

    }
    public double  calculateArea() {
        sArea = Math.abs((coordsB.x - coordsA.x) * (coordsC.y - coordsA.y) - (coordsC.x - coordsA.x)* (coordsB.y - coordsA.y))/2;
        return sArea;
    }

    public double  calculatePerimeter()  {
        return  twoPointsDisatce(coordsA,coordsB) + twoPointsDisatce(coordsB,coordsC) + twoPointsDisatce(coordsC,coordsA);
    }

    public String toString () {
        return "I am Triangle";
    }

    public int hashCode() {

        return 123;
    }


}
