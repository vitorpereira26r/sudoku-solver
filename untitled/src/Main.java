import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] board = new int[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                board[i][j] = 0;
            }
        }

        int x, y, value;
        do{
            System.out.println("Row | Column | Value(1-9) ");
            x = sc.nextInt();
            y = sc.nextInt();
            value = sc.nextInt();
            if(value > 0 && value < 10){
                board[x][y] = value;
            }
        } while(value > 0 && value < 10);

        

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}