import java.util.Scanner;

public class SumZero {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added into the array");
        int number = scan.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the elements of the array");
        for (i=0;i<number;i++) {
            arr[i] = scan.nextInt();
        }
        for (i=0;i<number;i++){
            int firstNumber = arr[i];
                for (int j=i+1;j<number;j++){
                    int secondNumber = arr[j];
                        for (int k=j+1;k<number;k++){
                            int thirdNumber=arr[k];
                            int sum=firstNumber+secondNumber+thirdNumber;
                            if(sum==0){
                                System.out.println("The triplets combination is:");
                                System.out.println(+firstNumber+","+secondNumber+","+thirdNumber);
                            }
                        }
                }
            System.out.println(" ");
        }
    }
}
