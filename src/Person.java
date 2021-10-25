public class Person {
    String firstName, lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void print() {
        System.out.println(firstName + " " + lastName);
    }
}
