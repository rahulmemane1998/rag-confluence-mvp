package leetcode;

public class ContainerWithMostWater
{
    public static void main(String[] args)
    {
        brutForceApproce(); // O(n*n)
        optimizedApproch(); // O(n)
    }

    private static void brutForceApproce()
    {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int area = 0;
        for(int i = 0; i < height.length -1 ; i++)
        {
            for(int j= i+1; j < height.length; j++)
            {
                int lowerValue = height[i] < height[j] ? height[i] : height[j];
                int calculatedArea = lowerValue * (j - i);
                if(calculatedArea > area)
                {
                    area = calculatedArea;
                }
            }
        }
        System.out.println("NON Optimized approch area = "+ area);
    }

    private static void optimizedApproch()
    {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        int area = 0, left = 0;
        int right = arr.length - 1;

        while (left < right)
        {
            int height  = Math.min(arr[left], arr[right]);

            int width = right -left;

            area = Math.max(area, height * width);

            if(arr[left] < arr[right])
            {
                left++;
            }
            else
            {
                right --;
            }

        }
        System.out.println("Optimized approch area = "+ area);
    }
}
