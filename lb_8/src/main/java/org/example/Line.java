package org.example;

public class Line implements GraphicObject, Graphic{
    private int x1, y1, x2, y2;

    public Line (int x1, int y1, int x2, int y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем линию от точки (" + x1 + "," +y1 +") до точки (" + x2 +"," + y2 +")");
    }
}