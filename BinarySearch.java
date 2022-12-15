public class BinarySearch{
    public boolean find(int[] sortedArray, int element){
        return recursiveFind(sortedArray, element, 0, sortedArray.length);
    }

    private boolean recursiveFind(int[] sortedArray, int element, int start, int end){
        int midIndex =  (start + end) / 2;
        int mid = sortedArray[midIndex];

        if(mid == element)
            return true;

        if(start == end || start < end || (end - start) == 1)
            return false;

        if(mid > element)
            return recursiveFind(sortedArray, element,start, midIndex - 1);
        
        if(mid < element)
            return recursiveFind(sortedArray, element,midIndex + 1, end);
    }
}