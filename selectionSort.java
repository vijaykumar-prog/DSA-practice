import java.util.Arrays;

public class selectionSort {
    public static void main(String[] arg){
        int nums[] = {6,4,5,87,34,32,63};
        int n = nums.length;
        int min;
        for(int i=0;i<n-2;i++){
             min = i;
            for(int j=i+1;j<n-1;j++){
                if(nums[j]<nums[i]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;

        }
        System.out.println(Arrays.toString(nums));
    }
    
}
