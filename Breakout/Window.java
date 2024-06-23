import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{
    //window and Jframe relationship is called an "is-a" relationship 
    //allows to have access to jframe 

    //structure of a class that can be used as an object(every class has this setup)
    

    //instance variables - variables that are related to the object 

    //constructor - this is where the instance variables get initialized 
    Label l1;
    Label l2; 
    public Window(){ // is a constructor that is used to initialize instance variables and in this case,use methods from the JFrame class to make a visible window to play the game of breakout
        setSize(800, 600);
        //this sets the width and the height of the window which are int values and it is a void
        //is a mthod that accepts to parameters which are width and height in inetger values and this method defines the size of the window and is a void method
        Timer timer = new Timer();
       
        
        


        setTitle("Breakout - Nagendran");
        //this sets the title on the window 
        setLayout(null);
        //this allows to place things at particular posistions to the screen 
        setLocationRelativeTo(null);
        //the null on the relative location makes sure the window appears in the middle of the screen 
        setResizable(false);
        //this makes sure we can't resize the window so it will stay in the same shape as we declared it 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this lets us close the application when we press the "x" button on the application
        
        //make a breakout object 
        Breakout out  = new Breakout(600,475,0);
        add(out); //adds the object to the window 

        
               
        setVisible(true);
        //setvisible needs to be the last line so everything above it is visible
        //this line of code makes sure that the window actually apperas and the boolean value makes sure the window appears
        
        l1 = new Label("Score");
        l1.setBounds(0,0,800,60);
        l1.setFont(new Font("Verdana", Font.PLAIN, 50));
        l1.setForeground(Color.PINK);
        add(l1);

        



        //game loop 
        while (true){
            //access breakout object
            
            out.move();
            out.repaint();
            l1.setText("Score : " + out.getScore());
            
            if (out.getVar() == false){
                l1.setText("Score is " + out.getScore() + " and you lost!");
                // System.exit(0);
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                this.dispose();
            }

            if (out.getScore() == 50){
                out.setVisible(false);
                l1.setText("Score is a 50 and you won!");
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                this.dispose();
            }
            

            //slow it down 
            //java - there is a class named thread and this runs concurrently with brekaout which causes it to slow down 
            //inside the sleep method, it pauses 30 millis which is kind of like 30 frames per second 
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //try checks to see if the thread is current and is checking for the error and the cath is an interupptive acception and e is an acception and this will catch the error and if it breaks it will print out how it breaks 
        
        }






    
    }
    public static void EXIT_ON_CLOSE() {
    }  
}
