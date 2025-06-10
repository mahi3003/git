// Custom exception for invalid age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Constructor with validation
    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        // Check age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range (15-21)");
        }

        // Check name for digits or special characters
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name is not valid (should not contain digits or special characters)");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main class
public class Task4 {
    public static void main(String[] args) {
        try {
            // Try with a valid student
            Student s1 = new Student(101, "Ramesh Kumar", 19, "Computer Science");
            s1.displayStudent();

            // Try with invalid name or age
            // Uncomment below to test
            // Student s2 = new Student(102, "Anu123", 20, "Maths");
            // Student s3 = new Student(103, "Rahul", 23, "Physics");

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
