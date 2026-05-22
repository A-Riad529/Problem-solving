import java.util.Scanner;

public class sumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int sum = 0;        
        for(int i = 0; i < testCase; i++){
            sum = 0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            for(int j = Math.min(num1,num2)+1; j < Math.max(num1,num2); j++){
                if(j % 2 != 0){
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}
