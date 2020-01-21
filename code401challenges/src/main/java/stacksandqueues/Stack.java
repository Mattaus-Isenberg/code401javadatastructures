package stacksandqueues;

import java.util.EmptyStackException;

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
            top = new Node<>(data);

        top = new Node<>(data, this.top);

    }

    public E pop()
    {
        if(top == null)
            throw new EmptyStackException();

        E valueHold = top.node_Data;
        top = top.next_Node;

        return valueHold;
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
