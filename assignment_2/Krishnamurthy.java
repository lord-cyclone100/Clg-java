import java.util.*;

class Fact{
    int EvalFactorial(int num){
        if (num == 0){
            return 1;
        }
        else{
            return num*EvalFactorial(num - 1);
        }
    }
}

class Krishna{
    void isKrishnamurthy(int num){
        Fact f = new Fact();
        int n = num;
        int sum = 0;
        while(n != 0){
            int r = n%10;
            sum += f.EvalFactorial(r);
            n = n/10;
        }
        if(num == sum){
            System.out.print(num+" is a Krishnamurthy number");
        }
        else{
            System.out.print(num+" is not a Krishnamurthy number");
        }
    }
}

class Krishnamurthy{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Krishna k = new Krishna();
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        k.isKrishnamurthy(num);
    }
}