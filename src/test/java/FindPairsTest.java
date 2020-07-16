import org.junit.Test;

public class FindPairsTest {

        @Test
        public void IterateArrayTest() {
                FindPairs findPairs = new FindPairs();

                int[] arr = {4, 5, 10, 11, 6};
                int m = -1;

                System.out.println(FindPairs.findPairsInUnsortedArray(arr, m));
                System.out.println(findPairs.findPairsInSortedArray(arr, m));
        }

}
