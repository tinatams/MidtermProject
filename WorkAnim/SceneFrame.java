import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SceneFrame {
    JFrame frame;
    SceneCanvas dc;

    public SceneFrame(){
        frame = new JFrame();
        dc = new SceneCanvas();
    }

    public void setUpGUI() throws InterruptedException {
        frame.setSize(800, 600);
        frame.setTitle("Drawing in Java");
        frame.add(dc);
        frame.addKeyListener(new AL());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        while(true){
            dc.repaint();
            Thread.sleep(7);

        }

    }

    public class AL extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            dc.update(e);
        }
    }



}
