package pac;

public class App implements N {

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.girl_filePath+"\n"+app.boy_filePath);

        for (int row = 0; row<app.array2d.length;row++){
            for (int columm = 0 ; columm<app.array2d[row].length;columm++){
                System.out.println(app.array2d[row][columm]+",");
            }
        }

    }

}
