public class Assignment1Q3 {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            int j=7-i;
            while(j>0){
                System.out.print("*");
                j--;
            }
            int k = 7-i;
            int l = i;
            if(i==1){
             l=0;
             k++;
            }
            while(l>0){
                System.out.print(" ");
                l--;
            }
            while(k>0){
                System.out.print("*");
                k--;
            }
            System.out.println();
        }
    }
}
