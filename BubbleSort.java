public class BubbleSort{
    public int[] sort(int[] array){
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                    flag = true;
                }
            }
        }
    }

    private void swap(int[] array, int i1, int i2){
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }
}