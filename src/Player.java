import java.awt.*;

public class Player {

    double x, y;
    double velocityX, velocityY;
    int width, height;
    boolean isJumping, facingRight;

    final double GRAVITY = 0.8;
    final double MOVE_SPEED = 4;
    final double JUMP_STRENGTH = -12;

    public Player(){
        x = 100.00;
        y = 100.00;
        velocityY = 0;
        velocityX = 0;
        width = 32;
        height = 32;
        isJumping = false;
        facingRight = true;
    }

    public void update(){
        velocityY += GRAVITY;
        y += velocityY;
        x += velocityX;
    }

    public void jump(){
        if(!isJumping){
            velocityY = JUMP_STRENGTH;
            isJumping = true;
        }
    }

    public void moveLeft(){
        velocityX = -4;
        facingRight = false;
    }

    public void moveRight(){
        velocityX = MOVE_SPEED;
        facingRight = true;
    }

    public void stop(){
        velocityX = 0;
    }

    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect((int)x, (int)y, width, height);
    }

    public Rectangle getBounds(){
        return new Rectangle((int)x, (int)y, width, height);
    }
}
