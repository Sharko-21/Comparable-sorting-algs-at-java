import java.util.Random;

public class SortRandomCompare {
    private static double getTime(String sortAlg, Double[] data) {
        long start = System.currentTimeMillis();
        if (sortAlg.equals("bubble")) Bubble.sort(data);
        if (sortAlg.equals("selection")) Selection.sort(data);
        if (sortAlg.equals("insertion")) Insertion.sort(data);
        if (sortAlg.equals("shell")) Shell.sort(data);
        if (sortAlg.equals("shellfast")) Shell.sortFast(data);
        if (sortAlg.equals("merge")) Merge.sort(data);
        if (sortAlg.equals("mergebu")) MergeBU.sort(data);
        if (sortAlg.equals("quick")) Quick.sort(data);
        if (sortAlg.equals("quick3")) Quick3.sort(data);
        if (sortAlg.equals("heap")) Heap.sort(data);
        return (System.currentTimeMillis() - start) / 1000.0;
    }
    static double getRandomInputTime(String sortAlg, int N, int T) {
        double total = 0.0;
        Random random = new Random();
        Double[] data = new Double[N];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < N; j++)
                data[j] = random.nextDouble();
            total += getTime(sortAlg, data);

        }
        return total / T;
    }

    public static void main(String[] args) {
        int t = 10;
        System.out.println("Random numbers test: ");
        for (int n = 1000; n < Math.pow(2, 100); n*=5) {
            System.out.println(n + ": ");
            System.out.println("Bubble sort: " + SortRandomCompare.getRandomInputTime("bubble", n, t));
            System.out.println("Selection sort: " + SortRandomCompare.getRandomInputTime("selection", n, t));
            System.out.println("Insertion sort: " + SortRandomCompare.getRandomInputTime("insertion", n, t));
            System.out.println("Shell sort: " + SortRandomCompare.getRandomInputTime("shell", n, t));
            System.out.println("Shell fast sort: " + SortRandomCompare.getRandomInputTime("shellfast", n, t));
            System.out.println("Merge sort: " + SortRandomCompare.getRandomInputTime("merge", n, t));
            System.out.println("MergeBU sort: " + SortRandomCompare.getRandomInputTime("mergebu", n, t));
            System.out.println("Quick sort: " + SortRandomCompare.getRandomInputTime("quick", n, t));
            System.out.println("Quick3 sort: " + SortRandomCompare.getRandomInputTime("quick3", n, t));
            System.out.println("Heap sort: " + SortRandomCompare.getRandomInputTime("heap", n, t));
            System.out.println();
        }

    }

}
