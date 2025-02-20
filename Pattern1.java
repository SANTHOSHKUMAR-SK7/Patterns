import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a RowLength  : ");
        byte rowLen= scan.nextByte();

        for(int row=1;row<=rowLen;row++){
            for(int col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}

/*      1
        22
        333
        4444
        55555     */