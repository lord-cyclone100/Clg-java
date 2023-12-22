import java.util.*;

class Long{
    int L_int(long num){
        return (int)num;
    }
}

class Longint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long n = new Long();
        System.out.print("Enter a long integer:");
        long num = sc.nextLong();
        System.out.print("Integer value:"+n.L_int(num));
    }
}