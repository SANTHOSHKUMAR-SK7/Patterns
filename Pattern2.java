import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a RowLength  : ");
        byte rowLen= scan.nextByte();

        for(int row=1;row<=rowLen;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" "+col+" ");
            }
            System.out.println();
        }
    }
}

/*
 1
 1  2
 1  2  3
 1  2  3  4
 1  2  3  4  5   */
