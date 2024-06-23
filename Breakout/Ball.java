
//blueprint to our ball object     
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Rectangle;
public class Ball {
    //instance variables 
    
    private int radius; 
    private Color color;
    private int speedX, speedY;
    private int xPos, yPos; 
    private Breakout breakout; //allow for 2 way communication between ball and window 
    
    //dictates how big it is going to be 

    

    //constructor 
    //Breakout out instanciates the object 
    public Ball(Breakout out, int r, Color c){
        breakout = out; //this allows for communication/access to the breakout objecct (attributes and methods)
        radius = r; 
        color = c;
        xPos = 95; 
        yPos = 50;
        speedX = 2; 
        speedY = 2; 
        
    }
    //the contstructor allows for the initilization of the items which can be changed and used anywhere + if i dont initilize these, the default will be a 0 




    //methods 
    public void paint(Graphics g){
        g.setColor(color); //allows to color the ball 
        g.fillOval(xPos,yPos, radius, radius); // should draw the ball 
        
    }
    //used to draw the ball and you are creating it 
    //this is the blueprint of the ball 
        

    public void move(){
        if (xPos + speedX > breakout.getWidth()-radius){
            speedX = -6;
        }
        if (xPos + speedX<0){
            speedX = 6; 
        }
        if (yPos + speedY > breakout.getHeight()-radius){
            speedX = 0; 
            speedY = 0;
            //  - This auto closes the window 
            breakout.setVar();
            breakout.setVisible(false);

            
             
        }
        if (yPos + speedY<0){
            speedY = 6; 
        }
        xPos = xPos + speedX;
        yPos = yPos + speedY; 
    }

    private void add(Label label1) {
    }




    private void setVisible(boolean b) {
    }




    public Rectangle getBounds(){
        return new Rectangle(xPos, yPos, radius, radius);
    }

    //settor or mutator method 
    //changes the value of the instance variable 
    //setter sets the data/changes the data 

    public void setspeedY(int yVel){
        speedY = yVel;
    }

}




