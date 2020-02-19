package repeatedword;

import code401challenges.Hashtable;


public class RepeatedWord
{

    public static String repeatedWord(String string)
    {
        String[] words = string.split("\\s*(\\s|=>|,)\\s*");
        Hashtable table = new Hashtable();

        for(String word : words)
        {
            String normalized_Word = word.toLowerCase();

            if(!table.contains(normalized_Word))
            {
                table.add(normalized_Word, normalized_Word);
            }
            else if(table.contains(normalized_Word))
            {
                return normalized_Word;
            }
        }
        return null;
    }

}
