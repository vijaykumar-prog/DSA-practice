public class pattern17 {
    public static void main(String[] arg){
        int n = 5;
        int temp = n;
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=temp-i;j++){
                System.out.print(" ");
            }
            
             for(int k=0;k<i;k++){
                System.out.print(ch);
                ch++;
            }
            ch -=2;
            for(int l=1;l<i;l++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }

    }
    
}
