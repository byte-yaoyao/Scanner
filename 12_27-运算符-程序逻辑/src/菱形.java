import java.util.Scanner;

public class 菱形 {
    public static void main(String[] args) {
        char c = '*';
        Scanner sca = new Scanner(System.in);
        while(sca.hasNextInt()){
            int n = sca.nextInt();
            for(int i = n;i>0;i--){
                for(int j = 0;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<n-i+1;j++){
                    System.out.print(c + "");
                }
                System.out.println();
            }
            //打印中间的行
            for(int i = 0;i<n+1;i++){
                System.out.print(c + "");
            }
            System.out.print();
            for(int i = 0;i<n;i++){
                for(int j = 0;j<i+1;j++)
                    System.out.print();
            }
            for(int j = 0;j<n-i;j++){
                System.out.println();
            }
        }
    }
}
