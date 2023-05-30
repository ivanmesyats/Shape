package org.example;

public class Main {
    public static void main(String[] args) {

        //cricle

        Circle circle = new Circle();
        Circle circle2 = new Circle();

        circle2.color = Color.GREY;


        //circle2.paint();

        circle.coordsA = new Coords(5,2);
        circle.coordsB = new Coords(10,1);

        circle2.coordsA = new Coords(5,2);
        circle2.coordsB = new Coords(10,1);

        //   Triangle
        Triangle triangle = new Triangle();

        triangle.coordsA = new Coords(5,2);
        triangle.coordsB = new Coords(10,1);
        triangle.coordsC = new Coords(20,1);


        //   rectangle
        Rectangle rectangle = new Rectangle();

        rectangle.coordsA = new Coords(0,0);
        rectangle.coordsB = new Coords(2,0);
        rectangle.coordsC = new Coords(2,4);


        //array

        Shape[] myArray = new Shape[4];
        myArray[0] = circle;
        myArray[1] = circle2;
        myArray[2] = triangle;
        myArray[3] = rectangle;


        for (int i = 0; i < 4; i++) {

                System.out.println(myArray[i].toString() + " my calculated area is " + myArray[i].calculateArea() + " my calculated perimeter is " + myArray[i].calculatePerimeter() + " my HEX(RGB) color is " + myArray[i].color.getCode() + " " + myArray[i].color.toString() );

            }

        if (circle2.equals(circle)) {

            System.out.println("equal objects");
        } else {

            System.out.println("different objects");

        }


    }
}