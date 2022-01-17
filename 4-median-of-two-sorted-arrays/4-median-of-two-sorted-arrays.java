class Solution {
    // 7610    76 14   13 27/6 4.5
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i =0;
        int j=0;
        int k =0;
        int count =nums1.length + nums2.length; 
        int[] result = new int[count];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                result[k] = nums1[i];
                i++;
            }else{
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length){
            result[k++] = nums1[i++];
            
        }
        while(j < nums2.length){
            result[k++] = nums2[j++];
        }
        
        int length = result.length;
        if(length %2 !=0 ){
            return result[length/2];
        }else{
             double t = (result[length/2] + result[length/2 -1])/2.0;
            return t;
        }
        
    }
}