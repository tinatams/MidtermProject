import java.awt.*;
import java.awt.geom.AffineTransform;

public class LetterN implements DrawingObject{
    private double x, y, scale;
    private Color color;

    public LetterN(double x, double y, double scale, Color color){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x, y);

        Square vertBlock = new Square(0, 0, 23, 180, color);
        Square vertBlock2 = new Square(103, 0, 23, 180, color);
        Line diagBlock = new Line(20, 14, 106, 165, 21, color);

        vertBlock.draw(g2d);
        vertBlock2.draw(g2d);
        diagBlock.draw(g2d);

        g2d.setTransform(reset);
    }
}