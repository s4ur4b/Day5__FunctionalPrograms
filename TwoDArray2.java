import java.util.Scanner;

public class TwoDArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int [][] table = new int[rows][columns];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i<rows; i++){
            for (int j=0;j<columns;j++){
                table [i][j]=scan.nextInt();
                System.out.print(table[i][j]+" ");

            }
            System.out.println(" ");
        }

    }
}
