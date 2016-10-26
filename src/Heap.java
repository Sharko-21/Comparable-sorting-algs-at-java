public class Heap extends SortStructure{
    public static void sort(Comparable[] data) {
        int n = data.length;
        for (int i = n/2; i >= 1; i--)
            sink(data, i, n);
        while (n > 1) {
            exch(data, 1, n--);
            sink(data, 1, n);
        }
    }
    private static void sink(Comparable[] data, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(data , j, j+1)) j++;
            if (!less(data, k, j)) break;
            exch(data, k, j);
            k = j;
        }
    }
    static void exch(Comparable[] data, int i, int j) {
        SortStructure.exch(data, i-1, j-1);
    }
    static boolean less(Comparable[] data, int i, int j) {
        return SortStructure.less(data[i-1], data[j-1]);
    }
}
