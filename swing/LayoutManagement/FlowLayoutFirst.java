import java.awt.*;
import javax.swing.*;

public class FlowLayoutFirst{
    public static void main(String[] args){
        //FlowLayout()--->it creates a defaultlayout which centers the components
        //and and leaves 5 pixels of space between each components
        JFrame frm1= new JFrame("FLOWLAYOUT DEMO 1st");

        FlowLayout layout= new FlowLayout();
        frm1.setLayout(layout);


        JLabel human= new JLabel("Being Human");
        frm1.add(human);

        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm1.setSize(400,300);
        frm1.setVisible(true);
    }
}