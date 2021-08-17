import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter three numbers");
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double delta=b*b-4*a*c;
        System.out.println(delta);
            double root1= (-b + Math.sqrt(delta))/(2*a);
            double root2= (-b - Math.sqrt(delta))/(2*a);
        System.out.println("Root-1:  "+root1+"  Root-2:   "+root2);
    }
}
