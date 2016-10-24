public class MergeBU extends Merge{
    private static Comparable[] aux;
    public static void sort(Comparable[] data) {
        int n = data.length;
        Comparable[] aux = new Comparable[n];
        for (int sz = 1; sz < n; sz *= 2) {
            for (int lo = 0; lo < n-sz; lo += sz+sz) {
                mergeFast(data, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, n-1));
            }
        }
    }
}
