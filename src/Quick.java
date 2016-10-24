import java.util.Random;

public class Quick extends SortStructure{
 public static void sort(Comparable[] data) {
        shuffle(data);
        sort(data, 0, data.length-1);
    }

    private static void sort(Comparable[] data, int lo, int hi) {
        if (hi <= lo) return;
        int k = partition(data, lo, hi);
        sort(data, lo, k-1);
        sort(data, k+1, hi);
    }

    private static int partition(Comparable[] data, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            while (less(data[++i], data[lo]))
                if (i == hi) break;
            while (less(data[lo], data[--j]))
                if (i == lo) break;

            if (i >= j) break;
            exch(data, i, j);
        }
        exch(data, lo, j);
        return j;
    }
    private static void shuffle(Comparable[] data) {
        Random random = new Random();
        for (int i = data.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            exch(data, i, index);
        }
    }
}
