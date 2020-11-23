package pac;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            int x = (int) (Math.random()*a);
            int y = (int) (Math.random()*a);
            System.out.println(x+","+y);
        }



    }

}
