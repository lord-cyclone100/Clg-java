import java.util.*;

class Natural{
    int NaturalSum(int num){
        return (num*(num + 1))/2;
    }
}

class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Natural n = new Natural();
        System.out.print("Enter the upper limit:");
        int num = sc.nextInt();
        System.out.print("Sum:"+n.NaturalSum(num));
    }
}