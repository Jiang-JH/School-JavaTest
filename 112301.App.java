package pac;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            int x = (int) (Math.random()*a*100%100);
            int y = (int) (Math.random()*a*100%100);
            if(a ==1){
                System.out.println(x+","+y);
            }else {
                System.out.println("请输入数字‘1’");
            }

        }



    }

}
