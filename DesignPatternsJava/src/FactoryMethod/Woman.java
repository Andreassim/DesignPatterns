package FactoryMethod;

public class Woman implements Person {
    private String gender;

    public Woman() {
        this.gender = "Woman";
    }

    @Override
    public void PrintGender() {
        System.out.println("I am a" + gender);
    }
}
