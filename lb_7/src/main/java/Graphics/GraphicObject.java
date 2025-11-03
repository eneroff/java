package Graphics;

import java.awt.Graphics;

public abstract class GraphicObject {
    public abstract void draw(Graphics g);

    private String name = "Название";

    public GraphicObject(){
        this.name = name;
    }

    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}