package stacksandqueues;

import java.util.EmptyStackException;
import java.util.Stack;


class PseudoQueue<E>
{
    private Stack<E> internal_Structure;


    public PseudoQueue()
    {
        internal_Structure = new Stack<>();
    }

    public void enqueue(E data)
    {
        internal_Structure.push(data);
    }


    public E dequeue()
    {
        if (internal_Structure.isEmpty())
            throw new EmptyStackException();

        E front_Value = internal_Structure.pop();
        if (internal_Structure.isEmpty())
            return front_Value;

        E back_Value = dequeue();
        internal_Structure.push(front_Value);

        return back_Value;
    }

}
