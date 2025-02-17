package oblig3.model;

public class Person {

    private String firstName;
    private String lastName;
    private String fullName;

    public Person (String firstName, String lastName, String fullName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, firstName + " " + lastName);
    }

    @Override
    public String toString() {
        return getfullName();
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getfullName() {
        return fullName != null ? fullName : firstName + " " + lastName;
    }


}
