/**
	Player class that has fields of name and health points. Has the method takeDamage, which makes the player take damage
	
	@author Martina Amale M. Llamas (242648); INSERT ZOE INFO
	@version February 11, 2025
	
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
import java.awt.geom.AffineTransform;

public class Player {
    private HealthBar health= new HealthBar();
    private String name;

    private int x;
    private int y;
    private int version;
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Player(int x, int y){
        this.x = x;
        this.y = y;
        version = 1;
        speed = 15;

    }


    public void draw(Graphics2D g2d){
        if (version == 60){
            version = 1;
        }
        if (version <= 30){
            drawFrame1(g2d);
        } else if (version < 60){
            drawFrame2(g2d);
        } 

        version++;
    }
    public void takeDamage(int amount){
        health.setCurrentHealth(health.getCurrentHealth()-amount); 
    }


    public int getHeath(){
        return health.getCurrentHealth();
    }

    public void update(KeyEvent e){
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_D){
            move(speed);
        }

        else if (code == KeyEvent.VK_A){
            move(-speed);
        }
    }

    public void move(int moving){
        x += moving;
    }


    public void drawFrame1(Graphics2D g2d){
        Circle head = new Circle(630.69+x, 233.78+y, 45, 45);
        Circle left_hand = new Circle(604.61+x, 300.84+y, 29, 29);
        Circle right_hand = new Circle(602.39+x, 280.21+y, 29, 29);
        Circle left_elbow= new Circle(639.23+x, 316.44+y, 29, 29);
        Circle left_shoulder= new Circle(653.21+x, 286.41+y, 29, 29);


        Circle upper_torso= new Circle(647.14+x, 277.25+y, 41.9, 41.9);
        Circle mid_torso= new Circle(640.5+x, 334+y, 41.9, 118.4);
        Circle lower_torso= new Circle(661.13+x, 352.9+y, 41.9, 41.9);

        Circle left_knee= new Circle(630.69+x, 407.15+y, 29, 29);
        Circle right_knee= new Circle(682.08+x, 415.06+y, 29, 29);
        Circle left_foot= new Circle(607.69+x, 453+y, 29.5, 29.5);
        Circle right_foot= new Circle(722.18+x, 453+y,29.5, 29.5);

        Square l_left_arm= new Square(613.4+x,313.48+y,40.14,20.61);
        Square u_left_arm= new Square(641.62+x,303.8+y,45.64,22.96);
        Square right_arm= new Square(609.85+x,302.33+y,40,20);

        Square left_leg= new Square(594.07+x,409.51+y,105.97,30.13);
        Square u_right_leg= new Square(666.88+x,391.44+y,48.16,25.55);
        Square l_right_leg= new Square(692.04+x,434.33+y,48.16,27.92);

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

        mid_torso.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+x+40.14/2),(313.48+y+20.61/2));
        l_left_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x+45.64/2),(303.8+y+22.96/2));
        u_left_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(41),609.85+x+40/2,302.33+y+20/2);
        right_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-60),594.07+x+105.97/2,409.51+y+30.13/2);
        left_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(82.9),666.88+x+48.16/2,391.44+y+25.55/2);
        u_right_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-136.5),692.04+x+48.16/2,434.33+y+27.92/2);
        l_right_leg.draw(g2d);

        g2d.setTransform(originalTransform);
    }

    public void drawFrame2(Graphics2D g2d){
        double x1=-21.25+x;
        double y1=-6.18+y;
        double move_x,move_y;
        
        Circle head = new Circle(630.69+x1, 233.78+y1, 45, 45);
        Circle left_hand = new Circle(604.61+x1, 300.84+y1, 29, 29);
        Circle right_hand = new Circle(602.39+x1, 280.21+y1, 29, 29);
        Circle left_elbow= new Circle(639.23+x1, 316.44+y1, 29, 29);
        Circle left_shoulder= new Circle(653.21+x1, 286.41+y1, 29, 29);


        Circle upper_torso= new Circle(647.14+x1, 277.25+y1, 41.9, 41.9);
        Circle mid_torso= new Circle(640.5+x1, 334+y1, 41.9, 118.4);
        Circle lower_torso= new Circle(661.13+x1, 352.9+y1, 41.9, 41.9);

        Circle left_knee= new Circle(606.59+x, 395.76+y, 29, 29);
        Circle right_knee= new Circle(670.08+x, 413.06+y, 27, 27);
        Circle left_foot= new Circle(606.39+x, 455.94+y, 29.5, 29.5);
        Circle right_foot= new Circle(712.18+x, 453+y,29.5, 29.5);

        Square l_left_arm= new Square(613.4+x1,313.48+y1,40.14,20.61);
        Square u_left_arm= new Square(641.62+x1,303.8+y1,45.64,22.96);
        Square right_arm= new Square(609.85+x1,302.33+y1,40,20);

        Square u_left_leg= new Square(610.07+x,379.2+y,48.16,25.55);
        Square l_left_leg= new Square(593.23+x,424.02+y,55.2,27.92);
        Square u_right_leg= new Square(645.3+x,388.34+y,64.12,27.55);
        Square l_right_leg= new Square(678.44+x,435.03+y,56.36,26.28);

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

        mid_torso.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+x1+40.14/2),(313.48+y1+20.61/2));
        l_left_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x1+45.64/2),(303.8+y1+22.96/2));
        u_left_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(41),609.85+x1+40/2,302.33+y1+20/2);
        right_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(129),610.07+x+48.16/2,379.2+y+25.55/2);
        u_left_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(90),593.23+x+55.2/2,424.02+y+27.92/2);
        l_left_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(72),645.3+x+64.12/2,388.34+y+27.55/2);
        u_right_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(43),678.44+x+56.36/2,435.03+y+26.28/2);
        l_right_leg.draw(g2d);

        g2d.setTransform(originalTransform);
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

