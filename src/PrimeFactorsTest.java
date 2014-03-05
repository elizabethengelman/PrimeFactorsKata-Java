import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by elizabethengelman on 3/5/14.
 */
public class PrimeFactorsTest {

    public List<Integer> expectedFactors(int... numbers){
        List<Integer> factors = new ArrayList<Integer>();
        for (int n : numbers){
            factors.add(n);
        }
        return factors;
    }

    @Test
    public void factorsForOne(){
        assertEquals(expectedFactors(), PrimeFactors.generate(1));
    }

    @Test
    public void factorsForTwo(){
        assertEquals(expectedFactors(2), PrimeFactors.generate(2));
    }

    @Test
    public void factorsForThree(){
        assertEquals(expectedFactors(3), PrimeFactors.generate(3));
    }

    @Test
    public void factorsForFour(){
        assertEquals(expectedFactors(2,2), PrimeFactors.generate(4));
    }

    @Test
    public void factorsForSix(){
        assertEquals(expectedFactors(2,3), PrimeFactors.generate(6));
    }

    @Test
    public void factorsForEight(){
        assertEquals(expectedFactors(2,2,2), PrimeFactors.generate(8));
    }
}
