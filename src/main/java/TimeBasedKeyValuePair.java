import java.util.*;

public class TimeBasedKeyValuePair {
    Map<String, List<Pairs>> timeMap;
    public TimeBasedKeyValuePair() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (timeMap.containsKey(key)) {
            timeMap.get(key).add(new Pairs(value, timestamp));
        } else {
            List<Pairs> newPairs = new ArrayList<>();
            newPairs.add(new Pairs(value, timestamp));
            timeMap.put(key, newPairs);
        }
    }

    public String get(String key, int timestamp) {

        if(!timeMap.containsKey(key)) return "";

        List<Pairs> valueTimePairsList = timeMap.get(key);
        return isClosestPick(valueTimePairsList, timestamp);
    }

    public String isClosestPick(List<Pairs> valueTimePairsList, int timestamp) {
        int l = 0;
        int r = valueTimePairsList.size();

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (valueTimePairsList.get(m).timeStamp <= timestamp) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return  (valueTimePairsList.get(l).timeStamp > timestamp) ? " " : valueTimePairsList.get(l).value ;
    }


    public static void main(String[] args) {

    }

}

class Pairs {
    String value;
    int timeStamp;

    public Pairs(String value, int timeStamp) {
        this.value = value;
        this.timeStamp = timeStamp;
    }
}
