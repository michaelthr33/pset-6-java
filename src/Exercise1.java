import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal =new DecimalFormat("0");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        int LowerBound;
        int UpperBound;
        int Sum;

        do {
            System.out.print("Lover Bound: ");
            LowerBound = in.nextInt();
            System.out.print("Upper Bound: ");
            UpperBound = in.nextInt();
        } while (UpperBound<LowerBound);
        System.out.println();

        Sum = 0;
        while(LowerBound<=UpperBound){
            if(LowerBound%2 == 0){
                Sum = LowerBound+Sum;
            }
            LowerBound = LowerBound+1;
        }
        System.out.println(Decimal.format(Sum)+".");

    }
}
