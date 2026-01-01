package practice.arrays;

public class indMedianOfSortedArray
{
    public static void main(String[] args)
    {
        int[] nums1 = {2,2,4,4};
        int[] nums2 = {2,2,2,4,4};


        int n = nums1.length + nums2.length;
        int count = 0;
        int total = 0;
        double median = 0d;

        for(int i = 0 ; i < nums1.length ; i++)
        {
            count = nums1[i];
            total += count;
        }

        for(int j = 0 ; j < nums2.length; j++)
        {
            count = nums2[j];
            total += count;
        }

        median = (double)total / (double)n;
        System.out.println("Median of Array is : " + median);
    }

}
