import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println(" enter pls number 1: ");
        int num1=z.nextInt();
        System.out.println(" enter pls number 2: ");
        int num2=z.nextInt();
        System.out.println(" enter pls number 3: ");
        int num3=z.nextInt();

        if (num1>num2&&num1>num3){
            System.out.println(num1);

        } else if (num2>num1&&num2>num3) {
            System.out.println(num2);

        } else {
            System.out.println(num3);

        }

        //q2

        do {

            System.out.println("pls enter name and enter 0 to stop ");
            String name = z.nextLine();
            name++
        } {
            while (name != 0)
                System.out.println(" the tall name is " + name.length());
        }

        //q3

        System.out.println(" pls enter thw word : ");
        String word=z.nextLine();

        System.out.println(word.contains();
}}