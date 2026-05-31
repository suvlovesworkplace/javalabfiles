import aanimals.Animal;

public class Main {
 
    public static void main(String[] args) {

        Animal a = new Animal();

        System.out.println(a.name); // ✅ public only

        a.publicMethod(); // ✅

        // a.type; ❌ protected (not subclass here)
        // a.habitat; ❌ default (package-only)
        // a.privateMethod(); ❌ private

        a.showPrivateAccess(); // ✅ indirect access to private method
    }
}