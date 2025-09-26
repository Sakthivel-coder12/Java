package dict;
import java.util.*;
public class list
{
    Scanner ni = new Scanner(System.in);
    String word,syn,ant;
    public void get_words()
    {
        System.out.println("Enter the word : synonyms : antonyms :");
        word = ni.next();
        syn = ni.next();
        ant = ni.next();
    }
    public String search(String str)
    {
        if(word.equals(str))
        {
            return word;
        }
        return "invalid";
    }
}