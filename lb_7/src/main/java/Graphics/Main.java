package Graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JPanel {
    private final List<GraphicObject> objects = new ArrayList<>();

    public Main() {
        objects.add(new Line(50, 50, 200, 200));
        objects.add(new Circle(300, 150, 50));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (GraphicObject obj : objects) {
            obj.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Графика: Линия и Круг");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.add(new Main());
        frame.setVisible(true);
    }
}