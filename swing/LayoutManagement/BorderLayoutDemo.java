import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {

    private JButton button1,button2,button3,button4,button5;
   

    private BorderLayout layout;   // borderlayout object

    // set up GUI and event handling
    public BorderLayoutDemo() {

        super("BorderLayout Demo");

        layout = new BorderLayout(5,5);   // 5 pixel gaps
        setLayout(layout);                  // set frame layout

        button1 = new JButton("North");
        button2 = new JButton("South");
        button3 = new JButton("East");
        button4 = new JButton("West");
        button5 = new JButton("Center");

        add(button1, BorderLayout.NORTH);   // add button to north
        add(button2, BorderLayout.SOUTH);   // add button to SOUTH
        add(button3, BorderLayout.EAST);    // add button to east
        add(button4, BorderLayout.WEST);    // add button to west
        add(button5, BorderLayout.CENTER);  // add button to center
    }

    public static void main(String[] args) {

        BorderLayoutDemo borderLayoutFrame = new BorderLayoutDemo();

        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        borderLayoutFrame.setSize(300, 200);   // set frame size
        borderLayoutFrame.setVisible(true);    // display frame
    }
}