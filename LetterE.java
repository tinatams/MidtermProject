import java.awt.*;
import java.awt.geom.AffineTransform;

public class LetterE implements DrawingObject{
    private double x, y, scale;
    private Color color;

    public LetterE(double x, double y, double scale, Color color){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x, y);

        Square vertBlock = new Square(0,0, 23, 180, color);
        Square horizBlock = new Square(0, 0, 105.4, 23, color);
        Square horizBlock2 = new Square(0, 70, 78.5, 23, color);
        Square horizBlock3 = new Square(0, 157, 105.4, 23, color);

        vertBlock.draw(g2d);
        horizBlock.draw(g2d);
        horizBlock2.draw(g2d);
        horizBlock3.draw(g2d);

        g2d.setTransform(reset);
    }
}