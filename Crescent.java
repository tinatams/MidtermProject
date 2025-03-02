import java.awt.*;
import java.awt.geom.*;

public class Crescent implements DrawingObject {
    public double x, y;

    public Crescent(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Path2D.Double crv = new
        Path2D.Double();
        crv.moveTo(x,y);
        crv.curveTo(x-100,y-100 ,x+100,y-100,x+200,y);

    }

    public void draw(Graphics2D g2d, Color color) {
        Path2D.Double crv = new
        Path2D.Double();
        crv.moveTo(x,y);
        crv.curveTo(x-60,y-50 ,x-20,y-50,x+80,y);
        g2d.setColor(color);
        g2d.fill(crv);

        Path2D.Double crv1 = new
        Path2D.Double();
        crv1.moveTo(x,y+5);
        crv1.curveTo(x-10,y-40 ,x-50,y-40,x+90,y+5);
        g2d.setColor(new Color(200, 96, 78));
        g2d.fill(crv1);
    }



}
