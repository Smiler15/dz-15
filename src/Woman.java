public class Woman extends Person{

    public Woman(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 65;
    }
    @Override
    public String registerPartnership() {
        return getPartner();
    }
}