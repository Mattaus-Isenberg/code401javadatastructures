package stacksandqueues;

import linkedList.LinkedList;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<E>
{
    Node<E> top;

    public Stack()
    {
        this.top = null;
    }

    public void push(E data)
    {
        if (top == null)
        {
            top = new Node<>(data);
        }
        else
            {
                top = new Node<>(data, this.top);
            }
    }

    public E pop()
    {
        if(top == null)
        {
            throw new EmptyStackException();
        }
        else
        {
            E valueHold = top.node_Data;
            top = top.next_Node;
            return valueHold;
        }
    }

    public E peek()
    {
        if(top == null)
            throw new EmptyStackException();
        return top.node_Data;
    }

    public boolean isEmpty()
    {
        if(top == null)
            return true;
        return false;
    }

}
