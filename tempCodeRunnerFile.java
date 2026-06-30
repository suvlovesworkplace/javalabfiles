import java.awt.*;
import javax.swing.*;

public class GridLayoutFrame extends JFrame{
    private Jbutton button1;
    private Jbutton button2;
    private Jbutton button3;
    private Jbutton button4;
    private Container container;
    private GridLayout glayout;

    public GridLayoutFrame(){
        super("GridLayout Demo");
        glayout = new GridLayout(2, 2, 5, 5);

        container = getContentPane();
        setLayout(glayout);

        button1 = new JButton("one");
        button2 = new JButton("two");
        button3 = new JButton("three");
        button4 = new JButton("four");

        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }

    public static void main(String[] args) {
        GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
        gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutFrame.setSize(300, 200);
        gridLayoutFrame.setVisible(true);
    }
}