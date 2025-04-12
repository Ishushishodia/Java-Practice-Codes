import java.util.Scanner;

public class Ques_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A:- ");
        int A = input.nextInt();
        System.out.println("Enter the value of B:- ");
        int B = input.nextInt();
        System.out.println("Enter the value of C:- ");
        int C = input.nextInt();
        System.out.println("Enter the value of D:- ");
        int D = input.nextInt();
        System.out.println("Perimter of rectangle ABCD = " + (A+B+C+D));
        input.close();
    }
}
