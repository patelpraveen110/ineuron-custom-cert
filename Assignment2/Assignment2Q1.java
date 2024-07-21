import java.util.*;

public class Assignment2Q1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 5};
        Set<Integer> numbersSet = new HashSet<>();
        Set<Integer> duplicatesSet = new HashSet<>();
        for (int num : array) {
            if (!numbersSet.add(num)) { // If num already exists in seen set, it's a duplicate
                duplicatesSet.add(num);
            }
        }
        System.out.println("Duplicates in the array: " + duplicatesSet);
    }
}
