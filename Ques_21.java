import java.util.Scanner;

public class Ques_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Showcasing AND Operator");
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();
        int result = first & second;
        System.out.println("Result is:- "+ result);
        sc.close();
    }
}
