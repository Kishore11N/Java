import java.util.*;

public class hashSet {
    public static void main(String[] args) throws Exception {

        HashSet<String> h = new HashSet<String>();

        h.add("Adam");
        h.add("Ben");
        h.add("Conor");
        h.add("David");
        h.add("Adam"); // This doesn't get printed out as its a duplicate element.

        System.out.println(h + "\n");

        Iterator<String> Itr = h.iterator();

        while (Itr.hasNext()) {

            System.out.println(Itr.next() + "\n");

        }

        h.remove("Ben");

        System.out.println(h);

        h.clear(); //Set has been cleared

        System.out.println(h);

    }
}
