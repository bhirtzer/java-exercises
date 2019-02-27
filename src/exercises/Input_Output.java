package exercises;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = in.next();

        System.out.println("Hello " + name + "!");
    }
}
