import java.util.Scanner;

public class Ques_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Determining if number is Positive , Negative or Zero");
        System.out.println("Enter the value of number");
        int numb = sc.nextInt();
        if(numb>0){
            System.out.println("Number is Positive ");

        }
       
       else if (numb == 0){
        System.out.println("Number is zero");
       }
       else{
        System.out.println("Number is Negative");
       }
        sc.close();
    }
}
