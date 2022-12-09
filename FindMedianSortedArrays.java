public class FindMedianSortedArrays{

    //Time complexity => O(n)
    public double solution(int[] nums1, int[] nums2) {
       int[] mainArray = new int[nums1.length + nums2.length];
        int i1 = 0, i2 = 0, index = 0;
        
        while(i1 < nums1.length || i2 < nums2.length){
            if(i1 == nums1.length){
                while(i2 < nums2.length){
                    mainArray[index] = nums2[i2];
                    index++; i2++;
                }
            }else if(i2 == nums2.length){
                while(i1 < nums1.length){
                    mainArray[index] = nums1[i1];
                    index++; i1++;
                }
            }else if(nums1[i1] < nums2[i2]){
                mainArray[index] = nums1[i1];
                index++; i1++;
            }else if(nums2[i2] < nums1[i1]){
                mainArray[index] = nums2[i2];
                index++; i2++;
            }else if(nums2[i2] == nums1[i1]) {
            	mainArray[index] = nums2[i2];
                index++; i2++;
                mainArray[index] = nums1[i1];
                index++; i1++;
            }
        }
       
        double median = -1;
        if(mainArray.length % 2 == 0){
        	System.out.println(mainArray[(mainArray.length/2) - 1]);
            median = ((double)mainArray[mainArray.length/2] + (double)mainArray[(mainArray.length/2) - 1])/2;
        }else{
            median = mainArray[mainArray.length/2];
        }

        return median;
    }
}