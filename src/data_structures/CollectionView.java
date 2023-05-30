package data_structures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

    /** INSTRUCTIONS
     *
     * A map is given to you below, with some data inserted into it.
     *
     * Retrieve the Collection view of the values present in map
     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        map.put(2, "LA");
        map.put(4, "Boston");
        map.put(1, "NYC");
        map.put(3, "Denver");

//    Collection<String> values =map.values();
//     for (String value : values){
//         System.out.println(value);
    // }
        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println(" This is another way to retrieve the collection view of the values");
        // second method to retrieve values
        for (Integer in:map.keySet()) {
            System.out.println(in + " : " + map.get(in));
        }

    }

}
