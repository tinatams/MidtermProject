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
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class SceneFrame{
    private JFrame frame;
    private SceneCanvas sc;
    private Container c;
    private JLabel label;

    public SceneFrame(){
        frame = new JFrame();
        c = frame.getContentPane();
        label = new JLabel();
        sc = new SceneCanvas();
    }
    
    public void setUpGUI() throws InterruptedException{
        frame.setSize(800, 600);
        frame.setTitle("Midterm Project - Llamas - Uy");
        c.setBackground(new Color(115, 39, 71));
        frame.addKeyListener(new AL());
        
        label.setBounds(310, 281, 180, 180);
        label.setBackground(Color.RED);
        label.setOpaque(false);
        label.addMouseListener(new ML());
        
        frame.add(label);
        sc.setPreferredSize(new Dimension(800,600));
        frame.add(sc);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        render();
    }

    public class AL extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
            sc.update(e);
        }
    }

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

