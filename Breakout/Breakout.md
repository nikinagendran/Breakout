# Breakout in Java

### Game.java

Create a Java file that will be the entry point into the Breakout game we will make.

```java
public class Game{
    public static void main(String[] args){
        Window win = new Window();
    }
}
```
public class Game - It creates the class of the file and is needed to access the file

public static void main(String[] args) - The main method lets us get the entry point for executing the program in java and it is the first thing the compiler looks for when running the program. 

Window win = new Window(); This constructs a window object. Window(This is a data type->class name) + win(object name or reference name) + = (assignment operator) + new(instanciates the object) + Window() - (window is the constructor of the class we want to make the object from)



### Window.java 

```java
public class Window extends JFrame{
    public class Window{
        public Window(){
            setSize(800, 600);
            setLayout(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }
}
```
public class Window extends JFrame -> This allows for a relationship to happen between the Window and the JFrame called a "is-a" relationship; Window is a JFrame. This also declares that anything inside the JFrame class can be used in the window class.

1.public Window() This is an constructor that is used to initialize instance variables and in this case,use methods from the JFrame class to make a visible window to play the game of breakout

2.setSize(800,600); This method accepts the parameters which are width and height which are also integer values and this method defines the the size of the window and is also a void method 

3.setTitle("Breakout - Nagendran); This method sets the title of the application/window and takes in a string value to display on the window 

4.setLayout(null); This method takes in null and this allows the method to place things at particular x and y posistions on the window 

5.setLocationRelativeTo(null); This method takes in null and the null in this method allows for the window's relative location to be centered on the screen when the program first runs 

6.setResizable(false); This method allows to resize the window but the value we took in was false making sure that the window cannot resize in differnt widths and heights

7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); This method lets us close the window when we click on the "x" button on the window. The argument atken in states that when you close the window, the program will also close and this argument was taken from the JFrame class. 

8.setVisible(true); This method takes in the argument of true which allows for the window to be seen. This method has to be the last line in the code so everything above the line can be visible.



