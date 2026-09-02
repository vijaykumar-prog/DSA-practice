package binarysearch;
//TO FIND THE FIRST OCCURENCE OF THE ELEMENT USING BINARY SEARCH.
import java.util.Scanner;

public class ExTwo {    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int nums[] = {6,5,4,4,3,2,2,2,1};
        
       
       System.out.print("enter the element to be found : ");
        int target = sc.nextInt();
        int i=0;
        int j=nums.length -1;
        int mid = 0;
       while (i <= j) {
            mid = (i + j) / 2;

            if (nums[mid] == target && nums[(i+mid)/2]==target) {
                System.out.println("The first occurence of the element : " + (i+mid)/2);
                break;
            }
            else if (nums[mid] == target ) {
                System.out.println("The index of the element : " + (mid));
                break;
            }
            else if (target <= nums[mid]) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }

        if (i > j) {
            System.out.println("Element not found");
        }
        

        sc.close();
    }

}
