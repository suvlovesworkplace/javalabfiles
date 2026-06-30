import java.awt.*;
import javax.swing.*;


public class FlowLayoutDemo{
    public static void main(String[] args) {
        JFrame fr1=new JFrame("Helloworld this is frame title");
        FlowLayout layout = new FlowLayout();
        fr1.setLayout(layout);
        JLabel human = new JLabel("Being human is very fun now a days as human have many failities");
        fr1.add(human);
        JLabel ram = new JLabel("Being human is very fun but only for some time");
        fr1.add(ram);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(700,300);
        fr1.setVisible(true);

    }
}