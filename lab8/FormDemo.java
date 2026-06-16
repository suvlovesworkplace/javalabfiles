/*design a form that contains two levels ,two text box, 
one text area, two radio button, two
checkbox, one combo box and two buttons in a null layout*/

import javax.swing.*; 

public class FormDemo extends JFrame{
    private JLabel lbl1,lbl2;
    private JTextField txt1,txt2;
    private JTextArea area;
    private JRadioButton rbtn1,rbtn2;
    private JCheckBox chk1,chk2;
    private JComboBox<String> combo;
    private JButton btn1,btn2;

    public FormDemo() {
        setLayout(null);

        lbl1 = new JLabel("First Name:");
        lbl2 = new JLabel("Last Name:");
        txt1 = new JTextField();
        txt2 = new JTextField();
        area = new JTextArea("<Enter your details here>");
        rbtn1 = new JRadioButton("Male");
        rbtn2 = new JRadioButton("Female");

        chk1 = new JCheckBox("I am Hppy here");
        chk2 = new JCheckBox("Accept Terms and Conditions");
        combo = new JComboBox<>(new String[]{"RAM", "HARI", "SHYAM","SITA"});
        btn1 = new JButton("Submit");
        btn2 = new JButton("Cancel");

        lbl1.setBounds(50, 30, 100, 25);
        txt1.setBounds(150, 30, 150, 25);
        lbl2.setBounds(50, 70, 100, 25);
        txt2.setBounds(150, 70, 150, 25);
        area.setBounds(50, 110, 250, 100);
        rbtn1.setBounds(50, 220, 100, 25);
        rbtn2.setBounds(150, 220, 100, 25);
        chk1.setBounds(50, 260, 200, 25);
        chk2.setBounds(50, 290, 250, 25);
        combo.setBounds(50, 330, 150, 25);
        btn1.setBounds(50, 370, 100, 25);
        btn2.setBounds(160, 370, 100, 25);

        add(lbl1);
        add(txt1);
        add(lbl2);  
        add(txt2);
        add(area);
        add(rbtn1);
        add(rbtn2);
        add(chk1);
        add(chk2);
        add(combo);
        add(btn1);
        add(btn2);
    }
    public static void main(String[] args) {
        FormDemo form = new FormDemo();
        form.setTitle("Form Demo");
        form.setSize(400, 450);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}