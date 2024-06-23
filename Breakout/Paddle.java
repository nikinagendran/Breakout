import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;

public class Paddle {
    //instance variables 
    private int width, height; 
    private Color color; 
    private int xPos, yPos; 
    private int speedX; 
    private Breakout breakout;


    //constructor 
    public Paddle(Breakout out){
        breakout = out; 
        width = 100;
        height = 35; 
        color = Color.CYAN; 
        xPos = 100; 
        yPos = 400; 
        speedX = 0; 
    }

    public void paint(Graphics g){
        g.setColor(color); //allows to color the ball 
        g.fillRect(xPos,yPos,width, height); // should draw the ball 
        
    }
    public void keyPressed(KeyEvent e) {// checking to see if a key is pressed 
       if (e.getKeyCode() == 37) {
            speedX = -7;
       }
       if (e.getKeyCode() == 39){
            speedX = 7; 
       }
        
    }

    public void keyReleased(KeyEvent e) {// checking to see if the key is released 
       speedX = 0; 
    }
    //used to draw the ball and you are creating it 
    //this is the blueprint of the ball 


    public void move(){
        if (xPos + speedX > 0 && xPos + speedX < breakout.getWidth()-width){ // 1 greater than 0 
            xPos = xPos + speedX;
        }
        // if (xPos + speedX > breakout.getWidth()-width){
        //     speedX = -2;
        // }
        // if (xPos + speedX<0){
        //     speedX = 2; 
        // }
        
    }

    //we need to make sure they have a shape and make it an actual object that has a border and an actual shape 
    public Rectangle getBounds(){
        return new Rectangle(xPos, yPos, width, height);
    }

    public boolean collision(){
        return this.getBounds().intersects(breakout.getBall().getBounds());
    }
    // this is like the paddle object 


    //methods 
}
