import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of temperature (in Farenheit):");
        double t = scan.nextDouble();
        System.out.println("Enter the value of wind speed (in miles per hour):");
        double v = scan.nextDouble();
        if (t <= 50 && v < 3 && v > 120) {
            double w = 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("Wind Chill= "+w);
        }
        else
            System.out.println("The value of t should not be greater than 50 \nThe value of v should be greater than 120 and less then 3");
    }
}
