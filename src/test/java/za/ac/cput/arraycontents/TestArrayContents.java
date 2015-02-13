package za.ac.cput.arraycontents;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by student on 2015/02/12.
 */
public class TestArrayContents extends TestCase {
    public void testArray() throws Exception{
        ArrayContents ac = new ArrayContents();

        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = ac.getArray();

        Assert.assertArrayEquals(expected, actual);
    }
}
