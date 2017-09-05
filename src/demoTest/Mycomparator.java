package demoTest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

class Mycomparator implements Comparator<Map.Entry<Integer,List<policy>>> {

    final int compareIndex;

    public Mycomparator(int compareIndex) {
        this.compareIndex = compareIndex;
    }

    @Override
    public int compare(Map.Entry<Integer, List<policy>> me1, Map.Entry<Integer, List<policy>> me2) {

        Object item1 = me1.getValue().get(compareIndex);
        Object item2 = me2.getValue().get(compareIndex);
        int compareResult = 0;

        if(item1 instanceof String && item2 instanceof String) {
            compareResult = ((String)item1).compareTo((String)item2);
        }
//        else if(item1 instanceof Double && item2 instanceof Double) {
//            compareResult = (int)((double)item1 - (double)item2);
//        } else {
//            // invalid comparison perhaps?
//        }

        return compareResult;
    }
}

