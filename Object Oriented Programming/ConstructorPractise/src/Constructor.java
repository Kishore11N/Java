
//The object class
class cuboid {
    int length;
    int breadth;
    int height;

    /*
     * This constructor is now used whenever an object of type cuboid is created
     * instead of Java's default constructor. The constructor always prints out a
     * String and sets the initial length, breadth and height of any cuboid to 10.
     */
    public cuboid() {

        System.out.println("Using the first object constructor instead of default constructor");

        length = 10;
        breadth = 10;
        height = 10;

    }

    /*
     * This constructor is used whenever an object of type cuboid with parameters is
     * created. The constructor always prints out a String and it is used if a
     * cuboid is created with parameters. You could have an empty cuboid()
     * constructor if you want to set the parameters yourself after the cuboid has
     * been declared, instead of during declaration.
     */
    public cuboid(int length, int breadt, int height) {

        System.out.println("Using the second object constructor instead of default constructor");

        this.length = length; // The "this keyword refers to the length of the partiular cuboid in
                              // construction."
        this.breadth = breadt;
        this.height = height;

    }

    /*
     * The function get volume exists within the object class and as we have already
     * declared width,breadth and height, so no need for parameters. The function
     * getVolume can be applied to any cuboid object.
     */

    public int getVolume() {

        int volume = length * breadth * height;

        return volume;
    }

}

public class Constructor {
    public static void main(String[] args) throws Exception {

        cuboid shape1 = new cuboid();

        shape1.length = 15; // You can change the values that length, breadth and height were intialised to.
        shape1.breadth = 20;
        shape1.height = 25;

        System.out.println("The volume of the shape is " + shape1.getVolume());

        cuboid shape2 = new cuboid(10, 15, 20);

        System.out.println("The volume of the shape is " + shape2.getVolume());
    }
}
