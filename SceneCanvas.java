/**
    SceneCanvas extends JComponent and is the 'canvas' object that contains majority of the animations.
    It does this by having instances of objects that can be drawn (implement DrawingObjet interface) and 
    draws them out to create out scene. 
 
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
    private ArrayList<DrawingObject> endScreen;

    private Player user;
    private Mob npc; 
    private HealthBar npcHealth;
    private HealthBar userHealth ;
    private Fire fireBall;

    private boolean ableAttack;
    private boolean scheduleAttack;
    private boolean gameOver, timeToReset;
    private ArrayList<DrawingObject> background_highlights;

    private Random rand = new Random();
    

    /**
        Sets the preferred size of the canvas, as well as instanciates and sets original object values. 

        ableAttack = false
        scheduleAttack = false
        gameOver = false
        timeToRest = false
     **/
    public SceneCanvas(){
        setPreferredSize(new Dimension(800,600));
        endScreen = new ArrayList<DrawingObject>();
        endScreen.add(new LetterE(172.1, 55, 1, Color.BLACK));
        endScreen.add(new LetterD(504.9, 55, 1, Color.BLACK));
        endScreen.add(new LetterN(325.3, 55, 1, Color.BLACK));
        endScreen.add(new PlayButton(310, 281, 1, Color.black, Color.white));

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

	    background_highlights= new ArrayList<DrawingObject>();
        background_highlights.add(new Crescent(200,130,new Color(252, 174, 25)));
        background_highlights.add(new Crescent(240,190,new Color(252, 174, 25)));
        background_highlights.add(new Crescent(200,240,new Color(252, 174, 25)));
        background_highlights.add(new Crescent(240,300,new Color(252, 174, 25)));
        background_highlights.add(new Crescent(200,360,new Color(252, 174, 25)));

    }

    /**
        If the game is over will paint the end screen with a play button, with the cave background behind the 
        END and PlayButton. While the game is still going, will draw the mob, player, and health bar objects. 
        Checks states of player and npc objects to modify the state of the game (gameOver, drawable of objects).
    **/
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh); //makes the rendering smoother
        AffineTransform reset = g2d.getTransform();
        
        if (gameOver){
            cave.draw(g2d);
            for(int i=0;i<4;i++){
                background_highlights.get(i).draw(g2d);
                g2d.translate(500, 25);
                background_highlights.get(i).draw(g2d);
	            g2d.translate(-500, -25);
            }
            
            Rectangle2D.Double over = new Rectangle2D.Double(0, 0, 800, 600);
            g2d.setColor(new Color(94, 76, 74, 128));
            g2d.fill(over);

            for (DrawingObject object : endScreen){
                object.draw(g2d);
            }
            timeToReset = true;
        } else {
            cave.draw(g2d);
            for(int i=0;i<4;i++){
                background_highlights.get(i).draw(g2d);
                g2d.translate(500, 25);
                background_highlights.get(i).draw(g2d);
	            g2d.translate(-500, -25);
            }
            user.draw(g2d);
            if (npc.getDrawable()){
                npc.draw(g2d);
                fireBall.draw(g2d);  
            }

            g2d.scale(-1, 1);
            userHealth.draw(g2d);
            g2d.setTransform(reset);

            npcHealth.draw(g2d);
        }

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

    /**
        Updates the positions, actions, and states of various drawable components. 
        Handles 'animations' and movement, including changes in a character's pose or action.
         Responsible for updating character states and fields, such as reducing an NPC's 
         health when an attack action is triggered within a valid attack area.
     **/
    public void update(KeyEvent e){
        user.update(e);

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

    /**
        Schedules a random attack for the mob object/ enemy object. This is done through scheduling a task
        to be done after a randomized amount of time (between 2-8 seconds). It then sets up a timer to make 
        the attak (fireball), seen 1 second before the attack is carried out as a warning for a oncoming attack. 
     **/
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

        int randomInterval = (rand.nextInt(8-2) + 2) * 1000;
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

    /** 
		Gets the current state of the game and if it needs to be reset (ex: if either of the players died)
		@return boolean to represent if the Scene is over and needs to be reset
	**/
    public boolean getTimeToReset() {
        return timeToReset;
    }

}
