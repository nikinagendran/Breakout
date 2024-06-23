import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Breakout extends JPanel { //extends allows to inherit everything from JPanel and Jpanel is an object taht we will amke to contain all the pieces, the blocks, balls and paddles 
    //each time we write a new class, we have to strat with instance variable, contructor, methods + write it to keep it constant 

    //instance variables 

    private int width, height;
    private Ball ball; //to get access to ball inside this class + to keep it as the same ball object  
    //private means they cnanot be accessed outside the class
    //declatrion statement with 2 defining variables 
    //without the width and height, we dont have an actual panel  
    //Jpanel gives me access to method that I can just use 
    private Paddle paddle; 
    // private Block block; 
    // private Block blockTwo;
    private ArrayList<Block> blocks;
    //arror is where we are going tos tore the array list 
    //this makes multiple blcoks and holds all the blocks that we are going to build 
    //ArrayList is a class 
    private int p;

    private Breakout out;
    private boolean var;



    //constructor 
    public Breakout(int w, int h, int p){
        width = w;
        height =  h;
        p = p;
        var = true; 

        setSize(width,height);
        //setsize -> can change with whatever width and height is put in 
        setLocation(95,75);
        //setlocation takes in an x and y or a point 
        setBackground(Color.PINK);
        //sets the background to a color 
        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        //DONT HAVE TO WRITE IN MD FILE 

        ball = new Ball(this, 30,Color.BLUE);// this is the same as self in python and it represents the obejct that got made with the breakout class
        paddle = new Paddle(this);
        // block = new Block(10,20,Color.RED,10);
        // blockTwo = new Block(100,20,Color.RED,10);

        //instanciates the object which is blocks 
        blocks = new ArrayList<Block>();
        makeGrid();

        


        
        //makes instance of ball class and stores it as ball, it has to parameters which the ball has the radius of 50 and has a color of blue 

        //key listener is an event for a key to be pressed and released and the code knows what the key is meant to do 
        //method in jpanel called at key listener 

        addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
        
            }

            @Override
            public void keyPressed(KeyEvent e) {// checking to see if a key is pressed 
                paddle.keyPressed(e); // this allows for 
            }

            @Override
            public void keyReleased(KeyEvent e) {// checking to see if the key is released 
               paddle.keyReleased(e);
            }
            
        });
        setFocusable(true); // you dont have to touch the panel 
        //e is the venet that comes in each time a key is pressed 



    }
    //they have to be public but it can be used outside of the class
    //Breakout is the class name and we are putting uin 2 parameters 
    //initialization statement to declare the width and height 
    //the contructor is where the initilaization happens but if we don't do this, it will not work 
    

    //methods 
    @Override //tells you to overide the Jpanel + this tells thet program to use the one inside thce class instead of outside + overrides java's paint method 
    public void paint(Graphics g){
     
        super.paint(g); //super lets us access the method inside the JPanel + paint allows for us not to have a flicker on the panel + g is the variable or value that has been passed in 
        ball.paint(g); //allows for the drawing of the ball 
        paddle.paint(g);
        // block.paint(g);
        // blockTwo.paint(g);

        //have paint method for oainting all the blocks 
        for (int x = 0; x<blocks.size(); x++){ //this will go through the arry list and paint the blocks every single time 
            blocks.get(x).paint(g); 
            if (blocks.get(x).collision()){
                blocks.remove(x);
                x--;
                ball.setspeedY(2);
                p++;
                System.out.println(p);
            }
        }

        if (paddle.collision()) {
           System.out.println("Paddle Hit"); 
           ball.setspeedY(-2);
        }
    }
    //paint is the name of the method + void method + public shows that it can eb sued outside the class
    
    public void move(){
        ball.move();
        paddle.move();
        
    }

    public void makeGrid(){ //this method is where we are going to populate a grid of blocks 
        int xOffset = 0; //these variables are going to allow us to plave the blocks in the posistions we want them to be  
        int yOffset = 0; 


        for(int row = 0; row<5; row++){ // this iterates the row 5 times 
            xOffset = 0; //the first block will always be places the left side 
            for(int col = 0; col<10; col++){
                // how to store the blocks in the array list 
                //this will change the colors for the blocks and Math is a static class and int red, purple, green are declaring the statement and the random will add any color 
                int red = (int)(Math.random()* 256); //range 0 - 255
                int purple= (int)(Math.random()* 256);
                int green= (int)(Math.random()* 256);

                blocks.add(new Block(this,xOffset,yOffset,new Color(red, purple, green),10));
                xOffset += 60; // this will change the posistion of the next block in the x direction 
                 

            }
            yOffset += 50;
        }
        System.out.println(blocks.size());
    }


    //allow us to communicate between objects to objects 
    //the following are called getters/accessor methods 
    //getters allow you to get instance variables outside the class 

    public Ball getBall(){
        return ball; 
    }
    
    public Paddle getPaddle(){
        return paddle; 
    }

    public ArrayList<Block> getBlocks(){
        return blocks; 
    }

    public int getScore(){
        return p;
    }

    public boolean getVar(){
        return var;
    }

    public void setVar(){
        var = false;
    }


    
    
    
    //public needs to be accessoed ot of the class + Ball 

}
