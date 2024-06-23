# Breakout Day 3

### Window.java 
```java
while (true){
    out.move();
    out.repaint();
    try {
        Thread.sleep(30);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
}

```

1. while (true) -> This is a while loop for the game loop that we are going to construct 

2. out.repaint(); -> Repaint is the method that will automatically repaints the window and this affects the breakout object named "out"

3. out.move(); -> This makes sure that the ball actually moves in the window and out is the breakout object and the .move() is affecting the posistion of the object making the object move 

4. Thread.sleep(millis:30); -> There is a class named Thread and this runs concurrently with breakout which causes it to slow down and inside the sleep method which is under the class, it pauses 30 millis which is kind of like 30 frames per second 

5. try {
        Thread.sleep(30);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }  
    -> The try checks to see if the thread is current and is checking for the error and the cath is an interupptive acception and e is an acception and this will catch the error and if it breaks it will print out how it breaks but in our code it runs smoothly because there is no error 





### Ball.java 
```java
private int xPos, yPos; 
public Ball(int r, Color c){
    xPos = 95; 
    yPos = 50;   
}
public void paint(Graphics g){
    g.fillOval(xPos,yPos, radius, radius); 
}
public void move(){
    xPos = xPos + speedX;
}

```

1. public void move() -> this is a public method meaning that it can be used in other classes and is a void and is made to make sure that the ball is going to change the x and y coordinates and move. 

2. private int xPos, yPos; -> They are variables which are integers that will hold the values of the x and y posistions of the ball 

3. xPos = 95; -> Inside the constructor, the xPos is how I initialize the x posistion of the ball and I set it into a 95 

4. yPos = 50; -> Inside the constructor, the yPos is how I initialize the y posistion of the ball and I set it to a 50

5. g.fillOval(xPos,yPos, radius, radius); -> the x and y poistions have been replaced from the original 100, 100 to the new values we have initialized for the x and y values which places the ball at 95,50 

6. xPos = xPos + speedX; -> This will make sure that every time the posistion moves the velocity will be added to th x posistion which means that this is the code that will make the ball move 


### Paddle.java 
```java
import java.awt.Color;
import java.awt.Graphics;
public class Paddle {
    private int width, height; 
    private Color color; 
    private int xPos, yPos; 
    private int xVelocity; 

public Paddle(){
    width = 100;
    height = 35; 
    color = Color.CYAN; 
    xPos = 100; 
    yPos = 400; 
    xVelocity = 2; 
    }

public void paint(Graphics g){
        g.setColor(color); 
        g.fillRect(xPos,yPos,width, height); 
        
    }
    
    public void move(){
        xPos = xPos + xVelocity;
    }

}

```

1. public class Paddle -> This creates a public class named Paddle and this the blueprint for the paddle in the breakout game 

2. private int width, height; -> This is a private integre which cannot be used in other class and used to initialize the width and height 

3. private Color color; -> This cannot be used in other classes and it initializes the color of the ball is an Color and it is also an instance variable 

4. private int xPos, yPos; -> This is a private integer that cannot be called in any other class and initializes  the x posistion and the y posistion 

5. private int xVelocity; This is a private integer and cannot be used in any other class and initializes the xVelocity 

6. import java.awt.Color; -> This lets us access all the material in Color which was already prewritten(to access colors)

7. width = 100; -> This declares the width of the paddle as a 100 in the constructor 

8. height = 35; -> This declares the height of the paddle as a 35 in the constructor 

9. color = Color.CYAN; -> This declares the color of the paddle as CYAN in the constructor

10. xPos = 100; -> This declares the x posistion  of the paddle as 100 in the constructor

11. yPos = 400; -> This declares the y posistion of the paddle as 400 in the constructor

12. speedX = 2; -> This declares the height of the paddle as a 35 in the constructor

13. public void paint(Graphics g) -> This is used to draw the paddle and create it and it is the blueprint of the paddle  

14. g.setColor(color); -> This allows us to color the paddle

15. g.fillRect(xPos,yPos,width, height); -> This makes the paddle into a rectangle and takes in the parameters of the x posistion, y posistion , width and the height 

16. public void move() -> this is a public method meaning that it can be used in other classes and is a void and is made to make sure that the paddle is going to change the x and y coordinates and move. 

17.  xPos = xPos + xVelocity; -> This will make sure that every time the posistion moves the velocity will be added to th x posistion which means that this is the code that will make the ball move 

18. import java.awt.Graphics; -> his allows us to access all the material in Graphics which is prewritten 

### Block.java 
```java
import java.awt.Color;

public class Block {
    private int width, height, xPos, yPos; 
    private Color color; 
    private int pointValue; 


    //contructor 
    public Block(int x, int y, Color c, int pv){
        width = 100; 
        height = 100; 
        xPos = x;
        yPos = y; 
        Color = c; 
        pointValue = pv; 
    }
}


```
1. import java.awt.Color; -> This lets us access all the material in Color which was already prewritten(to access colors)

2. public class Block -> This is the class which lets us initialize the instance variables for Block

3. private int width, height, xPos, yPos; -> This is the private integer thet initializes the width, height, x posistion and y posistion 

4. private Color color;  -> This cannot be used in other classes and it initializes the color of the ball is an Color and it is also an instance variable

5. private int pointValue; -> This is a private integer that initializes the pointValue 

6. public Block(int x, int y, Color c, int pv) -> This is the contructor that takes in the parameters of integer x, integer y, Color c and integer pv 

7.  width = 100; -> This declares the width of the block to be a 100

8. height = 100; -> This declares the height of the block to be a 100

9. xPos = x; -> This declares the x posistion of the block to be x

10. yPos = y; -> This declares the x posistion of the block to be x

11. Color = c; -> This declares the Color of the block to be c 

12. pointValue = pv; -> This declares the pointValue of the block to be pv 





### Breakout.java 
```java
private Paddle paddle; 
private Block block; 
public Breakout(int w, int h){
    paddle = new Paddle();
    block = new Block(0,0,Color.RED,10);
}
public void paint(Graphics g){
    paddle.paint(g);
    block.paint(g);
}



public void move(){
    ball.move(); 
    paddle.move() ;  
}


```
1. public void move() -> This method will conatin any object that will move in the game and also this is to set up way if any code breaks, this path will fix it. 

2. ball.move(); -> ball is the object that got initialized in the beginning and is the one we are affecing and .move() causes for the ball to be affected by the move method that was written in the ball.java

3. private Paddle paddle; This allows us to get access to the paddle inside this class and also create it for adding elements and attributes later on 

4. private Block block; This allows us to get access to the block inside the class and also create it for adding elements and attributes later on 

5. paddle.move(); -> paddle is the object that got initialized in the beginning and we are affecting it with a .move() which will cause the paddle to move and this code was written in the paddle.java 

6. paddle.paint(g); -> This allows for the paddle object to be drawn on the screen 

7. block.paint(g); -> This allows for the block object to be drawn on the screen 

8. paddle = new Paddle(); -> This initializes the paddle object with the new instancinating the object padde 

9. block = new Block(0,0,Color.RED,10); -> This initializes and instanciates the block object and takes in parameters of the x and y posistions which is 0 and the color which is red and the point value which is 10 

