package dsaUsingJavaC2W.array;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] arr = {4, 6 , 17, 2, 9, 5, 2};
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr)
    {
        int[] reverseArray = new int[arr.length];
        int index=0;
        for(int i = arr.length-1 ; i >= 0; i--)
        {
            reverseArray[index] = arr[i];
            index++;
        }

        for(int i : reverseArray)
        {
            System.out.println(i);
        }
    }
}
