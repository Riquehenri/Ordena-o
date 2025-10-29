import java.util.*;

public class Sort {

    static void gnomeSort(int[] l, int n) {
        int i = 0, iter = 0, swaps = 0;
        while (i < n) {
            iter++;
            if (i == 0 || l[i - 1] <= l[i]) i++;
            else {
                int tmp = l[i];
                l[i] = l[i - 1];
                l[i - 1] = tmp;
                swaps++;
                i--;
            }
        }
        System.out.println("GnomeSort -> iterações: " + iter + " | trocas: " + swaps);
    }

    static void combSort(int[] l, int n) {
        boolean sorted = false;
        int gap = n, iter = 0, swaps = 0;

        while (!sorted) {
            gap = (int) (gap / 1.3);
            if (gap <= 1) { gap = 1; sorted = true; }

            for (int i = 0; i + gap < n; i++) {
                iter++;
                if (l[i] > l[i + gap]) {
                    int aux = l[i];
                    l[i] = l[i + gap];
                    l[i + gap] = aux;
                    swaps++;
                    sorted = false;
                }
            }
        }
        System.out.println("CombSort -> iterações: " + iter + " | trocas: " + swaps);
    }

    static void bucketSort(int[] l, int n) {
        int iter = 0, swaps = 0;
        int max = l[0], min = l[0];

        // Encontra mínimo e máximo
        for (int i = 1; i < n; i++) {
            iter++;
            if (l[i] > max) max = l[i];
            if (l[i] < min) min = l[i];
        }

        int bucketCount = (int) Math.sqrt(n);
        int range = (max - min + 1) / bucketCount + 1;

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) buckets.add(new ArrayList<>());

        // Distribui elementos nos baldes
        for (int num : l) {
            iter++;
            int index = (num - min) / range;
            if (index >= bucketCount) index = bucketCount - 1;
            buckets.get(index).add(num);
        }

        // Ordena cada balde manualmente (bubble sort)
        int k = 0;
        for (List<Integer> bucket : buckets) {
            for (int i = 0; i < bucket.size() - 1; i++) {
                for (int j = 0; j < bucket.size() - i - 1; j++) {
                    iter++;
                    if (bucket.get(j) > bucket.get(j + 1)) {
                        int temp = bucket.get(j);
                        bucket.set(j, bucket.get(j + 1));
                        bucket.set(j + 1, temp);
                        swaps++;
                    }
                }
            }
            for (int num : bucket) l[k++] = num;
        }

        System.out.println("BucketSort -> iterações: " + iter + " | trocas: " + swaps);
    }

    static void bubbleSort(int[] l, int n) {
        boolean swapped;
        int iter = 0, swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                iter++;
                if (l[j] > l[j + 1]) {
                    int temp = l[j];
                    l[j] = l[j + 1];
                    l[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println("BubbleSort -> iterações: " + iter + " | trocas: " + swaps);
    }

    static void selectionSort(int[] l, int n) {
        int iter = 0, swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                iter++;
                if (l[j] < l[min]) min = j;
            }
            if (min != i) {
                int tmp = l[i];
                l[i] = l[min];
                l[min] = tmp;
                swaps++;
            }
        }
        System.out.println("SelectionSort -> iterações: " + iter + " | trocas: " + swaps);
    }

    static void cocktailSort(int[] l, int n) {
        boolean swapped = true;
        int start = 0, end = n - 1, iter = 0, swaps = 0;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++) {
                iter++;
                if (l[i] > l[i + 1]) {
                    int temp = l[i];
                    l[i] = l[i + 1];
                    l[i + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) break;
            swapped = false;
            end--;
            for (int i = end - 1; i >= start; i--) {
                iter++;
                if (l[i] > l[i + 1]) {
                    int temp = l[i];
                    l[i] = l[i + 1];
                    l[i + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            start++;
        }
        System.out.println("CocktailSort -> iterações: " + iter + " | trocas: " + swaps);
    }
}
