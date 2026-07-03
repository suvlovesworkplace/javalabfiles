import java.awt.*;
import javax.swing.*;
public class FlowLayoutSecond{
    public static void main(String[] args) {
        JFrame frm1 = new JFrame("heading line");

        FlowLayout layout= new FlowLayout(FlowLayout.RIGHT);
        
        frm1.setLayout(layout);

        JLabel animal= new JLabel("this is animal lion");

        frm1.add(animal);

        frm1.setSize(400,500);
        frm1.setVisible(true);


    }
}