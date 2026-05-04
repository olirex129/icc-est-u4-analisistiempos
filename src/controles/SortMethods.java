package controles;

public class SortMethods {

    public void sortBubble(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

    }

    public void sortBubbleAvan(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j + 1] = array[j];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }

    }
    
    public void shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
             }
            }
        }

}