import java.awt.*;
import java.awt.geom.*;


public class Mob implements Entity, DrawingObject{
    // basic stuff
    private int x;
    private int y;
    private int size;
  
    private boolean drawable; 
    private HealthBar health= new HealthBar(this);

    public Mob(int x, int y, double scale) {
        this.x = x;
        this.y = y;
        this.scale = scale;
        version = 1;
        speed = 10;

        drawable = true;
    }

    public void takeDamage(int amount){
        health.setCurrentHealth(health.getCurrentHealth()-amount); 
    }

    public int getHealth(){
        return health.getCurrentHealth();
    }

    public HealthBar getHealthBar(){
        return health;
    }

    public void setDrawable(boolean newSet){
        drawable = newSet;
    }

    public boolean getDrawable(){
        return drawable;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();

        g2d.scale(-1, 1);
        g2d.translate(-68, 60);

        if (health.getCurrentHealth() <= 0){
            drawable = false;
        }

        if (version == 60){
            version = 1;
        } 
        
        if (version <= 30){
            drawFrame3(g2d);
        } else if (version < 60){
            drawFrame1(g2d);
        } 

        version++;
        g2d.setTransform(reset);
    }

    public void update(KeyEvent e){
        int code = e.getKeyCode();

    }

    public void drawFrame1(Graphics2D g2d){
        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother

        AffineTransform reset = g2d.getTransform();
        g2d.translate(-220, -130); //this sets the original placement
        g2d.translate(-x, y); //moves it to where it wants to be on screen
        g2d.scale(scale, scale);

        // base color body
    public Mob(int size, int x, int y) {
        this.size = size;
        this.x = x;
        this.y = y;
    }


}