package utilities;

import stacksandqueues.Stack;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Stack;

public class MultiBracketValidation
{

    public static boolean multiBracketValidation2(String input)
    {
        boolean balance = false;
        List<String> stringList = Arrays.asList(input);

        for(String character : stringList)
        {
            if(character.contains("("))
            {
                if (input.contains(")"))
                {
                    System.out.printf("Found");
                    balance = true;
                }
                else
                {
                    balance= false;
                }

            }

            if(character.contains("["))
            {
                if(input.contains("]"))
                {
                    System.out.println("Found");
                    balance = true;
                }
                else
                    {
                        balance = false;
                    }
            }


            if(character.contains("{"))
            {
                if (input.contains("}"))
                {
                    System.out.println("Found");
                    balance = true;
                }
                else
                {
                    balance =  false;
                }
            }
        }
        return balance;
    }

    public static boolean multiBracketValidation(String input)
    {
        Stack<Character> stack = new Stack<>();
        CharacterIterator iterator = new StringCharacterIterator(input);

        if (input.isEmpty())
            return true;

        for(char c = iterator.first() ; c != CharacterIterator.DONE ; c = iterator.next())
        {
            if (c == '{' || c == '(' || c == '[')
            {
                stack.push(c);
            }
            else if (c == '}' && stack.peek() == '{' || c == ')' && stack.peek() == '(' || c == ']' && stack.peek() == '[')
            {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }





    public static void main(String[] args)
    {
        String one = "{}";
        String two = "{}(){}";
        String three = "()[[Extra Characters]]";
        String four = "(){}[[]]";
        String five = "{}{Code}[Fellows](())";
        String six = "[({}]";
        String seven = "(](";
        String eight = "{(})";

        System.out.printf(String.valueOf(multiBracketValidation(three)));

    }
}


