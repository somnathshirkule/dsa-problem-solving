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

    //Two pointers &  => Time complexity O(n)
    public int solution1(int[] height){
        int l = 0;
        int r = height.length - 1;
        int maxStorage = 0;
        while(l < r){
            int tempStorage = (height[l] < height[r] ? height[l] : height[r]) * (r - l);
            if(tempStorage > maxStorage)
                maxStorage = tempStorage;
            if(height[l] < height[r]) l++;
            else r--;
        }
        return maxStorage;
    }
}