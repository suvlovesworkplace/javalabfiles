package pets;

import aanimals.Animal;

public class Dog extends Animal {

    public void testAccess() {

        System.out.println(name); // ✅ public (inherited)
        System.out.println(type); // ✅ protected (inheritance allowed)

        // System.out.println(habitat); ❌ default (different package)

        publicMethod();     // ✅
        protectedMethod();  // ✅ (inherited)

        // defaultMethod(); ❌ not accessible
        // privateMethod(); ❌ not accessible
    }
}
