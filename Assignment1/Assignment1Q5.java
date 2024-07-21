public class Assignment1Q5 {

    public static void main(String[] args) {

        System.out.println("**************");
        for (int i = 0; i < 6; i++) {
            int j=6-i;
            while(j>0){
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            int j=i+2;
            while(j>0){
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
        System.out.println("**************");

    }
}
