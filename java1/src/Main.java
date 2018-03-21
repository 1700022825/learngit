import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by shaojianxuan on 2018/3/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1 = (float) input.nextDouble();
        float number2 = (float) input.nextDouble();
        float number3 = (float) input.nextDouble();
        float number4 = (float) input.nextDouble();

        DecimalFormat df = new DecimalFormat("#.0");

        float watermelon = (float) (number1 * 1.2);
        float peach = (float) (number2 * 3.5);
        float putao = (float) (number3 * 4.5);
        double apple = number4 * 5;
        double total = watermelon + peach + putao + apple;
        double f = 11.35;


        System.out.println(df.format(watermelon));
        System.out.println(df.format(peach));
        System.out.println(df.format(f));
        System.out.println(df.format(apple));
        System.out.println(df.format(total));








    }
}
