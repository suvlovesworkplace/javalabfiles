package aanimals;

public class Animal {

    public String name = "Generic Animal";     // public
    protected String type = "Mammal";          // protected
    String habitat = "Forest";                 // default
    private String secret = "Hidden Info";     // private

    public void publicMethod() {
        System.out.println("Public method: Eat");
    }

    protected void protectedMethod() {
        System.out.println("Protected method: Sleep");
    }

    void defaultMethod() {
        System.out.println("Default method: Walk");
    }

    private void privateMethod() {
        System.out.println("Private method: Secret behavior");
    }

    public void showPrivateAccess() {
        privateMethod(); // ✅ only accessible inside same class
    }
}