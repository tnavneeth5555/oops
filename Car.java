interface Car {

    /* Data Abstraction is the property by virtue of which only the essential details are displayed to the user.
    The trivial or non-essential units are not displayed to the user.

    Hiding the actual implementation of the method and these methods will be implemented in class which extends this interface or
    abstract class
    Ex- Car is the interface -> its methods are like music system, horningSound etc .
    Each car like i20, swift , bmw, audi will implemetn these methods
    */
    void hornSound();
    String musicCompany();
};

class BMW implements Car {

    @Override
    public void hornSound() {
        System.out.println("keek keek");
    }

    @Override
    public String musicCompany() {
        String music_company = "Sony";
        System.out.println("Music Company of BMW is " + music_company );
        return music_company;
    }
}