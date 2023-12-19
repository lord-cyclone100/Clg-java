import java.util.*;
class swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Before swapping: num 1 = " + num1 + ", num 2 = " + num2);
        num1 = num1^num2;
        num2 = num1^num2;        
        num1 = num1^num2;
        System.out.println("Before swapping: num 1 = " + num1 + ", num 2 = " + num2);    }
}
