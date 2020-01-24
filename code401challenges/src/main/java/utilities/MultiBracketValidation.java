package utilities;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Stack;

public class MultiBracketValidation
{

    public static boolean multiBracketValidation(String input)
    {
        Stack<Character> stack = new Stack<>();
        CharacterIterator iterator = new StringCharacterIterator(input);

        if (input.isEmpty())
            return true;

        for(char c = iterator.first() ; c != CharacterIterator.DONE ; c = iterator.next())
        {
            if (c == '{' || c == '(' || c == '[')
                stack.push(c);

            if (c == '}' && stack.peek() == '{')
                stack.pop();

            if(c == ')' && stack.peek() == '(')
                stack.pop();

            if(c == ']' && stack.peek() == '[')
                stack.pop();
        }
        return stack.isEmpty();
    }
}


