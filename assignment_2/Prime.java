import java.util.*;

class CheckPrime{
    int IsPrime(int num){
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if (count == 2){
            return 1;
        }
        return -1;
    }
}

class PrimeinRange{
    CheckPrime cp = new CheckPrime();
    void Primeprint(int num){
        for(int i = 1; i <= num; i++){
            int check = cp.IsPrime(i);
            if(check == 1){
                System.out.print(i+" ");
            }
        }
    }
}

class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrimeinRange pr = new PrimeinRange();
        System.out.print("Enter the upper limit:");
        int num = sc.nextInt();
        pr.Primeprint(num);
    }
}