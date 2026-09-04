public class pattern11{
    public static void main (String[] arg){

        int n = 4;
        // int a=0;
        for(int i=0;i<n;i++){
                // if(i%2==0)
                //     a=1;
                // else
                //     a=0;
            for(int j =0;j<=i;j++){
               
                System.out.print((i+j+1)%2+" ");
                // if(a==1){
                //     a=0;
                // }
                // else{
                //     a=1;
                // }
            }

            System.out.println();
        }
    }
}