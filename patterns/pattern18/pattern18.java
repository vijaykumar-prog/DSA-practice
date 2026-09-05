public class pattern18 {
    public static void main(String[] arg){
        int n=5;
        int temp = n;
        
        for(int i=0;i<n;i++){
            char ch = (char)('A' + temp-1);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            temp--;
            System.out.println();
        }
    }
    
}
