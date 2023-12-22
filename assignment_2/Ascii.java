import java.util.*;

class Asciivalue{
    int asc(char ch){
        return (int)ch;
    }
}

class Ascii{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Asciivalue a = new Asciivalue();
        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);
        System.out.print("The Ascii value:"+a.asc(ch));
    }
}