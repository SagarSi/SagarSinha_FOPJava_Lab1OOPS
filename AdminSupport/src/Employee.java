public class Employee {
    String firstName;
    String lastName;

    Employee(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String fullName() {
        return firstName+lastName;
    }
}
