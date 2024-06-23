# Breakout Day 4 

### Ball.java 
```java
public class Ball {
    private Breakout breakout;
    public Ball(Breakout out, int r, Color c){
        breakout = out;
        speedY = 2; 
    }
    public void move(){
        if (xPos + speedX > breakout.getWidth()-radius){
            speedX = -2;
        }
        if (xPos + speedX<0){
            speedX = 2; 
        }
         if (yPos + speedY > breakout.getHeight()-radius){
            speedY = -2;
        }
        if (yPos + speedY<0){
            speedY = 2; 
        }
        yPos = yPos + speedY; 
    } 
}

```
1. private Breakout breakout; -> We create a breakout variable with a private to allow for a future 2 way communication between the ball and window 

2. public Ball(Breakout out, int r, Color c) -> This adds Breakout out as one of the parameters so we can use it in the constructor and it instanciates the object 

3. breakout = out; -> this allows for communication/access to the breakout objecct (attributes and methods) and initializes the statement 

4. if (xPos + speedX > breakout.getWidth()-radius) -> This is an if then statement and is used for the movement of the ball to bounce from the right wall and it states that the xPos and velocity added together must be greater that the width of the JPanel subtracted from the radius 

4. speedX = -2; -> This is the then statement of the if statement and this tells if the line above is true(statement 4) then the velocity will go -2 which means it will bounce of the right wall. 

5. if (xPos + speedX<0) -> This is the if statement checking to see if the x posistion and the velocity of the x direction isless than 0 so the is the point in which it touched the left wall

6. speedX = 2; -> This the then statement for statement 5 and if the statement above is true, then the ball will hit the left wall and bounce back into the positive direction in the x range 

7. speedY = 2;  -> This sets the velocity of the y to a 2 and it initializes the velocity of the ball to a positive 2

8.   if (yPos + speedY > breakout.getHeight()-radius) -> This is an if then statement and is used for the movement of the ball to bounce from the bottom wall and it states that the xPos and velocity added together must be greater that the height of the JPanel subtracted from the radius 

9. speedY = -2; => This is the then statement of the if statement and this tells if the line above is true(statement 8) then the velocity of the y will go in the -2 direction and this bounces from the bottom wall 

10. if (yPos + speedY<0) -> This is the if statement checking to see if the y posistion and the velocity of the y  direction is less than 0 so the is the point in which it touches the top wall 

11.  speedY = 2; -> This is the else statement of statement 10 and if statement 10 is true then the ball will touch the top wall and start going to the bottom 

12. yPos = yPos + speedY; -> This will make sure that every time the posistion moves the velocity will be added to the y posistion which means that this is the code that will make the ball move in the y direction 

### Breakout.java 
```java
 public Breakout(int w, int h){
    ball = new Ball(this, 50,Color.BLUE);
    paddle = new Paddle(this);

    public Breakout(int w, int h){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
        
            }

            @Override
            public void keyPressed(KeyEvent e) {
                paddle.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
               paddle.keyReleased(e);
            }
        });
        setFocusable(true);
    }
}

```
1. ball = new Ball(this, 50,Color.BLUE); -> "this" is the same as self in python and is added as a parameter and it represents the obejct that got made with the breakout class

2. paddle = new Paddle(this); -> "this" is added as one of the arguments and it represents the new object from the breakout class that got made in the paddle 

3. import java.awt.event.KeyListener; -> This imports the event key listener so we can access all the methods and the code recognizes what it is 

4. addKeyListener new KeyListener() -> This allows for the event to show and make a base so that a key pressed could have an effect on the code. The add listener adds a listere for the keys 

5. setFocusable(true); -> This statement makes sure that we dont have to touch the panel and makes the jpanel have focus when it loads, and if it isnt called, then you have to manually select it. This method makes sure when the game starts, the panel is the focused object 

6. public void keyPressed(KeyEvent e) -> This method checks to see if a key is pressed 

7. public void keyReleased(KeyEvent e) -> This method checks to see if a key is released 

8. System.out.println(e.getKeyCode()); -> This prints out the keycode of the key that is pressed 

9. e -> The e is an event that comes in each time a key is pressed and holds alot of data that can be accessed 

10. paddle.keyPressed(e); -> This allows for the breakout to access the function of key pressed in paddle and we are calling it in breakout 

11. paddle.keyReleased(e); -> This allows for the breakout to access the function of key released in paddle and we are calling it in breakout 


### Paddle.java
```java
public class Paddle {
    import java.awt.event.KeyEvent;
    private Breakout breakout;

    public Paddle(Breakout out){
        breakout = out;
        speedX = 0; 
    }
    
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode()); 
    }

    public void keyPressed(KeyEvent e) { 
       if (e.getKeyCode() == 37) {
            speedX = -2;
       }
       if (e.getKeyCode() == 39){
            speedX = 2; 
       }
        
    }
    public void keyReleased(KeyEvent e) {
       speedX = 0; 
    }

    public void move(){
        if (xPos + speedX > breakout.getWidth()-width){
            speedX = -2;
        }
        if (xPos + speedX<0){
            speedX = 2; 
        }
    }
    public void move(){
        if (xPos + speedX > 0 && xPos + speedX < breakout.getWidth()-width){
            xPos = xPos + speedX;
        }
    }
}

``` 
1. private Breakout breakout; -> We create a breakout variable with a private to allow for a future 2 way communication between the paddle and window

2. public Paddle(Breakout out) -> In the constructor, we pass in the argument of Breakout out so we can use it later in the constructor the initialize the breakout object 

3. breakout = out; -> This allows for communication/access to the breakout objecct (attributes and methods) and initializes the statement

4.  if (xPos + speedX > breakout.getWidth()-width) -> This is an if then statement and is used for the movement of the paddle to bounce from the right wall and it states that the xPos and velocity added together must be greater that the width of the JPanel subtracted from the width of the paddle  

5. speedX = -2; -> This is the then statement of the if statement and this tells if the line above is true(statement 4) then the velocity will go -2 which means the paddle will bounce of the right wall.

6. if (xPos + speedX<0) -> This is the if statement checking to see if the x posistion and the velocity of the x direction is less than 0 so the is the point in which it touched the left wall

7. speedX = 2; -> This the then statement for statement 6 and if the statement above is true, then the paddle will hit the left wall and bounce back into the positive direction in the x range

8. System.out.println("In paddle class" + e.getKeyCode()); -> This prints out the the paddle class and key code together to identify the keys easier because we dont want to confuse the keys in breakout 

9. speedX = 0; -> in the constructor this means that the paddle does not move 

10.  if (e.getKeyCode() == 37) -> If the key code 37 is pressed and if this statement is true, then speedX = -2; -> the paddle will move to the left 

11. if (xPos + speedX<0) is true and the key code 39 is pressed which is the right arrow then speedX = 2; -> the paddle will move to the rigth direction 

12. speedX = 0;  -> this tells us that if the right or left arrow is not pressed the the paddle will the move and the velocity will be 0 

13. if (xPos + speedX > 0 && xPos + speedX < breakout.getWidth()-width) -> This states that if the posistion added to the speed is greater than 0 and the posistion added to speed is less than the width subtracted by the width of the paddle then, xPos = xPos + speedX; -> the object will move and if it is not true, the object will not move 