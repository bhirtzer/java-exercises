package exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        double miles;
        double gas;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = in.nextDouble();

        System.out.println("How much gas (in gallons) did you use?");
        gas = in.nextDouble();

        mpg = miles / gas;
        System.out.println("You used " + mpg + " miles-per-gallon");

    }
}
