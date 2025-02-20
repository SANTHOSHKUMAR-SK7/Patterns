import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a RowLength : ");
        byte RowLen = scan.nextByte();

        for (int row = 1; row <= RowLen; row++) {
            for (int space = 0; space <= RowLen - row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
     /*


              1
             212
            32123
           4321234
          543212345
                                */