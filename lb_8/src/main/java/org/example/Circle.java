package org.example;

public class Circle implements GraphicObject {
    private int centerX, centerY, radius;

    public Circle (int centerX, int centerY, int radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }

    @Override
    public void draw(){
        System.out.println("Рисуем круг с центом в (" +centerX + ","+ centerY+ ") и радиусом "+ radius);
    }
}