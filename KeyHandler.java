import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    public boolean kick, punch, fireball, forward, backwards;
    private Entity user, npc;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_Z){
            kick = true;
        }
        if (code == KeyEvent.VK_X){
            punch = true;
        }
        if (code == KeyEvent.VK_C){
            fireball = true;
        }
        if (code == KeyEvent.VK_D){
            forward = true;
        }
        if (code == KeyEvent.VK_A){
            backwards = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_Z){
            kick = false;
        }
        if (code == KeyEvent.VK_X){
            punch = false;
        }
        if (code == KeyEvent.VK_C){
            fireball = false;
        }
        if (code == KeyEvent.VK_D){
            forward = false;
        }
        if (code == KeyEvent.VK_A){
            backwards = false;
        }
    }
}