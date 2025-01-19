import java.util.*;
public class Operation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int result1 = num1+num2;
        System.out.println("Addition is :"+result1);
        int result2 = num1-num2;
        System.out.println("Subtraction is :"+result2);
        int result3 = num1*num2;
        System.out.println("multiplication is :"+result3);
        int result4 = num1/num2;
        System.out.println("Division is :"+result4);
        if(num1>=num2){
            System.out.println("Largest is :"+num1);
        }
        else{
            System.out.println("Largest is :"+num2);
        }
    }
}
