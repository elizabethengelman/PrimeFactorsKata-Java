import java.util.ArrayList;
import java.util.List;

/**
 * Created by elizabethengelman on 3/5/14.
 */
public class PrimeFactors {
    public static List<Integer> generate(int number){
        List<Integer> factors = new ArrayList<Integer>();
        if (number > 1){
            factors.add(number);
        }
        return factors;
    }
}
