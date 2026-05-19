import java.util.Scanner;

public class someSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int identifier1 = sc.nextInt();
        int identifier2 = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= base; i++){
           if(i/10 == 0){
            if(i >= identifier1 && i <= identifier2)
                sum += i;
           }
            else{
                int j = i;
                int mysum = 0;
                while (j != 0) {
                    int digit = j % 10;
                    mysum += digit;
                    j /= 10;
                }
                if(mysum >= identifier1 && mysum <= identifier2)
                    sum +=i;
            }
        }
        System.out.println(sum);
    }
}
