import java.util.*;

public class Assignment2Q6 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 1};

        if (isSubset(array1, array2)) {
            System.out.println("array2 is a subset of array1");
        } else {
            System.out.println("array2 is not a subset of array1");
        }
    }

    public static boolean isSubset(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }
}
