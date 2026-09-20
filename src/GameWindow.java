
import javax.swing.JFrame;

public class GameWindow extends JFrame{
    GamePanel gamePanel = new GamePanel();

    public GameWindow(){
        setTitle("Super Mario");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
