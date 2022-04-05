package FactoryMethod;

public class Man implements Person{
    private String gender;

    public Man() {
        this.gender = "Man";
    }

    @Override
    public void PrintGender() {
        System.out.println("I am a monkey"+ gender);
    }

}
