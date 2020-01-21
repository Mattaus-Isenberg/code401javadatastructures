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

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };
        PseudoQueue pqueue = new PseudoQueue<>();

        // insert above keys into the queue
        for (int key : keys) {
            pqueue .enqueue(key);
        }

        System.out.println(pqueue.dequeue());	// print 1
        System.out.println(pqueue.dequeue());	// print 2
    }
}
