package stacksandqueues;

import linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Object NullPointerException;

    @Test
    public void pushTest()
    {
        Stack expected = new Stack();
        expected.push(1);
        assertEquals(1, expected.peek());
    }

    @Test
    public void multiPushTest()
    {
        Stack expected = new Stack();
        expected.push(1);
        expected.push(2);
        expected.push(3);
        expected.push(4);
        expected.push(5);
        System.out.println(expected.top.node_Data);
        assertEquals(5, expected.peek());
    }

    @Test
    public void popTest()
    {
        Stack expected = new Stack();
        expected.push(1);
        expected.push(2);
        expected.push(3);
        expected.push(4);
        expected.push(5);
        System.out.println(expected.top.node_Data);
        assertEquals(5, expected.pop());
    }

    @Test
    public void emptyTheStack()
    {
        Stack expected = new Stack();
        expected.push(1);
        expected.push(2);
        expected.push(3);
        expected.push(4);
        expected.push(5);
        expected.pop();
        expected.pop();
        expected.pop();
        expected.pop();
        expected.pop();
        System.out.println(expected.top.node_Data);
        assertEquals(NullPointerException, expected.top.node_Data);
    }

    @Test
    public void peekTest()
    {
        Stack expected = new Stack();
        expected.push(1);
        expected.push(2);
        assertEquals(2, expected.peek());
    }

    @Test
    public void isEmpty()
    {
        Stack expected = new Stack();
        assertEquals(NullPointerException, expected.top);
    }
}