import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rnd = new Random();//rnd随机数生成器
        int r = rnd.nextInt(100);//默认生成的范围是[0,99]
        r = r + 1;//r的取值范围是[1,100]
        System.out.println("DEBUG:随机数是" + r);
        Scanner sca = new
                Scanner(System.in);
        while (sca.hasNextInt()) {
            int n = sca.nextInt();
            if (n == r) {
                System.out.println("猜对了！");
                break;
            } else if (n < r) {
                System.out.println("猜小了！");
            } else {
                System.out.println("猜大了！");
            }
        }
    }
}
