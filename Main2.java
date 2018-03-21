
import java.util.Scanner;

/**
 * Created by shaojianxuan on 2018/3/10.
 */
public class Main2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double number1 = input.nextDouble();
            double number2 = input.nextDouble();
            double number3 = input.nextDouble();
            double number4 = input.nextDouble();


            double watermelon = (number1 * 1.2);
            double peach = (number2 * 3.5);
            double putao = (number3 * 4.5);
            double apple = (number4 * 5.0);
            double total = watermelon + peach + putao + apple;



            System.out.println(String.format("%.1f",watermelon));
            System.out.println(String.format("%.1f",peach));
            System.out.println(String.format("%.1f",putao));
            System.out.println(String.format("%.1f",apple));
            System.out.println(String.format("%.1f",total));











        }
    }


