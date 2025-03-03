import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class SceneFrame{
    public JFrame frame;
    private SceneCanvas sc;
    private Container c;
    public JLabel label;

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
        frame.add(sc);

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
            if (sc.timeToRest){
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
                if (!sc.timeToRest){
                    sc.repaint();
                } else {
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 9);
    }

    
}

