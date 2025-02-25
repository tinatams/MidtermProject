import java.awt.*;
import java.awt.geom.*;

public class Mob {
    private int x;
    private int y;
    private int size;

    public Mob(int size, int x, int y) {
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public void drawFrame(Graphics2D g2d){
        Path2D.Double baseBlob = new Path2D.Double();
        baseBlob.moveTo(317, 466);
        baseBlob.curveTo(196, 464, 93, 39, 226, 191);
        g2d.draw(baseBlob);
    }

}