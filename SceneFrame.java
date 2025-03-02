import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SceneFrame extends JPanel{
    private JFrame frame= new JFrame();
    private SceneCanvas sc=new SceneCanvas();
    private Container c=frame.getContentPane();
    private EndScreen end = new EndScreen(800, 600);

    public SceneFrame(){

    }
    
    public void setUpGUI() throws InterruptedException {
        frame.setSize(800, 600);
        frame.setTitle("Midterm Project - Llamas - Uy");
        frame.add(sc);
        frame.addKeyListener(new AL());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        while(true){
            sc.repaint();
            Thread.sleep(9);
        }

    }

    public class AL extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
            sc.update(e);
        }
    }

    }

