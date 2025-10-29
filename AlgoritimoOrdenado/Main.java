public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        System.out.println("VETOR 1: SEMI ORDENADO");
        testar(vetor1);

        System.out.println("\nVETOR 2: ORDENADO (melhor caso)");
        testar(vetor2);

        System.out.println("\nVETOR 3: INVERTIDO (pior caso)");
        testar(vetor3);
    }

    static void testar(int[] v) {
        int n = v.length;
        Sort.gnomeSort(v.clone(), n);
        Sort.cocktailSort(v.clone(), n);
        Sort.combSort(v.clone(), n);
        Sort.bubbleSort(v.clone(), n);
        Sort.bucketSort(v.clone(), n);
        Sort.selectionSort(v.clone(), n);
    }
}
