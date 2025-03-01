
import java.awt.*;
import java.awt.geom.*;

public class Fire implements DrawingObject {
    private int x, y, originalx;
    private double scale;
    private boolean drawable, attack;

    public Fire(double scale, int x, int y) {
        this.scale = scale;
        this.x = x;
        this.y = y;
        originalx = x;
        drawable = false;
        attack = false;
    }

    public void setStartFireX(int x){
        originalx = x;
    }

    public int getOrigX(){
        return originalx;
    }

    public void draw(Graphics2D g2d){
        if (drawable){
            AffineTransform reset = g2d.getTransform();
            g2d.translate(x, y);
            g2d.scale(scale, scale);

            Circle basicCircle = new Circle(-80, -90, 180, 180, new Color(255, 87, 87));
            Circle middleCircle = new Circle(-67, -69, 153, 153, new Color(255, 145, 77));
            Circle highlCircle = new Circle(-55, -50, 130, 130, new Color(255, 189, 89));

            basicCircle.draw(g2d);
            middleCircle.draw(g2d);
            highlCircle.draw(g2d);

            g2d.setTransform(reset);
        }

        if (attack){
            update();
        }
    }

    public void setDrawable(boolean d){
        drawable = d;
    }

    public void setAttacking(boolean a){
        attack = a;
    }

    public void setX(int x){
        this.x = x;
    }

    public void update(){
        setX(x+7);
        if (x >= 350){
            drawable = false;
            attack = false;
            x = originalx;
        }
    }

    public void draw2(Graphics2D g2d){
        if (drawable){
            AffineTransform reset = g2d.getTransform();
            g2d.translate(x, y);
            g2d.scale(scale, scale);

            Circle basicCircle = new Circle(-80, -90, 180, 180, new Color(255, 87, 87));
            Circle middleCircle = new Circle(-67, -69, 153, 153, new Color(255, 145, 77));
            Circle highlCircle = new Circle(-55, -50, 130, 130, new Color(255, 189, 89));

            basicCircle.draw(g2d);
            middleCircle.draw(g2d);
            highlCircle.draw(g2d);

            g2d.setTransform(reset);
        }

        if (attack){
            update2();
        }
    }

    public void update2(){
        setX(x+10);
        if (x >= -35){
            drawable = false;
            attack = false;
            x = originalx;
        }
    }
}