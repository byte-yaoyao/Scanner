import java.util.Random;
import java.util.Scanner;

public class GuessNumberplus {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int level = sca.nextInt();
        int bound;
        int toGuessCount;
        switch(level){
            case 0:
                bound = 10;
                toGuessCount = 10;
                break;
            case 1:
                bound = 100;
                toGuessCount = 7;
                break;
            case 2:
                bound = 1000;
                toGuessCount = 5;
                break;
            default:
                bound = 10;
                toGuessCount = 10;
                break;
        }
        System.out.println("生成的范围是从1到"+bound);
        System.out.println("可以猜的次数是"+toGuessCount);
        Random rnd = new Random();//rnd随机数生成器
        int r = rnd.nextInt(bound);//默认生成的范围是[0,99]
        r += 1;        //r的取值范围是[1,100]
        System.out.println("DEBUG:随机生成数是"+r);
        int guessCount = 1;
        while(sca.hasNextInt()&&guessCount<toGuessCount){
            int n=sca.nextInt();
            if(n==r){
                System.out.println("猜对了");
                break;
            }else if(n<r){
                System.out.println("猜小了");
                break;
            }else{
                System.out.println("猜大了");
            }
            guessCount++;
        }
    }
}
