import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal =new DecimalFormat("0");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        int TestInteger;

        int Counter;

        do {
            System.out.print("Enter an integer: ");
            TestInteger = in.nextInt();
        } while (TestInteger<=0);
        System.out.println();

        String InputNumber = String.valueOf(TestInteger);

        Counter = InputNumber.length();
        while(Counter>1){
            Counter = Counter - 1;
            System.out.print(InputNumber.charAt(Counter)+", ");
        }
        if(Counter==1){
         Counter = Counter - 1;
            System.out.print(InputNumber.charAt(Counter)+".");
        }

    }
}
