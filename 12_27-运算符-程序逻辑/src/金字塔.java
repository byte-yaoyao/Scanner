import java.util.Scanner;

public class 金字塔 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        char c = str.charAt(0);//0表示第一个字符
        for (int count = 0; count < 5; count++) {
            for (int i = 0; i < 5 - count; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < count; i++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
