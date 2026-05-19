import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            int num = sc.nextInt();
            if(num == 0){
            System.out.println(0);
            continue;
            }
            while (num != 0) {
                int digit = num % 10;
                System.out.print(digit + " ");
                num /= 10;
            }
            System.out.println();
        }
    }
}
