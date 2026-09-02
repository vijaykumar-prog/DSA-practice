package binarysearch;
// BINARY SEARCH IN 2D ARRAY WHICH IS SORTED IN EVERY ROW WISE.



public class bsearch {
    public static void main(String[] arg){
        int nums[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int target = 4;
        int n = nums.length;
        int m = nums[0].length;
        int low=0;
        int high = n*m -1;
        int iteration =0;

        while(low<=high){  
            iteration++;
            int mid = (low+high)/2;

            int row = mid / m;
            int col = mid % m;

            if(nums[row][col] == target){
                System.out.println(row+" "+col);break;
            }
            else if(nums[row][col]<target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println(iteration);

        
    }
    
}
