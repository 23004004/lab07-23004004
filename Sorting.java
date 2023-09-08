import java.util.*;

public class Sorting {
  public static void main(String[] args) {
    int[] array1 = {9, 4, 7, 1, 2, 5, 11, 8, 0, 3, 6, 10};
    int[] array2 = {10, 6, 3, 0, 11, 5, 2, 1, 11, 7, 4, 9};
    int[] array3 = {5, -1, -4, 6, 3, -3, 0, 4, 1, -2, 2};
    int[] array4 = {2, -2, 1, 4, 0, -3, 3, 6, -4, -1, 5};
    int[] array5 = {0, 1, 2, 3, 4, 5, 6, 7};
    int[] array6 = {7, 6, 5, 4, 3, 2, 1, 0};

    int[][] tests = {array1, array2, array3, array4, array5, array6};

    System.out.println("SORTING: \n============");
    for (int i = 0; i < tests.length; i += 1) {
      System.out.println("Sorting array #" + i + ": " + Arrays.toString(tests[i]));
      int[] array1asc = Arrays.copyOf(tests[i],tests[i].length);
      InsertionSort.ascSort(array1asc);
      int[] array1desc = Arrays.copyOf(tests[i],tests[i].length);
      InsertionSort.descSort(array1desc);
      System.out.println("Asc: " + Arrays.toString(array1asc));
      System.out.println("Desc: " + Arrays.toString(array1desc));
      System.out.println();
      InsertionSort.lastRunAsc();
      InsertionSort.lastRunDesc();
      System.out.println("--------------------------------------------");
    }
  }
}
