public class Woman extends Person{

    public Woman(String firstName, String lastName, int age, Man partner) {
        super(firstName, lastName, age);
        this.setPartner(partner);
        partner.setPartner(this);
    }

    public Woman(String firstName, String lastName, int age) {
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
        maidenName=this.getLastName();
        partner.setLastName(this.getLastName());
    }

    @Override
    public void deregisterPartnership(boolean returnToMaidenName) {
        if (returnToMaidenName){
            this.setLastName(maidenName);
        }
        this.getPartner().setPartner(null);
        this.setPartner(null);
    }
}