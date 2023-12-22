import java.util.*;

class PerfectCheck{
    void Perfectnumber(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.print(num+" is a perfect number");
        }
        else{
            System.out.print(num+" is not a perfect number");
        }
    }
}

class Perfect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PerfectCheck pc = new PerfectCheck();
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        pc.Perfectnumber(num);
    }
}