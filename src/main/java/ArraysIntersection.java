import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraysIntersection {

    public static void main(String[] args) {

        int[][] intersect = {{2, 3, 5}};
        int[] result = new int[intersect.length];

        result = intersection(intersect);
        for (int i = 0; i < result.length; i++) {
            System.out.println((result[i]));
        }
    }


    private static int[] intersection(int[][] allArrays) {
        int[] result = allArrays[0];
        for (int i = 1; i < allArrays.length; i++) {
            result = intersectionTwoArrays(result, allArrays[i]);
            if (result.length == 0) return result;
        }
        return result;
    }

    private static int[] intersectionTwoArrays(int[] array1, int[] array2) {
        final ArrayList<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    intersection.add(array1[i]);
                }
            }
        }
        return intersection.stream().mapToInt(i -> i).toArray();
    }
}
