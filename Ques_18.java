import java.util.Scanner;

public class Ques_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Year");
        int year = sc.nextInt();
        if(year%400 == 0 || (year % 4 == 0 && year %100 !=0)){
System.out.println("This is Leap Year");
        }
        else{
            System.out.println("This is not a  Leap Year");
        }
    sc.close();
    }
}
