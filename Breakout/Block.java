import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Block {
    private int width, height, xPos, yPos; 
    private Color color; 
    private int pointValue; 
    private Breakout breakout; // declares a breakout object 


    //contructor 
    public Block(Breakout out, int x, int y, Color c, int pv){
        breakout = out; 
        width = 55; 
        height = 40; 
        xPos = x;
        yPos = y; 
        color = c; 
        pointValue = pv; 
        
    }

    public void paint(Graphics g){
        g.setColor(color); //allows to color the ball 
        g.fillRect(xPos,yPos, width, height); // should draw the ball 
        
    }

    public Rectangle getBounds(){
        return new Rectangle(xPos, yPos, width, height);
    }

    
    public boolean collision(){
        return this.getBounds().intersects(breakout.getBall().getBounds());
    }
}
