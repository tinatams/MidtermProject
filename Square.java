import java.awt.*;
import java.awt.geom.*;

public class Square implements DrawingObject{
    private double x, y, w, h;

    public Square(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double square = new Rectangle.Double(x, y, w, h);
        g2d.setColor(Color.BLACK);
        g2d.fill(square);
    }

    @Override
    public void adjustX(double distance) {

    }
}