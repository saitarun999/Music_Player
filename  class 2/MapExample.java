import java.util.*;
public class MapExample {
    public static void main(String args[]){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        //printing elements of map
        System.out.println(map);
        //removing element with key 2
        map.remove(2);
        System.out.println(map);
        //checking if map contains key 3
        System.out.println(map.containsKey(3));
        //checking if map contains value "One"
        System.out.println(map.containsValue("One"));
        //getting size of map
        System.out.println(map.size());
        //checking if map is empty
        System.out.println(map.isEmpty());
        //iterating through map
        //for loop
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.print(entry.getKey()+" "+entry.getValue()+" ");
        }
        //forEach
        map.forEach((k, v) -> System.out.print(k+" "+v+" "));
        //iterators
        //keySet iterator
        Iterator<Integer> keyIt = map.keySet().iterator();
        while(keyIt.hasNext()){
            int key = keyIt.next();
            System.out.print(key+" "+map.get(key)+" ");
        }
        //entrySet iterator
        Iterator<Map.Entry<Integer, String>> entryIt = map.entrySet().iterator();
        while(entryIt.hasNext()){
            Map.Entry<Integer, String> entry = entryIt.next();
            System.out.print(entry.getKey()+" "+entry.getValue()+" ");
        }
        //clearing map
        map.clear();
    }
}
