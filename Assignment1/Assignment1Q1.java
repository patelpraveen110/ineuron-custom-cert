public class Assignment1Q1 {

    public static void main(String[] args) {
        int height = 7;

        for (int row = 0; row < height; row++) {
            for (int chr = 0; chr < 7; chr++) { // There are 7 characters in "INEURON"
                char letter = ' '; // Default to space if not in the range of 'I', 'N', 'E', 'U', 'R', 'O', 'N'
                switch (chr) {
                    case 0:
                        if (row == chr || row == height - 1) {
                            letter = 'I';
                        }
                        break;
                    case 1:
                        if (row == chr || row == height - 1 || row == 1 && chr == 5) {
                            letter = 'N';
                        }
                        break;
                    case 2:
                        if (row == chr || row == height - 1) {
                            letter = 'E';
                        }
                        break;
                    case 3: 
                        if (row == chr || row == height - 1 || row == 0 && chr == 3) {
                            letter = 'U';
                        }
                        break;
                    case 4: 
                        if (row == chr || row == height - 1) {
                            letter = 'R';
                        }
                        break;
                    case 5: 
                        if (row == chr || row == height - 1) {
                            letter = 'O';
                        }
                        break;
                    case 6: 
                        if (row == chr || row == height - 1 || row == 2 && chr == 4) {
                            letter = 'N';
                        }
                        break;
                }
                System.out.print(letter + " ");
            }            
            System.out.println();
        }
    }
}
