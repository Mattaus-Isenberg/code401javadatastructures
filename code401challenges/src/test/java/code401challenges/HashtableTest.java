package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class HashtableTest
{

    @Test public void addToHashTable()
    {
        Hashtable test_Table = new Hashtable();
        test_Table.add("Test Key", "Test Value");
        assertTrue(test_Table.contains("Test Key"));
    }


    @Test public void HashTableRetrieve()
    {
        Hashtable test_Table = new Hashtable();
        test_Table.add("Test Key", "Test Value");
        assertTrue("Test Value" == test_Table.get("Test Key"));
    }

    @Test public void successfulNull()
    {
        Hashtable test_Table = new Hashtable();
        test_Table.add("Test Key", "Test Value");
        assertTrue(null == test_Table.get("NONE"));
    }

    @Test public void keyHashInRange()
    {
        Hashtable test_Table = new Hashtable();
        test_Table.add("Test Key", "Test Value");
        assertTrue(test_Table.hash("Test Key") > 0  &&  test_Table.hash("Test Key")<= Hashtable.INITIAL_SIZE);
    }




}