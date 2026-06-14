// wap to show the examples of grid layout

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame{
    private GridLayout layout;
    private JButton btn1,btn2,btn3,btn4,btn5;
    public GridLayoutDemo() {

        layout = new GridLayout(2,3,5,5);
        setLayout(layout);
        btn1 = new JButton("1");
        btn2 = new JButton("2");    
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        setTitle("GridLayout Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
