import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num < 1)
            return;
        for(int i = (int) (num - 1); i >= 1; i--){
        num *= i;
            }
        if(num % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("\"NO\"");
    }
}