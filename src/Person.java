public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String partner;

    public Person(String firstName, String lastName, int age, String partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }


    public abstract boolean isRetired();

    public abstract String registerPartnership();

    public String deregisterPartnership() {
        return getLastName();
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPartner() {
        return partner;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPartner(String partner) {
        this.partner = partner;
    }
}
