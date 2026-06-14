
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class RedGreenDemo extends JFrame{
    private JButton btn1,btn2;

    public RedGreenDemo(){
        setLayout(new FlowLayout());
        setTitle("color change");
        btn1 = new JButton("RED");
        btn2 = new JButton("GREEN");
    

    btn1.addActionListener(new ActionListener() {
        @Override

        public void actionPerformed(ActionEvent e) {
                btn2.setBackground(Color.RED);
                System.out.println("Button Red Clicked");

        }
    });

    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                btn1.setBackground(Color.GREEN);
                System.out.println("Button Green Clicked");

        }
    });

    add(btn1);
    add(btn2);

    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
   
    }
    static void main(String[] args) {
        new RedGreenDemo();
    }
}