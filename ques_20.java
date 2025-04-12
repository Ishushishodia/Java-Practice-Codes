import java.util.Scanner;

public class ques_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Categorize into different Groups ");
int age = sc.nextInt();
if(age<13){
    System.out.println("Child");
}
if(age<20){
    System.out.println("Teen");
    }
    if(age<60){
        System.out.println("Adult");
}
if(age>60){
    System.out.println("Senior");
}
sc.close();
    }
}
