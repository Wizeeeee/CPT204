package ict;
import java.util.List;


public class ProperElementFinder {
    public static int maxOfProper(List<Integer> list) {
        int max = -1;
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element % (i + 1) == 0) {
                max = Math.max(max, element);
            }
        }
        return max;
    }
}