import java.util.Scanner;

public class Ques_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation of Simple Interest");
        System.out.print("Enter the Principal amount:- ");
        double P = sc.nextDouble();
        System.out.print("Enter the Rate:- ");
        double R = sc.nextDouble();
        System.out.print("Enter the Time:- ");
        double T = sc.nextDouble();
double si = (P*R*T)/100;
System.out.print("Simple Interest is as follow :- " + si);
        sc.close();
    }
}
