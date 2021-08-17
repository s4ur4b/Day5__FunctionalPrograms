import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        int i = 0;Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added into the array");
        int number = scan.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the elements of the array");
        for (i=0;i<number;i++) {
            arr[i] = scan.nextInt();
            System.out.print(arr[i]+" ");
        }
    }
}
