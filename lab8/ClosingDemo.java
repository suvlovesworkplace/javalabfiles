import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ClosingDemo extends JFrame{
    public ClosingDemo(){
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                int res = JOptionPane.showConfirmDialog(ClosingDemo.this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                if(res== JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
       
       setTitle("Exit Demo");
         setSize(400, 300);
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         setVisible(true);
    }
    public static void main(String[] args) {
         new ClosingDemo();    }
    
}