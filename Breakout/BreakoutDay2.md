# Breakout Day 2 

### Ball.java
```java
import java.awt.Color;
import java.awt.Graphics;
public class Ball {
    private int radius; 
    private Color color;
    private int speedX, speedY;

    public Ball(int r, Color c){
        radius = r; 
        color = c;
        speedX = 5; 
    }

    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(100,100, radius, radius);
    }
}

```

1. import java.awt.Color; -> This lets us access all the material in Color which was already prewritten(to access colors)

2. import java.awt.Graphics; -> This allows us to access all the material in Graphics which is prewritten 

3. public class Ball -> This is a class of Ball so we can write the attributes of a ball 

4. private int radius -> This cannot be used in other classes and it initializes the radius of the ball is an int and it is also an instance variable 

5. private Color color; -> This cannot be used in other classes and it initializes the color of the ball is an Color and it is also an instance variable 

6. private int speedX, speedY; -> This cannot be used in other classes and it initializes the speed of the x and y of the ball and it is also an instance variable

7. public Ball(int r, Color c) -> This allows the class to take in 2 parameters which are the int and color 

8. radius = r; -> This declates the radius of the ball to an r 

9. color = c; -> This declates the color of the ball to an c

10. speedX = 5; -> This declates the speedX of the ball to an 5

11. public void paint(Graphics g) -> This is used to draw the ball and create it and it is the blueprint of the ball 

12. g.setColor(color); -> This allows us to color the ball 

13. g.fillOval(100,100, radius, radius); -> This allows us to create the ball with a height and a width of 100 and takes in 2 parameters of an radius 




### Breakout.java

```java
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
public class Breakout extends JPanel {
    private int width, height;
    private Ball ball;

    public Breakout(int w, int h){
        width = w;
        height = h;

        setSize(width,height);
        setLocation(95,75);
        setBackground(Color.PINK);
        setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        ball = new Ball(50,Color.BLUE);

    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        ball.paint(g);
    }

}


```
1. import javax.swing.JPanel -> Lets us get access to all the methods in JPanel which we can use. 

2. import java.awt.Color -> This lets us access all the material in Color which was already prewritten(to access colors)

3. import javax.swing.BorderFactory -> This lets us access all the things in BorderFactory which was precreated for us to use

4. public class Breakout extends JPanel -> Breakout is a JPanel. This also declares that anything inside the JPanel class can be used in the Breakout class. The public allows for anything inside the class to be used anywhere else. 

5. private int width, height; -> The private means that it can be only used inside the class and we are declaring the integer for the width and height of the screen

6. private Ball ball; -> This allows us to get access to the ball inside this class and to keep it as the same ball object 

7. public Breakout(int w, int h) -> Public means that anything inside this class can be used anywhere else. The int w, int h are the parameters we are giving so it can be used inside the class. This lets us construct the class. 

8. width = w; This declares the width to be set to the value of w and it will be automatically set to 0 if we do not change the value

9. height = h; This declares the height to be set to the value of h and it will be automatically set to 0 if we do not change the value 

10. setSize(width,height); -> This allows use to chnage the width and height of panel we will be putting on the frame 

11. setLocation(95.75); -> This allows us to set posistion to an x and y value on the screen 

12. setBackground(Color.PINK); -> This sets the background color of the object to pink

13. ball = new Ball(50,Color.BLUE); -> This makes the isntance of the ball class and stores it as a ball. It inputs the parameters of a radius of 50 and the color of the ball is blue. ball is the object name or reference name, = is the assignment operator, new instanciates the object and the Ball(50,Color.BLUE) is what we are trying to make with 2 parameters which are the radius and the color. This reemphasizes the Ball object. 

14. @Override -> This tells you to override the JPanel + tells the program to use the one inside the class instead of outside the class and it overrides java's paint method. 

15. public void paint(Graphics g) -> The public lets us use this in other classes and it is a voud method. This takes in the parameters of Graphics g and creates the method of paint. 

16. super.paint(g) -> super lets us access the method inside the JPanel and paint allows for us to not have a flicker in the panel. G is the value or variable that has been passed in 

17. ball.paint(g) -> This allows the ball to be drawn on the screen 


### Window.java 

```java 
public class Window extends JFrame{
    public Window(){
        Breakout out  = new Breakout(600,450);
        add(out);
    }
}


```

1. Breakout out = new Breakout(600,450); -> Breakout is the declartion so it is the class name, out is the object name or refernce name, = is the assignment operator, new instanciates the object and Breakout(600,450) is the constructor of the class we want to make the object from which takes to arguments of 600 and 450 which are the width and height. This makes the breakout object. 

2. add(out); -> This adds the new object "out" to the window. 

