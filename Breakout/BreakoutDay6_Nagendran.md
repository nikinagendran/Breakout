# Breakout Day 6 

### Paddle.java 
```java
import java.awt.Rectangle;
public Rectangle getBounds(){
   return new Rectangle(xPos, yPos, width, height);     
}
public boolean collision(){
    return this.getBounds().intersects(breakout.getBall().getBounds());
}

```
1. import java.awt.Rectangle; -> This imports the rectangle so we can aceess it in the class 

2. public Rectangle getBounds() -> This is a return method to make sure the image becomes an shape and an actual rectangle object with borders 

3. return new Rectangle(xPos, yPos, width, height); -> This is made so we can later check to see if other objects intersect the boundaries of this object and this is why we added a new object that is given a x and y posistion and also the width and height and this will create a boundary and it is invisible

4. public boolean collision() -> This is a method checking to see if the ball hits the paddle 

5. return this.getBounds().intersects(breakout.getBall().getBounds()); -> This allows for us the access the balls intersection between the paddle and the ball using the public method we created in breakout and that is why we can use other objects in the object class. The statement only returns true or false. 

### Block.java 
```java 
import java.awt.Rectangle;
private Breakout breakout;
public Block(Breakout out){
    breakout = out;
}
public Rectangle getBounds(){
    return new Rectangle(xPos, yPos, width, height);
}
 public boolean collision(){
    return this.getBounds().intersects(breakout.getBall().getBounds());
}

```
1. import java.awt.Rectangle; -> This imports the rectangle so we can aceess it in the class of block 

2. public Rectangle getBounds() -> This is a return method to make sure the image which are the blocks becomes an shape and an actual rectangle object with borders 

3. return new Rectangle(xPos, yPos, width, height); -> This is made so we can later check to see if other objects intersect the boundaries of of the blocks and this is why we added a new object that is given a x and y posistion and also the width and height and this will create a boundary and it is invisible

4. private Breakout breakout; -> We called breakout so we can connect between the classes and we put breakout=out; in the constructor to instanciate the object and we put Breakout out as a parameter so we can use it in the constructor 

5. public boolean collision() -> This is a method that will detect a collision on the border of the blocks and return this.getBounds().intersects(breakout.getBall().getBounds()); -> Will check for the interaction between the blocks 


### Ball.java 
```java 
import java.awt.Rectangle;
public Rectangle getBounds(){
    return new Rectangle(xPos, yPos, radius, radius);
}
public void setspeedY(int yVel){
    speedY = yVel;
}


```
1. import java.awt.Rectangle; -> This imports the rectangle java awt so we can aceess it in the class of ball

2. public Rectangle getBounds() -> This is a return method to make sure the image which is the ball becomes an shape and an actual rectangle object(/circle) with borders 

3. return new Rectangle(xPos, yPos, radius, radius); -> This is made so we can later check to see if other objects intersect the boundaries of of the ball and this is why we added a new object that is given a x and y posistion and also the radius for the ball and this will create a boundary and it is invisible

4.  -> This is a setter method and it will allow us to change the direction of the object by trying to change the y velocity and the speedY = yVel; will set the speed we originally had with the new integer that we will place in breakout.java 


### Breakout.java 
```java 
public Ball getBall(){
    return ball; 
}

public Paddle getPaddle(){
    return paddle; 
}

public ArrayList<Block> getBlocks(){
    return blocks; 
}

if (paddle.collision()) {
    System.out.println("Paddle Hit"); 
    ball.setspeedY(-2);
}
if (blocks.get(x).collision()){
    blocks.remove(x);
    x--;
    ball.setspeedY(2);
}
blocks.add(new Block(this,xOffset,yOffset,new Color(red, purple, green),10));

```
1. public Ball getBall() -> This is a method for the ball so the ball can be accessed from different objects and classes 

2. return ball; -> This returns the ball and it is the instance variable and allows us to get the instance variable outside breakout.java  

3. public Paddle getPaddle() -> This is a method for the paddle so the paddle can be accessed from differnt objects 

4. return paddle; -> This returns the paddle and is an instance variable and this allows for the access pof the paddle from the other pbects 

5. public ArrayList< Block> getBlocks() -> This method allows us to access all the blocks in the other classes 

6. return blocks; -> This will return the blocks and is an instance variable so we can access the blocks in the object classes too 

7. if (paddle.collision()) -> This allows us to check if the ball crosses the paddle boundary and we use System.out.println("Paddle Hit"); to check if it crosses or touches the boundaries as when it touches the boundaries and goes through, it will start spamming "paddle hit" and when it hits it ball.setspeedY(-2); -> The ball will move in the opposite direction

8. blocks.add(new Block(this,xOffset,yOffset,new Color(red, purple, green),10)); -> We added this because we instanciated the breakout object in ball so we added it here so the this represents the block 

9. if (blocks.get(x).collision()); -> This will check if the ball hits the block which is at a specific posistion and blocks.remove(x); -> This will remove the bllocks once it has been hit and ball.setspeedY(2); -> this will change the direction of the ball after it hits the block 

10. x--; -> The index of the ball will change when the ball touches 2 of the blocks 