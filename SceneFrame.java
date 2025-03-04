/**
    SceneFrame contains GUI components of the program. Also contains inner classes that handles
    events such as Mouse and Keyboard events. Allows for continuous repainting of SceneCanvas to 
    allow for movement/ changes of SceneCanvas to be seen. 
 
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
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class SceneFrame{
    private JFrame frame;
    private SceneCanvas sc;
    private Container c;
    private JLabel label;

    /**
        Instantiate GUI components (JFrame, JLabel, SceneCanvas) for the GUI of program. 
    **/
    public SceneFrame(){
        frame = new JFrame();
        c = frame.getContentPane();
        label = new JLabel();
        sc = new SceneCanvas();
    }
    
    /**
        Sets up the elements of the JFrame, sets bounds for JLabel to be used as a button for end screen. 
    **/
    public void setUpGUI() throws InterruptedException{
        frame.setTitle("Midterm Project - Llamas - Uy");
        c.setBackground(new Color(115, 39, 71));
        frame.addKeyListener(new AL());
        
        label.setBounds(310, 281, 180, 180);
        label.setBackground(Color.RED);
        label.setOpaque(false);
        label.addMouseListener(new ML());
        
        frame.add(label);
        frame.add(sc);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        render();
    }

    /**
        AL extends Abstract class KeyAdaptor to act as a keyboard listener. Used check on KeyEvents
        (to check when a key is pressed) that are passed to update method of SceneCanvas.
    **/
    public class AL extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
            sc.update(e);
        }
    }

    /**
        ML extends Abstract class MouseAdaptor to act as a mouse listener. Used check on MouseEvents
        (to check when mouse is clicked) and resets SceneCanvas.
    **/
    public class ML extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            if (sc.getTimeToReset()){
                frame.remove(sc);
                sc = new SceneCanvas();
                frame.add(sc);
                frame.revalidate();
                frame.repaint();

                render();
            }  
        }
    }

    /**
        Uses a Timer object to schedule SceneCanvas to be continuously repainted using TimerTask object, 
        until SceneCanvas game is over and needs to be reset. 
    **/
    public void render(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                if (!sc.getTimeToReset()){
                    sc.repaint();
                } else {
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 9);
    }

    
}

