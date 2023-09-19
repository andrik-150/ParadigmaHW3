package seminar_3.strategy;

public class BubleSort implements iSortStrategy{

    @Override
    public int[] sort(int[] array) {
        int buffer = 0;
        boolean repeat = true;

        while (repeat){
            repeat = false;
            for (int j = 0; j < array.length-1; j++){
                if(array[j] > array[j+ 1]) {
                    buffer = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buffer;
                    repeat = true;
                }
            }
        }
        return array;
    }
}