import static java.lang.Math.*;     // static import
import com.bank.util.InterestCalculator;

public class MainInterest {
    public static void main(String[] args) {

        double P = 10000;
        double R = 5;
        double T = 2;

        double si = InterestCalculator.calculateSimpleInterest(P, R, T);
        double ci = P * (pow((1 + R/100), T)) - P;  // using pow() from static import

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
