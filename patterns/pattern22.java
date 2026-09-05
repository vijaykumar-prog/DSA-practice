public class pattern22 {
    public static void main(String[] arg){
        int n=5;
        for (int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int bottom = (2*n-2)-i;
                int left = j;
                int right = (2*n-2)-j;

                int min = Math.min(Math.min(top,right),Math.min(left,bottom));

                System.out.print(n-min+" ");
            }
            System.out.println();
        }
    }
    
}
