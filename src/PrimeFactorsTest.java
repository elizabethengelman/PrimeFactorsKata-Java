import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by elizabethengelman on 3/5/14.
 */
public class PrimeFactorsTest {
    List<Integer> expectedFactors = new ArrayList<Integer>();
    @Test
    public void factorsForOne(){
        assertEquals(expectedFactors, PrimeFactors.generate(1));
    }

    @Test
    public void factorsForTwo(){
        expectedFactors.add(2);
        assertEquals(expectedFactors, PrimeFactors.generate(2));
    }

    @Test
    public void factorsForThree(){
        expectedFactors.add(3);
        assertEquals(expectedFactors, PrimeFactors.generate(3));
    }
}
