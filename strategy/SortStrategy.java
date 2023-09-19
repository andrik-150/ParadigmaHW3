package seminar_3.strategy;

import java.util.Arrays;
import java.util.List;


public class SortStrategy {

private iSortStrategy sortStrategy;

    public SortStrategy(iSortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] array){
        return sortStrategy.sort(array);
    }

}