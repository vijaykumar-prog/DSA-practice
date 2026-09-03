import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] arg){

        int[] array = {6,3,7,8,1,43,32};

        for(int i=0;i<array.length;i++){

            boolean swapped = false;
            for(int j=1;j<array.length - i;j++){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                System.out.println("Array is already sorted.");
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
