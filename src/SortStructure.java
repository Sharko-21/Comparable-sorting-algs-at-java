class SortStructure {
    private static void sort(Comparable data[]){}
    static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    static void exch(Comparable data[], int i, int j) {
        Comparable temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    static void show(Comparable data[]) {
        for (Comparable aData : data) {
            System.out.print(aData + " ");
        }
        System.out.println();
    }
    static boolean isSorted(Comparable data[]) {
        for (int i = 1; i < data.length; i++) {
            if (less(data[i], data[i-1]))
                return false;
        }
        return true;
    }
}
