package aanimals;

public class Lion {

    public void testAccess() {
        Animal a = new Animal();

        System.out.println(a.name); // ✅ public
        System.out.println(a.type); // ✅ protected (same package)
        System.out.println(a.habitat); // ✅ default (same package)

        a.publicMethod();   // ✅
        a.protectedMethod(); // ✅
        a.defaultMethod();   // ✅

        // a.privateMethod(); ❌ not allowed
    }
}