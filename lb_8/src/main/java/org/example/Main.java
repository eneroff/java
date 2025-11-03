package org.example;

public class Main {

    public static void main (String[] args){
        GraphicObject line = new Line(10, 20,100, 200);
        GraphicObject circle = new Circle(50,50, 30);

        line.draw();
        circle.draw();
    }
}