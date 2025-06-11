
class Emp {
    String name;
    int age;

  
    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Emp {
    String employeeID;
    double salary;

    
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age);  
        this.employeeID = employeeID;
        this.salary = salary;
    }

    
    public void displayEmployee() {
        displayPerson(); 
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    
    public static void main(String[] args) {
        Employee emp = new Employee("karan", 40, "EMP11", 50000);
        emp.displayEmployee();
    }
}
