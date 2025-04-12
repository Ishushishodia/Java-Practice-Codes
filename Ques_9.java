import java.util.Scanner;

public class Ques_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first decimal number:- ");
        double first = input.nextDouble();
        System.out.println("Enter second decimal number:-");
        double second = input.nextDouble();
        System.out.println("Multiplication of two decimal numbers:- " + (first*second));
        input.close();
    }
}
