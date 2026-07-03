import java.awt.*;
import javax.swing.*;

public class FlowLayoutThirdDemo {
    public static void main(String[] args) {
        JFrame frm1 = new JFrame("heading");

        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 59, 30);
        frm1.setLayout(layout);
        
        JLabel human= new JLabel("I am a human hahaha");
        frm1.add(human);

        frm1.setSize(400, 300);
        frm1.setVisible(true);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}