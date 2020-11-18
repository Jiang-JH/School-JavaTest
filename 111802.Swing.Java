package pac;

import javax.swing.*;

public class App {
    private JPanel Mypamel;
    private JLabel label_img;


    void go(){
        label_img.setIcon(new ImageIcon("D:\\abc.gif"));
        JFrame frame = new JFrame("App");
        frame.setContentPane(Mypamel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,200,600,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
