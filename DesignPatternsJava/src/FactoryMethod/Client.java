package FactoryMethod;

public class Client {
    private Person person;


    public Client(String gender) {
        this.person = create(gender);
    }

    // Factory Method?
    private Person create(String gender){
        switch (gender){
            case "Man":
                return new Man();
            case "Woman":
                return new Woman();
            default:
                throw new RuntimeException("Invalid input");
        }
    }

    public void printGender(){
        person.PrintGender();
    }

}
