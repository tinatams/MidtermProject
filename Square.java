import java.awt.*;
import java.awt.geom.*;

public class Square implements DrawingObject{
    public double x, y, w, h;
    public Color color = Color.BLACK;

    public Square(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

     public Square(double x, double y, double w, double h, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double square = new Rectangle.Double(x, y, w, h);
        g2d.setColor(color);
        g2d.fill(square);
    }

}