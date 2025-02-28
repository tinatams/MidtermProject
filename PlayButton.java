import java.awt.*;
import java.awt.geom.AffineTransform;

public class PlayButton{
    private double x, y, scale, rotation;
    private Color baseColor, playColor;

    public PlayButton(double x, double y, double scale, Color baseColor, Color playColor){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.baseColor = baseColor;
        this.playColor = playColor;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x, y);

        Circle base = new Circle(0 ,0, 180, 180, baseColor);
        RightTri tri = new RightTri(110, 90, 1.2, playColor);
        tri.setRot(135);

        base.draw(g2d);
        tri.draw(g2d);

        g2d.setTransform(reset);
    }

}