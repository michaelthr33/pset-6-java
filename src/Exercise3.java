import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal =new DecimalFormat("0");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        double TestInteger;
        int Length;
        double Placeholder;
        double Sum = 0;
        String InputInteger;
        int Integer;

        do {
            System.out.print("Enter an integer: ");

            Integer = in.nextInt();

        } while (!(Integer > Sum));
        System.out.println();

        TestInteger = Integer;
        TestInteger = Math.floor(TestInteger);
        InputInteger = String.valueOf(TestInteger);
        Length = InputInteger.length();


        while(Length>0){
            Length = Length - 1;
            Placeholder = TestInteger/Math.pow(10,Length);
            Placeholder = Math.floor(Placeholder);
            if(Placeholder %2 != 0){
                Sum = Sum+Placeholder;
            }
            TestInteger = TestInteger-(Placeholder*Math.pow(10,Length));
        }
        if(Length == 0){
            System.out.println(Decimal.format(Sum)+".");
        }
    }
}
