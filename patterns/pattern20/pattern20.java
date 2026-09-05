public class pattern20 {
    public static void main(String[] arg){
        int n=10;
        int temp1 = n;
        int temp2 = n;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*temp2-2;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            temp2--;
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<temp1-1;j++){
                System.out.print("* ");
            }
            
            for(int j=0;j<2*i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<temp1-1;j++){
                System.out.print("* ");
            }
            temp1--;
            System.out.println();

        }
    }
    
}
