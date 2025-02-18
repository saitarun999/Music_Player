import java.util.*;
public class SetExample {
    public static void main(String args[]){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        //printing elements of set
        System.out.println(set);
        //removing element 2
        set.remove(2);
        System.out.println(set);
        //checking if set contains 3
        System.out.println(set.contains(3));
        //getting size of set
        System.out.println(set.size());
        //checking if set is empty
        System.out.println(set.isEmpty());
        //iterating through set
        //for loop
        for(int i : set){
            System.out.print(i+" ");
        }
        //iterator
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        //forEach
        set.forEach(i -> System.out.print(i+" "));
        //clearing set
        set.clear();
        System.out.println(set);
    }
}
