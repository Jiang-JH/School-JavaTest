import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_bg=new JLabel();
    JLabel label_plane=new JLabel();
    int CHELL = 64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    label_plane.setBounds(label_plane.getX(), label_plane.getY()-CHELL, CHELL, CHELL);
                }

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    label_plane.setBounds(label_plane.getX(), label_plane.getY()+CHELL, CHELL, CHELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    label_plane.setBounds(label_plane.getX()-CHELL, label_plane.getY(), CHELL, CHELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    label_plane.setBounds(label_plane.getX()+CHELL, label_plane.getY(), CHELL, CHELL);
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        myPanel.setLayout(null);
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        java.net.URL imgURL1 = App.class.getResource("img/background.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_bg.setIcon(new ImageIcon(imgURL1));
        label_plane.setBounds(100,100,64,64);
        label_bg.setBounds(0,0,986,1000);
        myPanel.add(label_plane);
        myPanel.add(label_bg);


        label_txt.setText("得分结果：");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);


        JFrame frame = new JFrame("飞机移动");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,986,1000);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以

    }
    public static void main(String[] args) {
        new App().go();
    }
}
