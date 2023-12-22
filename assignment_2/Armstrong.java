import java.util.*;

class CountDigits{
    int Digits(int num){
        int count = 0;
        while(num != 0){
            count++;
            num = num/10;
        }
        return count;
    }
}

class Arm{
    void CheckArmstrong(int n){
        CountDigits d = new CountDigits();
        int num = n;
        int power = d.Digits(n);
        int sum = 0;
        while(num != 0){
            int r = num%10;
            sum += Math.pow(r,power);
            num = num/10;
        }
        if(n == sum){
            System.out.print(n +" is an Armstrong number");
        }
        else{
            System.out.print(n +" is not an Armstrong number");
        }
    }
}

class Armstrong{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Arm a = new Arm();
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        a.CheckArmstrong(num);
    }
}