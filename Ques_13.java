import java.util.Scanner;

public class Ques_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation of Compound Interest");
        System.out.print("Enter the Principal amount:- ");
        double P = sc.nextDouble();
        System.out.print("Enter the Rate:- ");
        double R = sc.nextDouble();
        System.out.print("Enter the Time:- ");
        double t = sc.nextDouble();
double ci = P*(1+R/100)*t;
System.out.print("Compound Interest is as follow :- " + ci);
        sc.close();
    }
}
