package leetcode;

public class CountWayToClimbStairs
{
    public static void main(String[] args)
    {
        CountWayToClimbStairs countWayToClimbStairs = new CountWayToClimbStairs();
        countWayToClimbStairs.waysToClimb(4);
    }

    private int waysToClimb(int totalStairs)
    {

        int count = 0;
        for(int i = 1 ; i<=4 ; i++)
        {
            int totalStairsDummy = 0;
            if(i != totalStairs){
//            {
//                if()
//                totalStairsDummy + 1 ;
            }
            if(totalStairsDummy == totalStairs)
            {
                i = 2;
                count++;
            }
        }
        return count;

    }
}
