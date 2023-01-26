import java.util.Scanner;

public class Main {
    static void number (int a, int d, boolean metot){

        if (a<= 0)
            metot= true;
        System.out.println(a+ "");
        if (metot == false )
            number(a-5,d+1,metot);
        else {
            if (d==0)
                return;
            else
                number(a+5,d-1,metot);

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int metot = input.nextInt();

        number (metot,0,false);

    }
}