public class Shell extends Sort {
    public static void sort(Comparable data[]) {
        int n = data.length;
        int h = 1;
        while (h < n/3) h = 3*h+1;
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(data[j], data[j-h]) ; j-=h) {
                    exch(data, j, j-h);
                }
            }
            h /= 3;
        }
    }
    public static void sortFast(Comparable data[]) {
        int n = data.length;
        int[] hArr = new int[]{1, 5, 19, 41, 109, 209, 505, 929, 2161, 3905, 8929, 16001, 36289, 64769, 146305, 260609};
        int hIndexer = hArr.length - 1;
        while (hArr[hIndexer] > n) hIndexer--;
        while (hIndexer >= 0) {
            for (int i = hArr[hIndexer]; i < n; i++) {
                for (int j = i; j >= hArr[hIndexer] && less(data[j], data[j-hArr[hIndexer]]) ; j-=hArr[hIndexer]) {
                    exch(data, j, j-hArr[hIndexer]);
                }
            }
            hIndexer--;
        }
    }
}
