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

class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fact f = new Fact();
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.print("Factorial value:"+f.EvalFactorial(num));
    }
}