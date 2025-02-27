
import java.awt.*;
import java.awt.geom.*;

public class Fire implements DrawingObject {
    private int x, y;
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();

        // Ellipse2D.Double baseCircle = new Ellipse2D.Double();
        // Ellipse2D.Double midCircle = new Ellipse2D.Double();
        // Ellipse2D.Double highCircle = new Ellipse2D.Double();

        g2d.setTransform(reset);
    }
}