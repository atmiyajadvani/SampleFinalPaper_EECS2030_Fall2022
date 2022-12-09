import java.util.*;

public class Q2_RandomGenerator {

    public static void main(String[] args) {
        // creates three maps
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map3 = new HashMap<Integer, Integer>();

        // initializes the three maps
        for (int i = 0; i <= 10; i++) {
            map1.put(i, i);
            map2.put(i, i);
            if (i >= 5) {
                map3.put(i, i);
            }
        }

        // creates three objects of RandomGenerator using the maps defined above.
        RandomGenerator randomList1 = new RandomGenerator(map1);
        RandomGenerator randomList2 = new RandomGenerator(map2);
        RandomGenerator randomList3 = new RandomGenerator(map3);

        // Two random lists are equal, if all their "keys" are the same
        System.out.println(randomList1.equals(randomList2));
        System.out.println(randomList1.equals(randomList3));

        // prints 0 because the two maps are equal
        System.out.println(randomList1.compareTo(randomList2));

        // prints 1 because the two maps are not equal and the
        // size of the map in randomList1 > size of the map in randomList3
        System.out.println(randomList1.compareTo(randomList3));

        // prints -1 because the two maps are not equal and the
        // size of the map in randomList3 < size of the map in randomList1
        System.out.println(randomList3.compareTo(randomList1));
    }
}

class RandomGenerator implements Comparable<RandomGenerator> {
    HashMap<Integer, Integer> aMap;
    HashSet<Integer> keys = new HashSet<Integer>();
    public RandomGenerator(HashMap<Integer, Integer> map) {
        aMap = new HashMap<Integer, Integer>();
        // keys attribute holds all the keys of the map
        keys.addAll(map.keySet());
        for (Integer obj : keys) {
            if (obj % 3 == 0) {
                aMap.put(obj, map.get(obj));
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        boolean equal = true;
        RandomGenerator mymap = (RandomGenerator) obj;

        if (this.keys.equals(mymap.keys)) {
            return equal;
        }

        if (!(mymap instanceof RandomGenerator) || !(this.keys.equals(mymap.keys))) {
            equal = false;
        }

        return equal;
    }

    @Override
    public int compareTo(RandomGenerator obj) {
        RandomGenerator mymap = (RandomGenerator) obj;

        if (this.equals(mymap)) {
            return 0;
        } else if (this.aMap.size() < mymap.aMap.size()) {
            return -1;
        } else {
            return 1;
        }
    }
}