public class Man extends Person{

    public Man(String firstName, String lastName, int age, Woman partner) {
        super(firstName, lastName, age);
        this.setPartner(partner);
        this.getPartner().setPartner(this);
    }

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 65;
    }

    @Override
    public void registerPartnership(Person partner) {
        setPartner(partner);
        partner.setPartner(this);
    }

    @Override
    public void deregisterPartnership(boolean returnToMaidenName) {
        this.setLastName(getLastName());
        this.getPartner().setPartner(null);
        this.setPartner(null);
    }
}
