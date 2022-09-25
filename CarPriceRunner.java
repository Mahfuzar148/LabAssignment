import java.util.Scanner;
public class CarPriceRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Car price = ");
        int cp1 = in.nextInt();
        System.out.println("Enter Gas price = ");
        int gp1 = in.nextInt();
        System.out.println("Enter mile per year = ");
        int mpy = in.nextInt();
        System.out.println("Enter resale value=");
        int rv =in.nextInt();
        System.out.println("Enter efficiency=");
        double ef = in.nextDouble();
        CarPrice cp = new CarPrice(cp1,gp1,mpy,rv,ef);
        cp.gasPrice();
        cp.totalPrice();
        double remainingMoney = cp.getRemainingMoney();
        System.out.println(remainingMoney);
    }
}
