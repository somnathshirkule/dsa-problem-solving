public class TwoSum{
    public static void main(String[] args){
        System.out.println(new TwoSum().solution(new int[]{2,7,11,15}, 9));
    }

    //time complexity O(n^2)
    //space complexity O(1)
    private int[] solution(int[] arr, int target){
        int[] tempArr = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    tempArr[0] = i;
                    tempArr[1] = j;
                }
            }
        }
        return tempArr;
    }

    //time complexity O(n)
    //space complexity O(1)
    private int[] solution1(int[] arr, int target){
        int[] temp = new int[2];
        Map<Integer, Integer> tempMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            tempMap.put(arr[i], i);
        }

        for(int i = 0; i < arr.length; i++){
            int tempRem = target - arr[i];
            if(tempMap.containsKey(tempRem) && tempMap.get(tempRem) != i){
                temp[1] = i;
                temp[0] = tempMap.get(tempRem);
            }
        }

        return temp;
    }
}
