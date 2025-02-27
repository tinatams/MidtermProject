import java.awt.*;
import java.awt.geom.*;

public class Cresent implements DrawingObject{
    public int x, y;
    public Color color;
    public double scale;

    public Cresent(int x, int y, double scale, Color color){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();
        g2d.scale(scale, scale);

        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 180, 180);
        g2d.setColor(color);
        g2d.fill(circle);

        Ellipse2D.Double circle2 = new Ellipse2D.Double(x - 110, y - 76, 236.5, 236.5);
        g2d.setColor(new Color(238, 238, 238));
        g2d.fill(circle2);

        g2d.setTransform(reset);
    }
}