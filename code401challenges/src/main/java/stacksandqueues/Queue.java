package stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<E>
{
    Node<E> front;
    Node<E> back;
    int length;

    public Queue()
    {
        this.front = null;
        this.back = null;
        length = 0;
    }

    public void enqueue(E data)
    {
        Node<E> previous_back = back;
        back = new Node(data, null);
        if (isEmpty())
        {
            front = back;
        }
        else
        {
            previous_back.next_Node = back;
        }
        length++;
    }


    public E dequeue()
    {
        if(front == null)
            throw new NoSuchElementException();

        E return_Data = front.node_Data;
        front = front.next_Node;
        if (isEmpty())
        {
            back = null;
        }
        length--;
        return return_Data;
    }

    public E peek()
    {
        if(front == null)
            throw new NullPointerException();
        return front.node_Data;
    }

    public boolean isEmpty()
    {
        if(front == null)
            return true;
        return false;
    }

    public int getLength()
    {
        return length;
    }
}
