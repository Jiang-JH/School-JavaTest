package pag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class App {
    JPanel Mypanel = new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();

    public App() {

        textArea_A.setText("猜一下");
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


                  if (e.getKeyCode() == KeyEvent.VK_ENTER){
                      if (textArea_A.getText().equals("1")){
                          textArea_B.setText("猜对了");
                      }

                      if(!textArea_A.getText().equals("1"))
                          {
                          textArea_B.setText("错了");
                      }
                      if(textArea_B.getText().equals("猜对了") || textArea_B.getText().equals("错了")){
                          textArea_A.setText("");

                      }
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
