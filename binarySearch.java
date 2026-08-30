
import java.util.Scanner;
public class binarySearch{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int nums[] = {40,35,32,25,20,15,10,9,3};
        
       
       System.out.print("enter the element to be found : ");
        int target = sc.nextInt();
        int i=0;
        int j=nums.length -1;
        int mid = 0;
        while(i<=j){
           mid = (i + j)/2;
           if(nums[mid] == target){
            System.out.println("The index of the element : "+mid);
            break;
           }
           if(nums[i]<nums[j]){
                    if(target<nums[mid]){
                    j=mid-1;
                    }
                    else if(target>nums[mid]){
                    i=mid+1;
           }
           }
           if(nums[i]>nums[j]){
                     if(target>nums[mid]){
                    j=mid-1;
                    }
                    else if(target<nums[mid]){
                    i=mid+1;
           }
           }
          
        }
         if (i>j){
            System.out.println("Element not found");
        }

       
        for(int n:nums){
            System.out.print(n+"  ");
        }       

        

        sc.close();
    }

}