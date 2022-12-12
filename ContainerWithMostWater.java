public class ContainerWithMostWater{

    //Time complexity O(n^2)
    public int solution(int[] height){
        int maxStorage = 0;
        int tempStorage = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){
                tempStorage = (height[i] < height[j] ? height[i] : height[j]) * (j - i);
                if(tempStorage > maxStorage){
                    maxStorage = tempStorage;
                }
            }
        }
        return maxStorage;
    }
}