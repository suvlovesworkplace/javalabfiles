import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemoSimple {

    private JFrame frame;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    private BorderLayout layout;

    public BorderLayoutDemoSimple() {

        frame = new JFrame("BorderLayout Demo");

        layout = new BorderLayout(5, 5);
        frame.setLayout(layout);

        button1 = new JButton("North");
        button2 = new JButton("South");
        button3 = new JButton("East");
        button4 = new JButton("West");
        button5 = new JButton("Center");

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemoSimple();
    }
}