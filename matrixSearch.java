import java.util.Scanner;

public class matrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colum = sc.nextInt();
        int [][] matrix = new int[row][colum];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < colum; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int check = sc.nextInt();
        int flag = 0;
        for(int i = 0; i < row;i++){
            for(int j = 0; j < colum; j++){
                if(matrix[i][j] == check){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("will not take number");
                break;
            }
        }
        if(flag != 1){
            System.out.println("will take number");
        }
    }
}
