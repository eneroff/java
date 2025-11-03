package Graphics;

import java.awt.Graphics;

public class Circle extends GraphicObject{
    private int x, y, radius;

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;}

    @Override
    public void draw (Graphics g){
        g.drawOval(x-radius, y-radius, radius*2, radius*2);
    }
}