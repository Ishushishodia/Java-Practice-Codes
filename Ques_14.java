import java.util.Scanner;

public class Ques_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Fahrenheit:- ");
        double F = sc.nextDouble();
        double C = (F-32)*5/9;
        System.out.println("Converting fahrenheit to Celsius = "+ C);
        sc.close();
    }
}
