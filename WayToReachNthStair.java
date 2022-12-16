public class WayToReachNthStair{
    public int getWays(int n){
        if(n =< 0)
            return 1;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
            
        return getWays(n-1) + getWays(n-2) + getWays(n-3);
    }
}