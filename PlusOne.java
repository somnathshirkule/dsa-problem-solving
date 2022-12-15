public class PlusOne{
    public int[] performOperation(int[] array){
        int carry = 1, index = array.length - 1;
        while(carry == 1){
            
            int sum = array[index] + carry;

            if(sum > 9 && index == 0){
                array[index] = sum % 10;
                int[] newArray = new int[array.length + 1];
                newArray[0] = 1;
                for(int i = 1; i < newArray.length; i++){
                    newArray[i] = array[i-1];
                }
                return newArray;
            }
            else if(sum > 9){
                array[index] = sum % 10;
                carry = 1;
                index--;
            }else{
                array[index] = sum;
                carry = 0;
            }
        }
        return array;
    }
}