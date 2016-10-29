public class Quick3 extends Sort {
    public static void sort(Comparable[] data) {
        shuffle(data);
        sort(data, 0, data.length-1);
    }
    private static void sort(Comparable[] data, int lo, int hi) {
        if (hi <= lo) return;
        int lt = lo, gt = hi;
        Comparable v = data[lo];
        int i = lo;
        while (i <= gt) {
            int cmp = data[i].compareTo(v);
            if      (cmp < 0)   exch(data, lt++, i++);
            else if (cmp > 0)   exch(data, i, gt--);
            else                i++;
        }
        sort(data, lo, lt-1);
        sort(data, gt + 1, hi);
    }
}
