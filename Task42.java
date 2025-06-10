// Custom unchecked exception class
class InvalidVoterAgeException extends RuntimeException {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

// Voter class
class Voter {
    int voterId;
    String name;
    int age;

    // Constructor
    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Task42 {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(100, "surya", 22);
            v1.display();

           
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
