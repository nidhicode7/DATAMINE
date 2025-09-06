import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 3, 4);
        Set<Integer> unique = new HashSet<>(nums);

        System.out.println(unique); // [1, 2, 3, 4]
    }
}
