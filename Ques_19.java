import java.util.Scanner;

public class Ques_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating Grades Based on Marks");
        
        float percent = sc.nextFloat();
        if(percent >= 90){
            System.out.println("Grade A");
        }
       else if(percent >= 75){
            System.out.println("Grade B");
        }
       else if(percent >= 60){
            System.out.println("Grade C");
        }
      else  if(percent >= 30){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
        sc.close();


    }
}
