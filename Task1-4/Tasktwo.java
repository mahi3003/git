public class Tasktwo {
    String name;
    int age;

    
    public Tasktwo(String name) {
        this.name = name;
        this.age = 18;
    }

   
    public Tasktwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    public static void main(String[] args) {
        Tasktwo p1 = new Tasktwo("Bindhu");
        Tasktwo p2 = new Tasktwo("JANU", 25);

        System.out.println("Person 1:");
        p1.displayInfo();

        System.out.println("\nPerson 2:");
        p2.displayInfo();
    }
}
