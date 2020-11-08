
class Student {
    String name;
    int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ObjectOrient {
    public static void main(String[] args) throws Exception {
        Student Student1 = new Student();

        Student1.setName("Mark"); // Can also say Student1.name = "Mark"
        Student1.setAge(18); // Can also say Student1.age = 18

        System.out.println("The student's name is " + Student1.getName() + "." + "\nThe student's age is " + Student1.getAge() + ".");

    }

}