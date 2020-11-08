import java.util.LinkedList;
//I added this to Github

public class linkedListsPractise {
    public static void main(String[] args) throws Exception {

        LinkedList<String> List = new LinkedList<>();

        List.add("Adam"); // Index 0
        List.add("Brian");// Index 1
        List.add("Conor");// Index 2
        List.add("David");// Index 3

        List.add(4, "Eoin");
        List.add(5, "Fionn");

        List.remove(0);// Index 0 becomes Brian

        List.set(0, "Brian is first");

        List.addLast("George is last");

        for (String x : List) {

            System.out.println(x);
        }

        List.clear();

    }
}
