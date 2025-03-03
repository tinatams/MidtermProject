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
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    // put this so that it initializes inside of constructor;
    Background cave;
    private ArrayList<DrawingObject> assests;
    private ArrayList<DrawingObject> endScreen;

    private Player user;
    private Mob npc; 
    private HealthBar npcHealth;
    private HealthBar userHealth ;
    private Fire fireBall;

    private boolean ableAttack;
    private boolean scheduleAttack;
    private boolean gameOver, timeToReset;

    private Random rand = new Random();
    

    public SceneCanvas(){
        endScreen = new ArrayList<DrawingObject>();
        setUpEndScreen();

        cave = new Background();

        user= new Player(0,-10);
        npc = new Mob(40, 325, 0.5); 
        npcHealth = npc.getHealthBar();
        userHealth = user.getHealthBar();
        fireBall = new Fire(150, 400, 0.3);

        ableAttack = false;
        scheduleAttack = false; 
        gameOver = false;
        timeToReset = false;

    }

    public void setUpEndScreen(){
        endScreen.add(new LetterE(172.1, 55, 1, Color.BLACK));
        endScreen.add(new LetterD(504.9, 55, 1, Color.BLACK));
        endScreen.add(new LetterN(325.3, 55, 1, Color.BLACK));
        endScreen.add(new PlayButton(310, 281, 1, Color.black, Color.white));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother
        AffineTransform reset = g2d.getTransform();
        
        if (gameOver){
            cave.draw(g2d);
            Rectangle2D.Double over = new Rectangle2D.Double(0, 0, 800, 600);
            g2d.setColor(new Color(94, 76, 74, 128));
            g2d.fill(over);
            for (DrawingObject object : endScreen){
                object.draw(g2d);
            }
            timeToReset = true;
        } else {
            cave.draw(g2d);
            user.draw(g2d);
            if (npc.getDrawable()){
                npc.draw(g2d);
                fireBall.draw(g2d);  
            }

            g2d.scale(-1, 1);
            userHealth.draw(g2d);
            g2d.setTransform(reset);

            npcHealth.draw(g2d);

            if (!scheduleAttack && (npc.dead()!= true)){
                scheduleAttack();
            }

            if (user.getHealth() <= 0){
                user.setDrawable(false);
            }

            if (npc.getDrawable() == false || user.getDrawable() == false){
                gameOver = true;
            }
        }
    }

    public void update(KeyEvent e){
        user.update(e);
        npc.update(e);

        if (user.getX() < -270){
            ableAttack = true;
        }
        else{
            ableAttack = false;
        }

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_Z && ableAttack){
            npc.takeDamage(15);
        } else if (code == KeyEvent.VK_X && ableAttack){
            npc.takeDamage(10);
        } 

        if (npc.getHealth() <= 0 && npc.dead() != true){
            npc.setVersion(181);
            npc.dead();
        } 
    }

    public void scheduleAttack(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override 
            public void run(){
                if (npc.dead() != true){
                    fireBall.setAttacking(true);
                    npc.setVersion(61); 
                    if (ableAttack) user.takeDamage(30);
                    scheduleAttack = false;
                }
            }
        };

        int randomInterval = (rand.nextInt(8-2) + 3) * 1000;
        timer.schedule(task, randomInterval );
        scheduleAttack = true;

        Timer timer2 = new Timer();
        TimerTask task2 = new TimerTask(){
            @Override 
            public void run(){
                if (npc.dead() != true){
                    fireBall.setDrawable(true);
                }
            }
        };

        timer2.schedule(task2, (randomInterval - 1000));
    }

    public boolean getTimeToReset() {
        return timeToReset;
    }

}