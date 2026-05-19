import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =1;
        for(int i = 1; i <= num; i++){
            if(count % 4 != 0){
                System.out.print(count++ +" "+count++ +" "+count++ +" ");
                i--;
            }
            else{
                System.out.println("PUM");
                count++;
            }
        }        
    }
}
