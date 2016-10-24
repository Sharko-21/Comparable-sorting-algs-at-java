public class Insertion extends SortStructure{
    public static void sort(Comparable[] data) {
        sort(data, 0, data.length);
    }
    public static void sort(Comparable[] data, int lo, int hi) {
        for (int i = lo+1; i < hi; i++) {
            for (int j = i; j > lo && less(data[j], data[j-1]) ; j--) {
                exch(data, j, j-1);
            }
        }
    }
}
