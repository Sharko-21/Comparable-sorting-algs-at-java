public class Bubble extends SortStructure{
    public static void sort(Comparable data[]) {
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < i; j++) {
                if (less(data[i], data[j]))
                    exch(data, i, j);
            }
        }
    }
}
