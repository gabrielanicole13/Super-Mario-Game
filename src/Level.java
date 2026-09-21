import java.awt.*;
import java.util.List;

public class Level {

    List<Tile> tiles;

    public Level(){
        for(int i = 0; i < 800; i+= 32){
            tiles.add(new Tile(i, 500));
        }
    }

    public void draw(Graphics g){
        for(Tile t : tiles){
            t.draw(g);
        }
    }

    public List<Tile> getTiles(){
        return tiles;
    }

}
