import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter an integer: ");
            num = in.nextInt();
        }while(num<0);
        boolean Marker = false;
        for(int PrimeTest = 2; PrimeTest <= num/2; ++PrimeTest)
        {

            if(num % PrimeTest == 0)
            {
                Marker = true;
                break;
            }
        }
        System.out.println();
        if (!Marker)
            System.out.println("Prime.");
        else
            System.out.println("Not prime.");
    }
}