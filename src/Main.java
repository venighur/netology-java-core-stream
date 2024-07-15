import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        Arrays.sort(input);

        List<Integer> result = new ArrayList<>();

        for (int x : input) {
            if (x > 0 && x % 2 == 0) {
                result.add(x);
            }
        }

        for (int x : result) {
            System.out.println(x);
        }
    }
}