import java.awt.*;
import java.awt.geom.*;

public class RightTri{
    private double x, y, scale, rotation;
    private Color color;

    public RightTri(double x, double y, double scale, Color color){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();

        g2d.setColor(color);
        g2d.rotate(Math.toRadians(rotation), x, y);

        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(x, y);
        triangle.lineTo(x+50, y);
        triangle.lineTo(x, y+50);

        g2d.setColor(color);
        g2d.fill(triangle);

        g2d.setTransform(reset);
    }

    public void setRot(double rotation){
        this.rotation = rotation;
    }

}