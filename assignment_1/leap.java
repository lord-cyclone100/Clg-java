import java.util.*;

class leap {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.print(year+" is a leap year");
        }
        else if(year%100==0){
            System.out.print(year+" is not a leap year");
        }
        else if(year%4==0){
            System.out.print(year+" is a leap year");
        }
        else{
            System.out.print(year+" is not a leap year");
        }
    }    
}
