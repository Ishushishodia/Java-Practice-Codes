import java.util.Scanner;

public class Ques_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:- ");
        int a = input.nextInt();
        System.out.println("Enter the value of b:- ");
        int b = input.nextInt();
        System.out.println("Addition of two number:-" + (a+b));
        System.out.println("Subtraction of two number:-" + (a-b));
        System.out.println("Division of two number:-" + (a/b));
        System.out.println("Multiplication of two number:-" + (a*b));
        input.close();
    }
}
