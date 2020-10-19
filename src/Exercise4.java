import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal =new DecimalFormat("#.00");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        int TestInteger;
        double Sum = 0;
        double Counter=0;
        double Average;
        do {
            System.out.print("Enter an integer: ");
            TestInteger = in.nextInt();
            Counter = Counter+1;
            Sum = Sum + TestInteger;
        } while (TestInteger>=0);
        System.out.println();


        if(TestInteger == 0){
            System.out.println("Error: division by zero.");
        } else {
            Average = (Sum-TestInteger)/(Counter-1);
            System.out.print(Decimal.format(Average));
        }





        }

    }

