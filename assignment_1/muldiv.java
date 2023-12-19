import java.util.*;

class muldiv{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Multiplication by 4:"+(num<<2));
        System.out.println("Division by 2:"+(num>>1));
    }
}