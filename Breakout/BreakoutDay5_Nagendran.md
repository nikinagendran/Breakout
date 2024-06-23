# Breakout Day 5 


### Breakout.java  
```java 
import java.util.ArrayList;
public class Breakout extends JPanel { 
    private ArrayList<Block> blocks;
    public Breakout(int w, int h){
        blocks = new ArrayList<Block>();
        makeGrid();
    }
    public void paint(Graphics g){
        for (int x = 0; x<blocks.size(); x++){
            blocks.get(x).paint(g); 
        }
    }
    public void makeGrid(){
        for(int row = 0; row<5; row++){
            xOffset = 0; 
            for(int col = 0; col<10; col++){
                blocks.add(new Block(0,0,Color.RED,10));
                int red = (int)(Math.random()* 256);
                int purple= (int)(Math.random()* 256);
                int green= (int)(Math.random()* 256);
                xOffset += 60;
            }
            yOffset += 50;
        }
    }
}

```
1. import java.util.ArrayList; -> ArrayList is imported so we can add to an array 

2. private ArrayList < Block > blocks; -> This is where we are going to create the array list and this holds all the blocks we are going to build in the class ArrayList 

3. blocks = new ArrayList < Block >(); -> This is built in the constructor is this instanciates the object blocks in the class array list so we can use it in the class 

4. public void makeGrid() -> This makes the method for the makeGrid and this method will help us populate the grid of blocks 

5. for(int row = 0; row<5; row++) -> This is the loop that will create the 5 rows of blocks 

6. for(int col = 0; col<10; col++) -> This is the loop in the loop that creates 10 columns of blocks 

7. makeGrid(); -> This calls the makeGrid method so it can run 

8. blocks.add(new Block(xOffset,yOffset,Color.RED,10)); -> This adds 50 blocks through the loop with the xOffset and the yOffset  and have a color red and the point value will be a 10

9. for (int x = 0; x< blocks.size(); x++) -> This takes the blocks that are currently on the screen and goes through all the blocks and the blocks.get(x).paint(g); -> this is nested in the loop and this paints all the blocks that are currently on the screen 

10. int xOffset = 0; and int yOffset = 0; -> These variables will allow us to place the blocks in the posistions we want them to be placed

11. xOffset += 100; -> The xoffset will make sure that the block will space ot a 100 in the x direction and yOffset += 50; -> This will make sure that the block will space out down 50 in the y direction to create some space between the 50 blocks 

12. int red = (int)(Math.random()* 256); + int purple= (int)(Math.random()* 256); + int green= (int)(Math.random()* 256); -> This creates the colors with a range of 0-255 in rgb 

13. blocks.add(new Block(xOffset,yOffset,new Color(red, purple, green),10)); -> this adds the blocks with the set xOffset and yOffset and creates the different colors with a pointvalue of a 10 




