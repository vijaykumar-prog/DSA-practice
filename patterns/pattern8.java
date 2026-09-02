public class pattern8 {
    
    public static void main(String[] arg){
        

        int n=4;
        int temp = n;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*temp-1;k++){
                System.out.print("*");
            }
            temp--;
            System.out.println();
        }
    }
}
    


