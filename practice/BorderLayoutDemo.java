import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private Container container;
    private BorderLayout blayout;

    public BorderLayoutDemo(){
        super("BorderLayout Demo");
        blayout = new BorderLayout(5, 5);

        container = getContentPane();
        setLayout(blayout);

        button1 = new JButton("one");
        button2 = new JButton("two");
        button3 = new JButton("three");
        button4 = new JButton("four");

        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.EAST);
        add(button4, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        BorderLayoutDemo borderLayoutDemo = new BorderLayoutDemo();
        borderLayoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutDemo.setSize(300, 200);
        borderLayoutDemo.setVisible(true);
    }
}