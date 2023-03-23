import java.util.*;;
public class WaysToReachNthStair{
    public List<String> getWays(int n){
        //n is the number of stair Nth stair.

        List<String> ways = new ArrayList<>();
        getRecusrsively(ways, n, "",n);
        return ways;
    }

    private void getRecusrsively(List<String> ways, int n, String way, int current){
        if(current == 0){
            ways.add(way);
            return;
        }

        if(current < 0)
            return;

        getRecusrsively(ways, n, way + "1", current-1);
        getRecusrsively(ways, n, way + "2", current-2);
        getRecusrsively(ways, n, way + "3", current-3);
    }
}