package seminar_3.strategy;

public class SelectionSort implements iSortStrategy{
    @Override
    public int[] sort(int[] array) {
        boolean change = false;

        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            int buffer = 0;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                    change = true;
                }
            }
            if (change) {
                buffer = array[left];
                array[left] = array[minInd];
                array[minInd] = buffer;
                change = false;
            }
        }
        return array;
    }
}