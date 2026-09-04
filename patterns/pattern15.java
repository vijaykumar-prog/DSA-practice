public class pattern15 {
    public static void main(String[] arg){
        int n=5;
        
        for(int i=0;i<n;i++){
            char ch ='A';
            for(int j=0;j<n-i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            
            System.out.println();
        }
    }
}
