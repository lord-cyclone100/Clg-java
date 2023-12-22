import java.util.*;

class Fibo{
    int FiboSeries(int num){
        if(num == 0){
            return 0;
        }
        else if(num == 1){
            return 1;
        }
        else{
            return FiboSeries(num - 1) + FiboSeries(num - 2);
        }
    }
}

class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fibo f = new Fibo();
        System.out.print("Enter the upper limit:");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            System.out.print(f.FiboSeries(i)+" ");
        }
    }
}