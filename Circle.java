import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Circle implements DrawingObject {
    private double x, y, w, h;

    public Circle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, w, h);
        g2d.setColor(Color.BLACK);
        g2d.fill(circle);
    }

    @Override
    public void adjustX(double distance) {

    }


}
