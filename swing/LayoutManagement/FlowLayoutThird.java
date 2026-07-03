import java.awt.*;
import javax.swing.*;

public class FlowLayoutThird {
    public static void main(String[] args) {
        JFrame frm1 = new JFrame("heading");

        FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 500, 500);
        frm1.setLayout(layout);

        frm1.setSize(400, 300);
        frm1.setVisible(true);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}