package pag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class App {
    JPanel Mypanel = new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();

    public App() {

        textArea_A.setText("点击键盘↑键");
        textArea_A.setBounds(100,100,256,128);
        Mypanel.add(textArea_A);
        textArea_A.setBackground(Color.cyan);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.yellow);
        Mypanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    textArea_B.append("上流社会\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    textArea_B.setText("");
                }
                
            }
        });
    }


    void go(){

        JFrame frame = new JFrame("TestGame");
        Mypanel.setLayout(null);
        frame.setContentPane(Mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,720);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
