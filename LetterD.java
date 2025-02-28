import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class LetterD implements DrawingObject{
    private double x, y, scale;
    private Color color;

    public LetterD(double x, double y, double scale, Color color){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x, y);

        Square vertBlock = new Square(0, 0, 23, 180, color);
        vertBlock.draw(g2d);

        // this works but when paiting in DrawingCanvas it will draw on TOP of the background could be a problem lawl
        // Circle outerCircle = new Circle(-76.8, -0.9, 180, 180, color);
        // Circle innerCircle = new Circle(-76.8, 20.3, 155.3, 137.6, new Color(238, 238, 238));
        // Square removeStuff = new Square(-166, 0, 168, 180, new Color(238, 238, 238));
        
        // outerCircle.draw(g2d);
        // innerCircle.draw(g2d);
        // removeStuff.draw(g2d)

        Path2D.Double arc = new Path2D.Double();
        arc.moveTo(0,0);
        arc.curveTo(115, -8, 121, 55, 125.4, 90);
        arc.curveTo(123, 117, 131.4, 185, 0, 179);
        arc.lineTo(0, 149);
        arc.curveTo(138, 182.6, 122, 1, 0, 30);
        arc.lineTo(0, 0);
        arc.closePath();

        g2d.setColor(color);
        g2d.fill(arc);

        g2d.setTransform(reset);
    }
}