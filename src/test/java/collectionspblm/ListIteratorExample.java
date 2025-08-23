package collectionspblm;
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Mary", "Steve"));

        ListIterator<String> listIt = names.listIterator();     //backward iteratration is posible only when we use listIterator method.
                                                            //listIterator has remove fn.
        System.out.println("Forward iteration:");
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("Backward iteration:");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
        // Get Iterator
        Iterator<String> n = names.iterator();

        System.out.println("Iterating using Iterator:");
        while (n.hasNext()) {
            String username = n.next();
            System.out.println(username);
//Finding error and fixing
            Set<String> treeSet = new TreeSet<>();

            treeSet.add("Delhi");
            treeSet.add("Mumbai");
            treeSet.add("Bangalore");
            treeSet.add("Chennai");
            System.out.println("TreeSet (sorted order): " + treeSet);

            // first(), last() - Only available in TreeSet
            System.out.println("First: " + ((TreeSet<String>) treeSet).first());
            System.out.println("Last: " +  ((TreeSet<String>) treeSet).last());

        }
    }
}
