import java.util.*;

class vowcons {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.print(ch+" is a vowel");
                break;
            default:
                System.out.print(ch+" is not a vowel");
                break;
        }
    }    
}
