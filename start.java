import javax.swing.*;  //importing swing package //importing swing package
import java.awt.*;     //importing awt package
public class start
{
    JFrame jf;
    public start() {
        jf = new JFrame("BrushIT");            //Creating a JFrame with name MyWindow
        JButton btn = new JButton("Open");//Creating a Button named Say Hello
        jf.add(btn);                            //adding button to frame
        jf.setLayout(new FlowLayout());        //setting layout using FlowLayout object
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //setting close  operation.
        jf.setSize(400, 400);                   //setting size
        jf.setVisible(true);                    //setting frame visibility
    }
    public static void main(String[] args)
    {
        new start();
    }
}