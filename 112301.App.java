package pac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int x, y;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    i = (int) (Math.random() * 100);
                    j = (int) (Math.random() * 100);
                    int userNum = scanner.nextInt();
                    if (userNum == 1) {
                        x = i;
                        y = j;
                        System.out.println("它的坐标是" + "[" + x + "]" + "[" + y + "]");
                    }
                }
            }

        }
    }
}
