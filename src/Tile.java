import java.awt.*;

public class Tile{

    int x, y;
    boolean solid;
    int width, height;

    public Tile(int x, int y){
        this.x = x;
        this.y = y;
        width = 32;
        height = 32;
        solid = true;
    }

    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillRect((int)x, (int)y, width, height);
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, width, height);
    }
}
