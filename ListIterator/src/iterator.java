import java.util.LinkedList;
import java.util.ListIterator;

public class iterator {
    public static void main(String[] args) throws Exception {

        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("Adam");
        linkedlist.add("Bart");
        linkedlist.add("Cian");
        linkedlist.add("David");
        linkedlist.add("Eoin");

        ListIterator itr = linkedlist.listIterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next()); 
        }

        System.out.println("\n"+"\n");

        while(itr.hasPrevious()) {
            System.out.println(itr.previous());
        }


   
    
    
    
    
    
    
    
    
    
    }
}
