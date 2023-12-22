import java.util.*;

class Makaut{
    void MakautGrade(int num){
        switch(num/10){
            case 10:
            case 9:
                System.out.print("Grade O");
                break;
            case 8:
                System.out.print("Grade E");
                break;
            case 7:
                System.out.print("Grade A");
                break;
            case 6:
                System.out.print("Grade B");
                break;
            case 5:
                System.out.print("Grade C");
                break;
            case 4:
                System.out.print("Grade D");
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.print("Grade F");
                break;
            default:
                System.out.print("Invalid input");
        }
    }
}

class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Makaut m = new Makaut();
        System.out.print("Enter marks:");
        int marks = sc.nextInt();
        m.MakautGrade(marks);
    }
}