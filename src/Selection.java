public class Selection extends Sort {

     public static void sort(Comparable data[]) {
         int min;
         for (int i = 0; i < data.length; i++) {
             min = i;
             for (int j = i+1; j < data.length; j++) {
                 if (less(data[j], data[min]))
                     min = j;
             }
             exch(data, i, min);
         }
     }
}
