import java.util.Scanner;

public class Ques_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Breadth");
        double B = sc.nextDouble();
        System.out.println("Enter the value of Height");
        double H = sc.nextDouble();
       double Area_of_Tri = (0.5*B*H);
System.out.println("Area of Triangle = " + Area_of_Tri);
        sc.close();

    }
}
