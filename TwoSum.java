public class TwoSum{
    public static void main(String[] args){
        System.out.println(new TwoSum().solution(new int[]{2,7,11,15}, 9));
    }
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
}