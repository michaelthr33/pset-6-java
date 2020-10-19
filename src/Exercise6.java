import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal =new DecimalFormat("0");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        int TestInteger;
        int PreviousInteger = 1;
        int FirstInteger = 0;
        int Sequence=0;

        int Counter=2;

        do {
            System.out.print("Enter an integer: ");
            TestInteger = in.nextInt();
        } while (TestInteger<=1 || TestInteger>=92);
        System.out.println();






        while(Counter<TestInteger){
            Counter = Counter + 1;
            Sequence = PreviousInteger+FirstInteger;
            FirstInteger = PreviousInteger;
            PreviousInteger = Sequence;

        }
        System.out.println(Decimal.format(Sequence)+".");


    }
}
