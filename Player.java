/**
    Health Bar Class
 
	@author Martina Amale M. Llamas (242648); Zoe Angeli G. Uy (246707)
	@version March 3, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.*;

public class Player implements Entity{
    private HealthBar health= new HealthBar(this, -785, 15);
    private String name;

    private int x;
    private int y;
    private int version;
    private int speed;

    private boolean drawable;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Player(int x, int y){
        this.x = x;
        this.y = y;
        version = 1;
        speed = 20;
        drawable = true;
    }

    public void draw(Graphics2D g2d){
        if (drawable){
            if (version == 60 || version ==130 || version==200){
                version = 1;
            }
            if (version <= 30){
                drawFrame1(g2d);
            }
            else if (version < 60){
                drawFrame2(g2d);
            } 

            else if (version <= 100){
                drawFrame2(g2d);
            }
            else if (version <= 110){
                PunchFrame1(g2d);
            } 
            else if (version < 130){
                PunchFrame2(g2d);
            }

            else if (version <= 160){
                drawFrame2(g2d);
            }
            else if (version <= 170){
                KickFrame1(g2d);
            } 
            else if (version < 200){
                KickFrame2(g2d);
            }

            version++;
        }
        
    }

    public void takeDamage(int amount){
        health.setCurrentHealth(health.getCurrentHealth()-amount); 
    }

    public double getX(){
        return x;
    }
    public int getHealth(){
        return health.getCurrentHealth();
    }

    public HealthBar getHealthBar(){
        return health;
    }

    public void update(KeyEvent e){
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_D){
            if (x < 80) move(speed);
        }

        else if (code == KeyEvent.VK_A){
            if (x > -380) move(-speed);
        }

        else if (code == KeyEvent.VK_Z){
            version=100;
        } 

        else if (code == KeyEvent.VK_X){
            version=160;
        }
    }

    public void move(int moving){
        x += moving;
    }


    public void drawFrame1(Graphics2D g2d){
        Circle head = new Circle(630.69+x, 233.78+y, 45,new Color(41, 0, 36));
        Circle left_hand = new Circle(604.61+x, 300.84+y,29,new Color(41, 0, 36));
        Circle right_hand = new Circle(605.39+x, 280.21+y,29,new Color(41, 0, 36));
        Circle left_elbow= new Circle(639.23+x, 316.44+y, 29,new Color(41, 0, 36));
        Circle left_shoulder= new Circle(653.21+x, 286.41+y, 29,new Color(41, 0, 36));

        Circle upper_torso= new Circle(647.14+x, 277.25+y, 41.9,new Color(41, 0, 36));
        Ellipse2D.Double mid_torso = new Ellipse2D.Double(640.5+x, 334+y, 41.9, 118.4);
        Circle lower_torso= new Circle(661.13+x, 352.9+y, 41.9,new Color(41, 0, 36));

        Circle left_knee= new Circle(630.69+x, 407.15+y, 29,new Color(41, 0, 36));
        Circle right_knee= new Circle(682.08+x, 415.06+y, 29,new Color(41, 0, 36));
        Circle left_foot= new Circle(607.69+x, 453+y, 29.5,new Color(41, 0, 36));
        Circle right_foot= new Circle(722.18+x, 453+y, 29.5,new Color(41, 0, 36));

        Rectangle2D.Double l_left_arm= new Rectangle2D.Double(613.4+x,313.48+y,40.14,20.61);
        Rectangle2D.Double u_left_arm= new Rectangle2D.Double(641.62+x,303.8+y,45.64,22.96);
        Rectangle2D.Double right_arm= new Rectangle2D.Double(609.85+x,302.33+y,40,20);

        Rectangle2D.Double left_leg= new Rectangle2D.Double(594.07+x,409.51+y,105.97,30.13);
        Rectangle2D.Double u_right_leg= new Rectangle2D.Double(666.88+x,391.44+y,48.16,25.55);
        Rectangle2D.Double l_right_leg= new Rectangle2D.Double(692.04+x,434.33+y,48.16,27.92);

        RenderingHints rh = new
        RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        head.draw(g2d);
        left_hand.draw(g2d);
        right_hand.draw(g2d);
        left_elbow.draw(g2d);
        left_shoulder.draw(g2d);

        upper_torso.draw(g2d);
        lower_torso.draw(g2d);

        right_knee.draw(g2d);
        left_foot.draw(g2d);
        right_foot.draw(g2d);

        AffineTransform originalTransform = g2d.getTransform();

        g2d.rotate(Math.toRadians(-10),347+x,250+y);  // Rotate 10 degrees
        g2d.setColor(new Color(41, 0, 36));
        g2d.fill(mid_torso);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+x+40.14/2),(313.48+y+20.61/2));
        g2d.fill(l_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x+45.64/2),(303.8+y+22.96/2));
        g2d.fill(u_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(41),609.85+x+40/2,302.33+y+20/2);
        g2d.fill(right_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-60),594.07+x+105.97/2,409.51+y+30.13/2);
        g2d.fill(left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(82.9),666.88+x+48.16/2,391.44+y+25.55/2);
        g2d.fill(u_right_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-136.5),692.04+x+48.16/2,434.33+y+27.92/2);
        g2d.fill(l_right_leg);

        g2d.setTransform(originalTransform);
    }

    public void drawFrame2(Graphics2D g2d){
        double x1=-21.25+x;
        double y1=-6.18+y;
        double move_x,move_y;
        
        Circle head = new Circle(630.69+x1, 233.78+y1, 45,new Color(41, 0, 36));
        Circle left_hand = new Circle(604.61+x1, 300.84+y1, 29, new Color(41, 0, 36));
        Circle right_hand = new Circle(602.39+x1, 280.21+y1, 29,new Color(41, 0, 36));
        Circle left_elbow= new Circle(639.23+x1, 316.44+y1, 29,new Color(41, 0, 36));
        Circle left_shoulder= new Circle(653.21+x1, 286.41+y1, 29,new Color(41, 0, 36));

        Circle upper_torso= new Circle(647.14+x1, 277.25+y1, 41.9, new Color(41, 0, 36));
        Ellipse2D.Double mid_torso = new Ellipse2D.Double(640.5+x1, 334+y1, 41.9, 118.4);
        Circle lower_torso= new Circle(661.13+x1, 352.9+y1, 41.9, new Color(41, 0, 36));

        Circle left_knee= new Circle(606.59+x, 395.76+y, 29, new Color(41, 0, 36));
        Circle right_knee= new Circle(670.08+x, 413.06+y, 27, new Color(41, 0, 36));
        Circle left_foot= new Circle(606.39+x, 455.94+y, 29.5, new Color(41, 0, 36));
        Circle right_foot= new Circle(712.18+x, 453+y,29.5, new Color(41, 0, 36));

        Rectangle2D.Double l_left_arm= new Rectangle2D.Double(613.4+x1,313.48+y1,40.14,20.61);
        Rectangle2D.Double u_left_arm= new Rectangle2D.Double(641.62+x1,303.8+y1,45.64,22.96);
        Rectangle2D.Double right_arm= new Rectangle2D.Double(609.85+x1,302.33+y1,40,20);

        Rectangle2D.Double u_left_leg= new Rectangle2D.Double(610.07+x,379.2+y,48.16,25.55);
        Rectangle2D.Double l_left_leg= new Rectangle2D.Double(593.23+x,424.02+y,55.2,27.92);
        Rectangle2D.Double u_right_leg= new Rectangle2D.Double(645.3+x,388.34+y,64.12,27.55);
        Rectangle2D.Double l_right_leg= new Rectangle2D.Double(678.44+x,435.03+y,56.36,26.28);

        RenderingHints rh = new
        RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        head.draw(g2d);
        left_hand.draw(g2d);
        right_hand.draw(g2d);
        left_elbow.draw(g2d);
        left_shoulder.draw(g2d);

        upper_torso.draw(g2d);
        lower_torso.draw(g2d);

        left_knee.draw(g2d);
        right_knee.draw(g2d);
        left_foot.draw(g2d);
        right_foot.draw(g2d);

        AffineTransform originalTransform = g2d.getTransform();

        g2d.rotate(Math.toRadians(-10),347+x1,250+y1);  // Rotate 10 degrees
        g2d.setColor(new Color(41, 0, 36));
        g2d.fill(mid_torso);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+x1+40.14/2),(313.48+y1+20.61/2));
        g2d.fill(l_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x1+45.64/2),(303.8+y1+22.96/2));
        g2d.fill(u_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(41),609.85+x1+40/2,302.33+y1+20/2);
        g2d.fill(right_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(129),610.07+x+48.16/2,379.2+y+25.55/2);
        g2d.fill(u_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(90),593.23+x+55.2/2,424.02+y+27.92/2);
        g2d.fill(l_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(72),645.3+x+64.12/2,388.34+y+27.55/2);
        g2d.fill(u_right_leg);
    
        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(43),678.44+x+56.36/2,435.03+y+26.28/2);
        g2d.fill(l_right_leg);
        g2d.setTransform(originalTransform);

    }

    public void PunchFrame1(Graphics2D g2d){
        double x1=-21.25+x;
        double y1=-6.18+y;
        double move_x,move_y;
        
        Circle head = new Circle(630.69+x1, 233.78+y1, 45,new Color(41, 0, 36));
        Circle left_hand = new Circle(604.61+x1, 300.84+y1, 29,new Color(41, 0, 36));
        Circle right_hand = new Circle(592.39+x1, 282.21+y1, 29, new Color(41, 0, 36));
        Circle left_elbow= new Circle(639.23+x1, 316.44+y1, 29, new Color(41, 0, 36));
        Circle left_shoulder= new Circle(653.21+x1, 286.41+y1, 29, new Color(41, 0, 36));

        Circle upper_torso= new Circle(647.14+x1, 277.25+y1, 41.9, new Color(41, 0, 36));
        Ellipse2D.Double mid_torso = new Ellipse2D.Double(640.5+x1, 334+y1, 41.9, 118.4);
        Circle lower_torso= new Circle(661.13+x1, 352.9+y1, 41.9, new Color(41, 0, 36));

        Circle left_knee= new Circle(606.59+x, 395.76+y, 29, new Color(41, 0, 36));
        Circle right_knee= new Circle(670.08+x, 413.06+y, 27, new Color(41, 0, 36));
        Circle left_foot= new Circle(606.39+x, 455.94+y, 29.5, new Color(41, 0, 36));
        Circle right_foot= new Circle(712.18+x, 453+y,29.5, new Color(41, 0, 36));

        Rectangle2D.Double l_left_arm= new Rectangle2D.Double(613.4+x1,313.48+y1,40.14,20.61);
        Rectangle2D.Double u_left_arm= new Rectangle2D.Double(641.62+x1,303.8+y1,45.64,22.96);
        Rectangle2D.Double u_right_arm= new Rectangle2D.Double(641.62+x1,293.8+y1,45.64,22.96);
        Rectangle2D.Double right_arm= new Rectangle2D.Double(604.85+x1,302.33+y1,40,20);

        Rectangle2D.Double u_left_leg= new Rectangle2D.Double(610.07+x,379.2+y,48.16,25.55);
        Rectangle2D.Double l_left_leg= new Rectangle2D.Double(593.23+x,424.02+y,55.2,27.92);
        Rectangle2D.Double u_right_leg= new Rectangle2D.Double(645.3+x,388.34+y,64.12,27.55);
        Rectangle2D.Double l_right_leg= new Rectangle2D.Double(678.44+x,435.03+y,56.36,26.28);

        RenderingHints rh = new
        RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        head.draw(g2d);
        left_hand.draw(g2d);
        right_hand.draw(g2d);
        left_elbow.draw(g2d);
        left_shoulder.draw(g2d);

        upper_torso.draw(g2d);
        lower_torso.draw(g2d);

        left_knee.draw(g2d);
        right_knee.draw(g2d);
        left_foot.draw(g2d);
        right_foot.draw(g2d);

        AffineTransform originalTransform = g2d.getTransform();

        g2d.rotate(Math.toRadians(-10),347+x1,250+y1);  // Rotate 10 degrees
        g2d.setColor(new Color(41, 0, 36));
        g2d.fill(mid_torso);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+x1+40.14/2),(313.48+y1+20.61/2));
        g2d.fill(l_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x1+45.64/2),(303.8+y1+22.96/2));
        g2d.fill(u_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x1+45.64/2),(293.8+y1+22.96/2));
        g2d.fill(u_right_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(31),604.85+x1+40/2,302.33+y1+20/2);
        g2d.fill(right_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(129),610.07+x+48.16/2,379.2+y+25.55/2);
        g2d.fill(u_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(90),593.23+x+55.2/2,424.02+y+27.92/2);
        g2d.fill(l_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(72),645.3+x+64.12/2,388.34+y+27.55/2);
        g2d.fill(u_right_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(43),678.44+x+56.36/2,435.03+y+26.28/2);
        g2d.fill(l_right_leg);
        g2d.setTransform(originalTransform);

    }

    public void PunchFrame2(Graphics2D g2d){
        double x1=-21.25+x;
        double y1=-6.18+y;
        double move_x,move_y;
        
        Circle head = new Circle(630.69+x1, 233.78+y1, 45, new Color(41, 0, 36));
        Circle left_hand = new Circle(604.61+x1, 300.84+y1, 29, new Color(41, 0, 36));
        Circle right_hand = new Circle(566.39+x1, 285.21+y1, 29, new Color(41, 0, 36));
        Circle left_elbow= new Circle(639.23+x1, 316.44+y1, 29, new Color(41, 0, 36));
        Circle left_shoulder= new Circle(643.21+x1, 284.41+y1, 29, new Color(41, 0, 36));

        Circle upper_torso= new Circle(647.14+x1, 277.25+y1, 41.9, new Color(41, 0, 36));
        Ellipse2D.Double mid_torso = new Ellipse2D.Double(640.5+x1, 334+y1, 41.9, 118.4);
        Circle lower_torso= new Circle(661.13+x1, 352.9+y1, 41.9, new Color(41, 0, 36));

        Circle left_knee= new Circle(606.59+x, 395.76+y, 29, new Color(41, 0, 36));
        Circle right_knee= new Circle(670.08+x, 413.06+y, 27, new Color(41, 0, 36));
        Circle left_foot= new Circle(606.39+x, 455.94+y, 29.5, new Color(41, 0, 36));
        Circle right_foot= new Circle(712.18+x, 453+y,29.5, new Color(41, 0, 36));

        Rectangle2D.Double l_left_arm= new Rectangle2D.Double(613.4+x1,313.48+y1,40.14,20.61);
        Rectangle2D.Double u_left_arm= new Rectangle2D.Double(641.62+x1,303.8+y1,45.64,22.96);
        Rectangle2D.Double right_arm= new Rectangle2D.Double(572.85+x1,288.33+y1,76,20);

        Rectangle2D.Double u_left_leg= new Rectangle2D.Double(610.07+x,379.2+y,48.16,25.55);
        Rectangle2D.Double l_left_leg= new Rectangle2D.Double(593.23+x,424.02+y,55.2,27.92);
        Rectangle2D.Double u_right_leg= new Rectangle2D.Double(645.3+x,388.34+y,64.12,27.55);
        Rectangle2D.Double l_right_leg= new Rectangle2D.Double(678.44+x,435.03+y,56.36,26.28);

        RenderingHints rh = new
        RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        head.draw(g2d);
        left_hand.draw(g2d);
        right_hand.draw(g2d);
        left_elbow.draw(g2d);
        left_shoulder.draw(g2d);

        upper_torso.draw(g2d);
        lower_torso.draw(g2d);

        left_knee.draw(g2d);
        right_knee.draw(g2d);
        left_foot.draw(g2d);
        right_foot.draw(g2d);

        AffineTransform originalTransform = g2d.getTransform();

        g2d.rotate(Math.toRadians(-10),347+x1,250+y1);  // Rotate 10 degrees
        g2d.setColor(new Color(41, 0, 36));
        g2d.fill(mid_torso);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+x1+40.14/2),(313.48+y1+20.61/2));
        g2d.fill(l_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x1+45.64/2),(303.8+y1+22.96/2));
        g2d.fill(u_left_arm);

        g2d.setTransform(originalTransform);
        g2d.fill(right_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(129),610.07+x+48.16/2,379.2+y+25.55/2);
        g2d.fill(u_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(90),593.23+x+55.2/2,424.02+y+27.92/2);
        g2d.fill(l_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(72),645.3+x+64.12/2,388.34+y+27.55/2);
        g2d.fill(u_right_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(43),678.44+x+56.36/2,435.03+y+26.28/2);
        g2d.fill(l_right_leg);

        g2d.setTransform(originalTransform);

    }

    public void KickFrame1(Graphics2D g2d){
        double x1=-21.25+x;
        double y1=-31.18+y;
        double move_x,move_y;
        
        Circle head = new Circle(630.69+x1, 233.78+y1, 45,new Color(41, 0, 36));
        Circle left_hand = new Circle(604.61+x1, 300.84+y1, 29, new Color(41, 0, 36));
        Circle right_hand = new Circle(602.39+x1, 280.21+y1, 29, new Color(41, 0, 36));
        Circle left_elbow= new Circle(639.23+x1, 316.44+y1, 29, new Color(41, 0, 36));
        Circle left_shoulder= new Circle(653.21+x1, 286.41+y1, 29, new Color(41, 0, 36));

        Circle upper_torso= new Circle(647.14+x1, 277.25+y1, 41.9, new Color(41, 0, 36));
        Ellipse2D.Double mid_torso = new Ellipse2D.Double(640.5+x1, 334+y1, 41.9, 118.4);
        Circle lower_torso= new Circle(661.13+x1, 352.9+y1, 41.9, new Color(41, 0, 36));

        Circle left_knee= new Circle(606.59+x, 347.76+y, 29, new Color(41, 0, 36));
        Circle right_knee= new Circle(674.08+x, 402.56+y, 28, new Color(41, 0, 36));
        Circle left_foot= new Circle(606.39+x, 410.94+y, 29.5, new Color(41, 0, 36));
        Circle right_foot= new Circle(712.18+x, 453+y,29.5, new Color(41, 0, 36));

        Rectangle2D.Double l_left_arm= new Rectangle2D.Double(613.4+x1,313.48+y1,40.14,20.61);
        Rectangle2D.Double u_left_arm= new Rectangle2D.Double(641.62+x1,303.8+y1,45.64,22.96);
        Rectangle2D.Double right_arm= new Rectangle2D.Double(609.85+x1,302.33+y1,40,20);

        Rectangle2D.Double u_left_leg= new Rectangle2D.Double(612.07+x,344.2+y,48.16,25.55);
        Rectangle2D.Double l_left_leg= new Rectangle2D.Double(593.23+x,379.02+y,55.2,27.92);
        Rectangle2D.Double u_right_leg= new Rectangle2D.Double(645.3+x,368.34+y,64.12,27.55);
        Rectangle2D.Double l_right_leg= new Rectangle2D.Double(681.44+x,430.03+y,56.36,26.28);

        RenderingHints rh = new
        RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        head.draw(g2d);
        left_hand.draw(g2d);
        right_hand.draw(g2d);
        left_elbow.draw(g2d);
        left_shoulder.draw(g2d);

        upper_torso.draw(g2d);
        lower_torso.draw(g2d);

        left_knee.draw(g2d);
        right_knee.draw(g2d);
        left_foot.draw(g2d);
        right_foot.draw(g2d);

        AffineTransform originalTransform = g2d.getTransform();

        g2d.rotate(Math.toRadians(-10),347+x1,250+y1);  // Rotate 10 degrees
        g2d.setColor(new Color(41, 0, 36));
        g2d.fill(mid_torso);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+x1+40.14/2),(313.48+y1+20.61/2));
        g2d.fill(l_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x1+45.64/2),(303.8+y1+22.96/2));
        g2d.fill(u_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(41),609.85+x1+40/2,302.33+y1+20/2);
        g2d.fill(right_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-19),612.07+x+48.16/2,344.2+y+25.55/2);
        g2d.fill(u_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(90),593.23+x+55.2/2,379.02+y+27.92/2);
        g2d.fill(l_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(72),645.3+x+64.12/2,368.34+y+27.55/2);
        g2d.fill(u_right_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(52),681.44+x+56.36/2,430.03+y+26.28/2);
        g2d.fill(l_right_leg);
        g2d.setTransform(originalTransform);

    }

    public void KickFrame2(Graphics2D g2d){
        double x1=-21.25+x;
        double y1=-31.18+y;
        double r=20;
        double move_x,move_y;
        
        Circle head = new Circle(668.69+x1, 230.78+y1, 45, new Color(41, 0, 36));
        Circle left_hand = new Circle(622.61+x1, 300.84+y1, 29, new Color(41, 0, 36));
        Circle right_hand = new Circle(617.39+x1, 280.21+y1, 29, new Color(41, 0, 36));
        Circle left_elbow= new Circle(640.23+x1, 317.44+y1, 29, new Color(41, 0, 36));

        Circle upper_torso= new Circle(667.14+x1, 280.25+y1, 41, new Color(41, 0, 36));
        Ellipse2D.Double mid_torso = new Ellipse2D.Double(665.5+x1, 282+y1, 41.9, 118.4);
        Circle lower_torso= new Circle(661.13+x1, 352.9+y1, 41, new Color(41, 0, 36));

        Circle right_knee= new Circle(669.08+x, 392.56+y, 28, new Color(41, 0, 36));
        Circle left_foot= new Circle(546.39+x, 300.94+y, 29.5, new Color(41, 0, 36));
        Circle right_foot= new Circle(688.18+x, 453+y,29.5, new Color(41, 0, 36));

        Rectangle2D.Double l_left_arm= new Rectangle2D.Double(623.4+x1,313.48+y1,40.14,20.61);
        Rectangle2D.Double u_left_arm= new Rectangle2D.Double(651.62+x1,303.8+y1,45.64,22.96);
        Rectangle2D.Double right_arm= new Rectangle2D.Double(619.85+x1,302.33+y1,40,20);

        Rectangle2D.Double u_left_leg= new Rectangle2D.Double(552.07+x,320.2+y,124.12,25.55);
        Rectangle2D.Double u_right_leg= new Rectangle2D.Double(620.3+x,390.34+y,124.12,29.55);

        RenderingHints rh = new
        RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        head.draw(g2d);
        left_hand.draw(g2d);
        right_hand.draw(g2d);
        left_elbow.draw(g2d);

        upper_torso.draw(g2d);
        lower_torso.draw(g2d);

        right_knee.draw(g2d);
        left_foot.draw(g2d);
        right_foot.draw(g2d);

        AffineTransform originalTransform = g2d.getTransform();

        g2d.rotate(Math.toRadians(-10+r-5),665.5+x1+41.9/2,282+y1+118.4/2);
        g2d.setColor(new Color(41, 0, 36));
        g2d.fill(mid_torso);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26+r),(623.4+x1+40.14/2),(313.48+y1+20.61/2));
        g2d.fill(l_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9+r),(651.62+x1+45.64/2),(303.8+y1+22.96/2));
        g2d.fill(u_left_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(41+r),619.85+x1+40/2,302.33+y1+20/2);
        g2d.fill(right_arm);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(19),552.07+x+124.12/2,320.2+y+25.55/2);
        g2d.fill(u_left_leg);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(72),620.3+x+124.12/2,390.34+y+29.55/2);
        g2d.fill(u_right_leg);
        g2d.setTransform(originalTransform);

    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean getDrawable() {
        return drawable;
    }

    public void setDrawable(boolean drawable) {
        this.drawable = drawable;
    }
}

