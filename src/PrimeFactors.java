import java.util.ArrayList;
import java.util.List;

/**
 * Created by elizabethengelman on 3/5/14.
 */
public class PrimeFactors {
    public static List<Integer> generate(int number){
        List<Integer> factors = new ArrayList<Integer>();
        int tryNumber = 2;
        while (number > 1){
            while (number % tryNumber == 0){
                factors.add(tryNumber);
                number/= tryNumber;
            }
            tryNumber ++;
        }
        return factors;
    }
}
