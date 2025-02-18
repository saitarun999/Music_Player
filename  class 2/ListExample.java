import java.util.*;
public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //printing elements of list
        System.out.println(list);
        //adding element at index 1
        list.add(1, 4);
        System.out.println(list);
        //removing element at index 2
        list.remove(2);
        System.out.println(list);
        //getting element at index 1
        System.out.println(list.get(1));
        //setting element at index 1
        list.set(1, 5);
        System.out.println(list);
        //checking if list contains 3
        System.out.println(list.contains(3));
        //getting index of 3
        System.out.println(list.indexOf(3));
        //getting size of list
        System.out.println(list.size());
        //checking if list is empty
        System.out.println(list.isEmpty());
        //iterating through list
        //for loop
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        //enhanced for loop
        for(int i : list){
            System.out.print(i+" ");
        }
        //iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        //forEach
        list.forEach(i -> System.out.print(i+" "));
        //clearing list
        list.clear();
        System.out.println(list);


    }
}
