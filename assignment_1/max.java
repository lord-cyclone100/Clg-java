import java.util.*;

class max {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number:");
        int c = sc.nextInt();

        int large = a>b ? a>c ? 1:3 : b>c ? 2:3;

        if(large == 1){
            System.out.print(a+" is largest");
        }
        if(large == 2){
            System.out.print(b+" is largest");
        }
        if(large == 3){
            System.out.print(c+" is largest");
        }
    }    
}
