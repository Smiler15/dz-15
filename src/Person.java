public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    String maidenName;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;
    }

    public abstract boolean isRetired();

    public abstract void registerPartnership(Person partner);

    public abstract void deregisterPartnership(boolean returnToMaidenName);

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public Person getPartner() {
        return partner;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPartner(Person partner) {
        this.partner = partner;
    }
}
