import java.util.*;

class oddeven{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int check = num%2==0 ? 1:0;

        if (check == 1){
            System.out.print(num+" is even");
        }
        else{
            System.out.print(num+" is odd");
        }
    }
}
