import java.awt.*;
import java.awt.geom.*;

public class Triangle implements DrawingObject {
    public double x, y, b, h;

    public Triangle(double x, double y, double b, double h) {
        this.x = x;
        this.y = y;
        this.b = b;
        this.h = h;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Path2D.Double p = new Path2D.Double();
        p.moveTo(x,y);
        p.lineTo(x,y+h);
        p.lineTo(x+b,y+h);
        p.lineTo(x,y);
    }

    public void draw(Graphics2D g2d, Color color) {
        Path2D.Double p = new Path2D.Double();
        p.moveTo(x,y);
        p.lineTo(x,y+h);
        p.lineTo(x+b,y+h);
        p.lineTo(x,y);
        g2d.setColor(color);
        g2d.fill(p);
    }



}
