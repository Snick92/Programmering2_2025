package oblig3.model;

public class Role {

    private String roleFirstName;
    private String roleLastName;
    private Person actor;
    
    public Role(String roleFirstName, String roleLastName, Person actor) {
        this.roleFirstName = roleFirstName;
        this.roleLastName = roleLastName;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return roleFirstName + " " + roleLastName + " spilt av " + actor;
    }

    public String getRoleFirstName() {
        return roleFirstName;
    }

    public void setRoleFirstName(String roleFirstName) {
        this.roleFirstName = roleFirstName;
    }

    public String getRoleLastName() {
        return roleLastName;
    }

    public void setRoleLastName(String roleLastName) {
        this.roleLastName = roleLastName;
    }

    public Person getActor() {
        return actor;
    }

    public void setActor(Person actor) {
        this.actor = actor;
    }

}
