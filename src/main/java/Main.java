import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       int[] arr = {4, 5, 10, 11, 6};
       int[] a = null;
       int m = -1;

        System.out.println(findPairsInUnsortedArray(arr, m));
        System.out.println(findPairsInSortedArray(arr, m));

    }

    public static List<List> findPairsInSortedArray(int[] arr, int m) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        List<List> lists = new ArrayList<List>();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int k = i+1; k < arr.length; k++) {
                if (arr[i] - arr[k] == m) {
                    lists.add(Collections.singletonList(i + "-" + k + "=" + m));
                }else if (arr[k] - arr[i] == m) {
                    lists.add(Collections.singletonList(k + "-" + i + "=" + m));
                }
            }
        }
        return lists;

    }

    public static List<List> findPairsInUnsortedArray(int[] arr, int m) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        List<List> lists = new ArrayList<List>();

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] - arr[k] == m) {
                    lists.add(Collections.singletonList(i + "-" + k + "=" + m));

                }
            }
        }
        return lists;

    }
}
