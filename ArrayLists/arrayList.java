import java.util.ArrayList;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrL = new ArrayList<Integer>();

        arrL.add(1); //Index 0
        arrL.add(2); //Index 1 
        arrL.add(3); //Index 2 
        arrL.add(4); //Index 3 
        
        arrL.set(0,100); //Changing value set at index 0
        
        System.out.println("First element = " + arrL.get(0) + ".\n" + "Size = " + arrL.size());

        arrL.remove(0);

        System.out.println("First element removed\nNew size = " + arrL.size());

        printElements(arrL);

        arrL.clear();
        
        System.out.println("All elements removed\nNew size = " + arrL.size());

    }

    public static void printElements(ArrayList<Integer>arrayList){
        System.out.println("Current elements =");
        for (Integer x : arrayList) {
            System.out.println(x);
        }
    }






}
