import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = ((long)n*(n + 1))/2;
        System.out.println(sum);
    }
}
