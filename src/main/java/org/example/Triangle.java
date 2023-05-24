package org.example;
public class Triangle extends Shape {
   Coords coordsA;
   Coords coordsB;
   Coords coordsC;
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

    public boolean equals(Object obj ) {
        if (!super.equals(obj)) {
            return false;
        }

        Triangle c = (Triangle) obj;
        if (this.calculateArea() == c.calculateArea() && this.color == c.color) {
            System.out.println("having same area and same color");
            return true;
        } else
        return false ;
    }


}
