import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal =new DecimalFormat("0");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        int TestInteger;

        int OutputFactor;
        int Placeholder = 0;


        int Counter=1;

        do {
            System.out.print("Enter an integer: ");
            TestInteger = in.nextInt();
        } while (TestInteger<=0);

        System.out.println();







        do{


            if((TestInteger/2)%Counter == 0 && Placeholder == 0){
                OutputFactor = TestInteger/Counter;
                System.out.print(OutputFactor+", "+Counter);
                Placeholder = Placeholder+1;
            } else if((TestInteger/2)%Counter == 0) {
                OutputFactor = TestInteger/Counter;
                System.out.print(", "+OutputFactor+", "+Counter);
            }
            Counter = Counter + 1;

        }while(Counter<(TestInteger/2));

        if(Counter == (TestInteger/2)){
            OutputFactor = TestInteger/Counter;
            System.out.print(", "+OutputFactor+", "+Counter+".");
        }
System.out.println();
// newline added
    }
}
