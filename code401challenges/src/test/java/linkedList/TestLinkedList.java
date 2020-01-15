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

    @Test public void appendTest(){
        LinkedList expected = new LinkedList();
        expected.insert(100);
        expected.insert(200);
        expected.append(355);
        //System.out.println(expected.toString());
        //System.out.println(expected.toStringTest());
        String expectedString = "{ 200 } -> { 100 } -> { 355 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

    @Test public void insertMultipleAtEndOfListTest(){
        LinkedList expected = new LinkedList();
        expected.insert(100);
        expected.append(200);
        expected.append(201);
        expected.append(202);
        expected.append(203);
        System.out.println(expected.toString());
        String expectedString = "{ 100 } -> { 200 } -> { 201 } -> { 202 } -> { 203 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

    @Test public void insertBeforeInMiddleValueTest(){
        LinkedList expected = new LinkedList();
        expected.insert(100);
        expected.insert(200);
        expected.append(355);
        expected.insertBefore(100, 99);
        System.out.println(expected.toString());
        String expectedString = "{ 200 } -> { 99 } -> { 100 } -> { 355 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

   @Test public void secondInsertBeforeMiddleValueTest(){
       LinkedList newList = new LinkedList();
       newList.insert(11);
       newList.insert(33);
       newList.append(44);
       newList.insertBefore(11, 22);
       System.out.println(newList.toString());
       String expectedString2 = "{ 33 } -> { 22 } -> { 11 } -> { 44 } -> NULL";
       assertTrue(expectedString2.equals(newList.toString()));
   }

    @Test public void insertAtFirstIndexBeforeTest(){
        LinkedList newList = new LinkedList();
        newList.insert(11);
        newList.insert(33);
        newList.append(44);
        newList.insertBefore(33, 111);
        System.out.println(newList.toString());
        String expectedString2 = "{ 111 } -> { 33 } -> { 11 } -> { 44 } -> NULL";
        assertTrue(expectedString2.equals(newList.toString()));
    }

    @Test public void insertAfterNodeValueTest(){
        LinkedList expected = new LinkedList();
        expected.insert(100);
        expected.insert(200);
        expected.append(355);
        expected.insertAfter(100, 99);
        System.out.println(expected.toString());
        String expectedString = "{ 200 } -> { 100 } -> { 99 } -> { 355 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

    @Test public void insertAfterNodeValueTestTwo(){
        LinkedList expected = new LinkedList();
        expected.insert(100);
        expected.insert(200);
        expected.append(355);
        expected.insertAfter(100, 99);
        expected.insertAfter(99, 2);
        System.out.println(expected.toString());
        String expectedString = "{ 200 } -> { 100 } -> { 99 } -> { 2 } -> { 355 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

    @Test public void insertAfterNodeValueTestThree(){
        LinkedList expected = new LinkedList();
        expected.insert(100);
        expected.insert(200);
        expected.append(355);
        expected.insertAfter(100, 99);
        expected.insertAfter(200, 2);
        System.out.println(expected.toString());
        String expectedString = "{ 200 } -> { 2 } -> { 100 } -> { 99 } -> { 355 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

    @Test public void insertValueAtEndTest(){
        LinkedList expected = new LinkedList();
        expected.insert(11);
        expected.insert(22);
        expected.append(33);
        expected.insertAfter(33, 1);
        System.out.println(expected.toString());
        String expectedString = "{ 22 } -> { 11 } -> { 33 } -> { 1 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

    @Test public void kGreaterThanListLengthTest()
    {
        LinkedList expected = new LinkedList();
        expected.insert(11);
        expected.insert(22);
        expected.append(33);
        expected.insertAfter(33, 1);
        System.out.println(expected.toString());
        String expectedString = "{ 22 } -> { 11 } -> { 33 } -> { 1 } -> NULL";
        assertTrue(expectedString.equals(expected.toString()));
    }

    @Test public void kEqualListLengthTest()
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
       // expected = throw new IllegalArgumentException("Element out of bounds");
       // int actual = (int)list.kthFromEnd(5);
        //System.out.println((int)list.kthFromEnd(5));
        //assertEquals(IllegalArgumentException("Element out of bounds"), actual );
    }

    @Test public void kIsNotAPositiveNumberTest()
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
       // expected = throw new IllegalArgumentException("Element out of bounds");
        //int actual = (int)list.kthFromEnd(-3);
       // System.out.println((int)list.kthFromEnd(5));
       //assertEquals(IllegalArgumentException("Element out of bounds"), actual );
    }

    @Test public void  ofSizeOneLinkedListTest()
    {
        LinkedList list = new LinkedList();
        list.insert(1);

        int actual = (int)list.kthFromEnd(0);
        assertEquals(1, actual );
    }

    @Test public void happyPathKInTheMiddleTest()
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        int actual = (int)list.kthFromEnd(2);
        assertEquals(3, actual );
    }

}
