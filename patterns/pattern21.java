public class pattern21 {
    public static void main(String[] arg){
        int n=10;
        
            for(int i=0;i<n;i++){
                System.out.print("* ");

            }System.out.println();
            for(int j=0;j<n-2;j++){
                System.out.print("* ");
                for(int i=0;i<n-2;i++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();
            }
            for(int i=0;i<n;i++){
                System.out.print("* ");

            }
    }
    
}
