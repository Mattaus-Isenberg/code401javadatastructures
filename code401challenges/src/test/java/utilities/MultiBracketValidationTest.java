package utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest
{
    @Test
    public void singlePairValidation()
    {
        String one = "{}";
        assertTrue(utilities.MultiBracketValidation.multiBracketValidation(one));
    }

    @Test
    public void multiBracketValidation()
    {
        String two = "{}(){}";
        assertTrue(utilities.MultiBracketValidation.multiBracketValidation(two));
    }

    @Test
    public void textInBracketValidation()
    {
        String three = "()[[Extra Characters]]";
        assertTrue(utilities.MultiBracketValidation.multiBracketValidation(three));
    }

    @Test
    public void nestedBracketValidation()
    {
        String four = "(){}[[]]";
        assertTrue(utilities.MultiBracketValidation.multiBracketValidation(four));
    }

    @Test
    public void separatePairsWithTextBracketValidation()
    {
        String five = "{}{Code}[Fellows](())";
        assertTrue(utilities.MultiBracketValidation.multiBracketValidation(five));
    }

    @Test
    public void missingSingleBracketValidation()
    {
        String six = "[({}]";
        assertFalse(utilities.MultiBracketValidation.multiBracketValidation(six));
    }

    @Test
    public void multiMissingBracketValidation()
    {
        String seven = "(](";
        assertFalse(utilities.MultiBracketValidation.multiBracketValidation(seven));
    }

    @Test
    public void unOrderedBracketValidation()
    {
        String eight = "{(})";
        assertFalse(utilities.MultiBracketValidation.multiBracketValidation(eight));
    }
}