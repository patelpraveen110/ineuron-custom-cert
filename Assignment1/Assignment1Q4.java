public class Assignment1Q4 {

    public static void main(String[] args) {

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if(j<=i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= 6; j++) {
                if(j<(7-i-1)){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("**************");

    }
}
