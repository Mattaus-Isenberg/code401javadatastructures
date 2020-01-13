package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestLinkedList {

    @Test public void emptyListTest(){
        LinkedList expected = new LinkedList();
        assertTrue(expected.head == null);
    }

    @Test public void addValueTest(){
        LinkedList expected = new LinkedList();
        expected.insert(355);
        assertTrue(expected.includes(355));
    }

    @Test public void headTest(){
        LinkedList expected = new LinkedList();
        expected.insert(100);
        expected.insert(200);
        expected.insert(355);
        assertTrue(expected.head.node_Data.equals(355));
    }

    @Test public void multipleNodeInsertionTest(){
        LinkedList expected = new LinkedList();
        expected.insert(100);
        expected.insert(200);
        expected.insert(355);
        String expectedString = "{ 355 } -> { 200 } -> { 100 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

    @Test public void booleanFindTrue(){
        LinkedList expectedList = new LinkedList();
        expectedList.insert(11);
        expectedList.insert(7);
        expectedList.insert(22);
        expectedList.insert(33);

        assertTrue(expectedList.includes(7));
    }

    @Test public void booleanFindFalse(){
        LinkedList expectedList = new LinkedList();
        expectedList.insert(11);
        expectedList.insert(7);
        expectedList.insert(22);
        expectedList.insert(33);

        assertFalse(expectedList.includes(99));
    }

    @Test public void collectionReturnTest(){
        LinkedList expectedList = new LinkedList();
        expectedList.insert(11);
        expectedList.insert(7);
        expectedList.insert(22);
        expectedList.insert(33);

        assertTrue(expectedList.head.node_Data.equals(33));
        assertTrue(expectedList.head.next_Node.node_Data.equals(22));
        assertTrue(expectedList.head.next_Node.next_Node.node_Data.equals(7));
        assertTrue(expectedList.head.next_Node.next_Node.next_Node.node_Data.equals(11));

    }



}
