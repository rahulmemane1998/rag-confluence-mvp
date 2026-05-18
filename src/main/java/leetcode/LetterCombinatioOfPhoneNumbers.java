package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinatioOfPhoneNumbers
{
    public static void main(String[] args)
    {
        List<String> finalResult = letterCombinations("5678");
        System.out.println(finalResult.stream().toList());
    }

    private static List<String> letterCombinations(String digits)
    {
        List<String> result = new ArrayList<>();
        String[] two = {"a", "b", "c"};
        String[] three = {"d", "e", "f"};
        String[] four = {"g", "h", "i"};
        String[] five = {"j", "k", "l"};
        String[] six = {"m", "n", "o"};
        String[] seven = {"p", "q", "r", "s"};
        String[] eight = {"t", "u", "v"};
        String[] nine = {"w", "x", "y", "z"};

        char[] crr = digits.toCharArray();

        if(digits.length() == 1)
        {
            if(digits.equals("2"))
            {
                int i =0;
                while (result.size() != two.length)
                {
                    result.add(two[i]);
                    i++;
                }
            }
            if( digits.equals("3"))
            {
                int i =0;
                while(result.size() != three.length)
                {
                    result.add(three[i]);
                    i++;
                }
            }
            if( digits.equals("4"))
            {
                int i =0;
                while(result.size() != four.length)
                {
                    result.add(four[i]);
                    i++;
                }
            }
            if( digits.equals("5"))
            {
                int i =0;
                while(result.size() != five.length)
                {
                    result.add(five[i]);
                    i++;
                }
            }
            if( digits.equals("6"))
            {
                int i =0;
                while(result.size() != six.length)
                {
                    result.add(six[i]);
                    i++;
                }
            }
            if( digits.equals("7"))
            {
                int i =0;
                while(result.size() != seven.length)
                {
                    result.add(seven[i]);
                    i++;
                }
            }
            if( digits.equals("8"))
            {
                int i =0;
                while(result.size() != eight.length)
                {
                    result.add(eight[i]);
                    i++;
                }
            }
            if(digits.equals("9"))
            {
                int i =0;
                while(result.size() != nine.length)
                {
                    result.add(nine[i]);
                    i++;
                }
            }
        }
        else
        {
            List<List<String>> temp2 = new ArrayList<>();
            for(int i = 0 ; i < crr.length; i++)
            {
                List<String> temp = new ArrayList<>();
                String digits1 = String.valueOf(crr[i]);
                if(digits1.equals("2"))
                {
                    int start =0;
                    while (temp.size() != two.length)
                    {
                        temp.add(two[start]);
                        start++;
                    }
                }
                if( digits1.equals("3"))
                {
                    int start =0;
                    while(temp.size() != three.length)
                    {
                        temp.add(three[start]);
                        start++;
                    }
                }
                if( digits1.equals("4"))
                {
                    int start =0;
                    while(temp.size() != four.length)
                    {
                        temp.add(four[start]);
                        start++;
                    }
                }
                if( digits1.equals("5"))
                {
                    int start =0;
                    while(temp.size() != five.length)
                    {
                        temp.add(five[start]);
                        start++;
                    }
                }
                if( digits1.equals("6"))
                {
                    int start =0;
                    while(temp.size() != six.length)
                    {
                        temp.add(six[start]);
                        start++;
                    }
                }
                if( digits1.equals("7"))
                {
                    int start =0;
                    while(temp.size() != seven.length)
                    {
                        temp.add(seven[start]);
                        start++;
                    }
                }
                if( digits1.equals("8"))
                {
                    int start =0;
                    while(temp.size() != eight.length)
                    {
                        temp.add(eight[start]);
                        start++;
                    }
                }
                if(digits1.equals("9"))
                {
                    int start =0;
                    while(temp.size() != nine.length)
                    {
                        temp.add(nine[start]);
                        start++;
                    }
                }
                temp2.add(temp);
            }
            List<String> firstList = new ArrayList<>();
            List<String> secondList = new ArrayList<>();
            List<String> thirdList = new ArrayList<>();
            List<String> fourthList = new ArrayList<>();

            if(temp2.size() == 2)
            {
                firstList = temp2.get(0);
                secondList = temp2.get(1);
            }
            if(temp2.size() == 3)
            {
                firstList = temp2.get(0);
                secondList = temp2.get(1);
                thirdList = temp2.get(2);
            }
            if(temp2.size() == 4)
            {
                firstList = temp2.get(0);
                secondList = temp2.get(1);
                thirdList = temp2.get(2);
                fourthList = temp2.get(3);
            }

            for(int i =0 ; i< firstList.size(); i++)
            {
              for(int j =0 ; j< secondList.size(); j++)
              {
                  if(thirdList.size() == 0)
                  {
                      result.add(firstList.get(i) + secondList.get(j));
                  }
                  else if(fourthList.size() == 0)
                  {
                      for(int k =0 ; k< thirdList.size(); k++)
                      {
                          result.add(firstList.get(i) + secondList.get(j) + thirdList.get(k));
                      }
                  }
                  else
                  {
                      for (int k = 0; k < thirdList.size(); k++)
                      {
                          for (int l = 0; l < fourthList.size(); l++)
                          {
                              result.add(firstList.get(i) + secondList.get(j) + thirdList.get(k) + fourthList.get(l));
                          }
                      }
                  }
              }
          }
        }
        return result;
    }
}
