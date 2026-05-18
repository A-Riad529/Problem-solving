import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num < 1)
            return;
        if (num == 1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}