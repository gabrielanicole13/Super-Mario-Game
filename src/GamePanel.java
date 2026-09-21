import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener {


    Player player;
    Level level;
    Timer timer;


    public GamePanel(){
        player = new Player();
        level = new Level();
        setFocusable(true);
        addKeyListener(this);
        timer = new Timer(16, e -> {update(); repaint(); });
        timer.start();
    }

    public void update(){
        player.update();
        new CollisionHandler.checkCollision(player, level.getTiles());
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        level.draw(g);
        player.draw(g);
    }

    @Override
    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_LEFT){
            player.moveLeft();
        }else if(code == KeyEvent.VK_RIGHT){
            player.moveRight();
        }else if(code == KeyEvent.VK_SPACE){
            player.jump();
        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        int code = e.getKeyCode();

        if(KeyEvent.VK_LEFT == code || code == KeyEvent.VK_RIGHT){
            player.stop();
        }
    }

    @Override
    public void keyTyped(KeyEvent e){}

}
