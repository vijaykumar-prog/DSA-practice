package binarysearch;
//BINARY SEARCH IN 2D ARRAY WHICH IS SORTED IN ROW AND COLUMN WISE.

import java.util.Scanner;
public class twoD {
    public static void main(String[] args){
        
         int[][] nums = {
            {12,23,45,67},
            {15,24,49,73},
            {17,26,52,87},
            {25,29,58,99}
        };
        Scanner in = new Scanner(System.in);
        int target =in.nextInt();
        int index1 = 0;
        int index2 = 0;
        boolean found = false;

        for(int i=0;i<nums.length;i++){
            int row = 0;
            int col = nums.length -1;
            

            while(row <= col){
                int mid = (col+row)/2;

                if(nums[i][mid]== target){
                    index1 = i;
                    index2 = mid;
                    found = true;
                    break;
                }
                else if(nums[i][mid]<target){
                    
                    row = mid + 1;
                }
                else{
                    col = mid -1;
                }
            }
        }
        if(found){
            System.out.println(index1+","+index2);
        }
        else{
            System.out.println("Element not found");
        }
        in.close();
        

    }
    
}
