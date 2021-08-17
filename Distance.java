import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double distance=  Math.sqrt(Math.pow(x,2+Math.pow(x,2)));
        System.out.println(distance);
    }
}
