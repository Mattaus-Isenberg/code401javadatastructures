package code401challenges;

public class Hashtable
{

    public static class HashNode
    {
        String key;
        String value;
        HashNode next;

        public HashNode(String key, String value)
        {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public static int INITIAL_SIZE = 32;

    private HashNode[] hash_Table = new HashNode[INITIAL_SIZE];

    public void add(String key, String value)
    {
        int hash = hash(key);
        final HashNode hash_Node = new HashNode(key, value);

        if (hash_Table[hash] == null)
        {
            hash_Table[hash] = hash_Node;
        }
        else
            {
            HashNode temp = hash_Table[hash];
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = hash_Node;
        }
    }

    public String get(String key)
    {
        int hash = hash(key);
        if (hash_Table[hash] != null)
        {
            HashNode temp = hash_Table[hash];
            while (!temp.key.equals(key) && temp.next != null)
            {
                temp = temp.next;
            }
            return temp.value;
        }
        return null;
    }

    public boolean contains(String key)
    {
        int hash = hash(key);

        if (hash_Table[hash] != null)
        {
            return hash_Table[hash] != null;
        }
        return false;
    }

    public int hash(String key)
    {
        return Math.abs(key.hashCode())  % INITIAL_SIZE;
    }

}


