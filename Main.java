import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> input = new ArrayList<String>();

    String word = "";
    while (!word.equals("STOP"))
    {
      System.out.println("Implement me!");
    }
  }

  /** Returns the number of Strings in the ArrayList that has the letter
   * as the second letter in that word.
   * Precondition: The arr is not null, and is not empty.
   * Precondition: The letter is exactly one letter.
   */
  public static int countSecondInitial(ArrayList<String> arr, String letter)
  {
    int count = 0;

    for (String word: arr)
    {
      if(word != null && word.length() >= 2)
      {
        if(word.substring(1,2).equals(letter))
        {
          count++;
        }
      }
    }
    return count;
  }

  /** Returns the index of the second occurrence of target within the ArrayList
   * If the target is not found, or is only found once, then -1 is returned.
   * Precondition: Neither arr nor target are null.  The arr is non-empty.
   */
  public static int searchSecond(final ArrayList<String> arr, String target)
  {
    int count = 0;

    for (int i=0; i<arr.size(); i++)
    {
      if(word.get(i).equals(target))
      {
        count++;
        if(count > 1)
        {
          return i;
        }
      }
    }
    return -1;
  }
}
