public class Woman extends Person{

    public Woman(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        if (getAge() >= 65);
        return true;
    }
    @Override
    public String registerPartnership() {
        return getPartner();
    }
}