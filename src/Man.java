public class Man extends Person{

    public Man(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 65;
    }

    @Override
    public String registerPartnership(){
       return getLastName();
    }
}
