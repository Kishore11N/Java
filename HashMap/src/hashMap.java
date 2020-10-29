import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) throws Exception {
       
        HashMap<String,Integer> hashmap = new HashMap<>(); // Initialising a new HashMap

        hashmap.put("Kishore", 19); // Adding values into the Hashmap
        hashmap.put("Aaron",20);
        hashmap.put("Kyle",21);
        hashmap.put(null,22);

        hashmap.remove("Kishore"); //Removing the key "Kishore" and the associated value

        
        System.out.println("The keys within the hashmap are " + hashmap.keySet() + "\n"); 
        System.out.println("The values within the hashmap are " + hashmap.values()+ "\n");
        System.out.println("The size of the hashmap is " + hashmap.size() + "\n");

        hashmap.replace(null,23); // Replacing the value of the "null" key with 23.

        System.out.println(hashmap.containsValue(23)+ "\n");//Checking to see that the replacement has gone through.
        System.out.println(hashmap.containsValue(22));





    }
}
