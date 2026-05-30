/*
Inheritance in Java means creating a child class from an existing parent class.

Uses of inheritance:
- To reuse common code from a parent class.
- To avoid writing the same fields and methods again and again.
- To create real-world "is-a" relationships, such as Student is a Person.
- To support method overriding and runtime polymorphism.
- To build organized class hierarchies.

Main things shown in this example:
1. Single inheritance: Student extends Person
2. Multilevel inheritance: ScholarshipStudent extends Student
3. Hierarchical inheritance: Teacher and Student both extend Person
4. Method overriding
5. Runtime polymorphism
6. super keyword
7. Constructor chaining
8. protected members
9. private members accessed using getters
10. abstract class
11. final method
12. Interface implementation
13. Upcasting and instanceof
*/

// Interface:
// Role: Defines a rule/contract that a class promises to follow.
// Use: Java does not support multiple inheritance using classes, but a class
// can implement multiple interfaces.
// Property: All methods in an interface are public and abstract by default.
interface Payable {
    void payFee(double amount);
}

// Abstract class:
// Role: Works as a parent class that should not be used to create direct objects.
// Use: Stores common data and behavior for all child classes.
// Property: It can have normal methods, fields, constructors, and abstract methods.
abstract class Person {
    // private member:
    // Role: Keeps data hidden inside the class.
    // Use: Protects data from being changed directly by child classes.
    // Property: Child classes cannot access it directly, so they use getName().
    private String name;

    // protected member:
    // Role: Allows child classes to reuse the parent's data.
    // Use: Good when a field should be available to subclasses.
    // Property: Accessible inside the same package and inside child classes.
    protected int age;

    // Constructor:
    // Role: Initializes object data when an object is created.
    // Use in inheritance: Parent constructor runs before child constructor.
    // Property: Constructors are not inherited, but they are called using super().
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }

    // Getter method:
    // Role: Gives controlled access to a private field.
    // Use: Child classes can read private data without directly touching it.
    String getName() {
        return name;
    }

    // Inherited method:
    // Role: Common behavior shared by all child classes.
    // Use: Student, Teacher, and ScholarshipStudent can reuse this method.
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method:
    // Role: Forces every non-abstract child class to provide its own version.
    // Use: Every Person has a role, but the role is different for Student and Teacher.
    // Property: It has no body in the abstract parent class.
    abstract void role();

    // final method:
    // Role: Provides behavior that child classes are not allowed to change.
    // Use: Useful for rules or fixed information that must remain the same.
    // Property: A final method cannot be overridden.
    final void country() {
        System.out.println("Country: Nepal");
    }
}

// Single inheritance:
// Role: A child class inherits from one parent class.
// Use: Student reuses name, age, displayInfo(), getName(), and country() from Person.
// Property: Java allows a class to extend only one class.
class Student extends Person implements Payable {
    protected int rollNo;
    private String course;

    Student(String name, int age, int rollNo, String course) {
        // super keyword:
        // Role: Refers to the immediate parent class.
        // Use: Here it calls the Person constructor.
        // Property: super(...) must be the first statement in the child constructor.
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
        System.out.println("Student constructor called");
    }

    // Method overriding:
    // Role: Child class gives its own version of a parent method.
    // Use: Student has a different role from Teacher.
    // Property: Method name, return type, and parameters must match the parent method.
    @Override
    void role() {
        System.out.println(getName() + " is a student.");
    }

    // Overriding an inherited normal method:
    // Role: Adds child-specific details while still reusing parent behavior.
    // Use: Student displays Person information plus roll number and course.
    @Override
    void displayInfo() {
        // super.methodName():
        // Role: Calls the parent class version of an overridden method.
        // Use: Avoids rewriting the name and age printing code.
        super.displayInfo();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    // Interface implementation:
    // Role: Provides the body of a method declared in an interface.
    // Use: Student promises to support paying fees.
    // Property: Implemented interface methods must be public.
    @Override
    public void payFee(double amount) {
        System.out.println(getName() + " paid fee: Rs. " + amount);
    }

    // New child method:
    // Role: Adds behavior that exists only in the child class.
    // Use: Person does not study, but Student does.
    void study() {
        System.out.println(getName() + " is studying " + course + ".");
    }
}

// Multilevel inheritance:
// Role: A class inherits from a child class, forming a chain.
// Use: ScholarshipStudent gets features from Student and Person.
// Property: Person -> Student -> ScholarshipStudent.
class ScholarshipStudent extends Student {
    private double scholarshipAmount;

    ScholarshipStudent(String name, int age, int rollNo, String course, double scholarshipAmount) {
        // Constructor chaining:
        // Role: Calls constructors from top parent to final child.
        // Use: Person data is initialized first, then Student data, then scholarship data.
        // Property: Output shows Person constructor, then Student, then ScholarshipStudent.
        super(name, age, rollNo, course);
        this.scholarshipAmount = scholarshipAmount;
        System.out.println("ScholarshipStudent constructor called");
    }

    // Overriding again:
    // Role: Grandchild class can also override inherited methods.
    // Use: ScholarshipStudent needs a more specific role message than normal Student.
    @Override
    void role() {
        System.out.println(getName() + " is a scholarship student.");
    }

    // This method uses rollNo, which is protected in Student.
    // Role: Shows that protected members can be reused by child classes.
    void showScholarship() {
        System.out.println("Roll No " + rollNo + " received scholarship: Rs. " + scholarshipAmount);
    }
}

// Hierarchical inheritance:
// Role: Multiple child classes inherit from the same parent class.
// Use: Student and Teacher both reuse Person features.
// Property: This is allowed in Java because each child still extends only one parent.
class Teacher extends Person {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher constructor called");
    }

    // Teacher gives a different implementation of the abstract role() method.
    @Override
    void role() {
        System.out.println(getName() + " is a teacher.");
    }

    // Teacher also customizes displayInfo() for teacher-specific data.
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    // New child method:
    // Role: Adds behavior specific to Teacher.
    void teach() {
        System.out.println(getName() + " is teaching " + subject + ".");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("----- Single inheritance -----");
        // Student object can use:
        // 1. its own members: rollNo, course, study(), payFee()
        // 2. inherited Person members: age, displayInfo(), getName(), country()
        Student student = new Student("Aayush", 20, 101, "Java");
        student.displayInfo();
        student.role();
        student.study();
        student.payFee(15000);
        student.country();

        System.out.println("\n----- Multilevel inheritance -----");
        // ScholarshipStudent inherits from Student, and Student inherits from Person.
        // This proves that inherited features can travel through multiple levels.
        ScholarshipStudent scholarshipStudent =
                new ScholarshipStudent("Sita", 21, 102, "OOP", 5000);
        scholarshipStudent.displayInfo();
        scholarshipStudent.role();
        scholarshipStudent.showScholarship();

        System.out.println("\n----- Hierarchical inheritance -----");
        // Teacher and Student are different child classes of the same parent Person.
        // Both share Person features, but each has its own extra behavior.
        Teacher teacher = new Teacher("Mr. Sharma", 35, "Computer Science");
        teacher.displayInfo();
        teacher.role();
        teacher.teach();

        System.out.println("\n----- Runtime polymorphism -----");
        // Upcasting:
        // Role: Storing a child object in a parent reference variable.
        // Use: Makes code flexible because one Person reference can point to different child objects.
        // Property: Only parent-level methods can be called directly using the parent reference.
        Person p1 = new Student("Ram", 19, 103, "Database");
        Person p2 = new Teacher("Ms. Rai", 30, "Networking");

        // Runtime polymorphism:
        // Role: Java decides at runtime which overridden method to run.
        // Use: The same method call, role(), behaves differently for Student and Teacher.
        // Property: It works through method overriding and parent class references.
        p1.role(); // Student version runs
        p2.role(); // Teacher version runs

        System.out.println("\n----- instanceof check -----");
        // instanceof:
        // Role: Checks the real object type before downcasting.
        // Use: Prevents ClassCastException.
        // Property: Returns true if the object belongs to that class or its child class.
        if (p1 instanceof Student) {
            // Downcasting:
            // Role: Converts a parent reference back to a child reference.
            // Use: Allows access to child-specific methods like study().
            // Property: Should be done only after checking with instanceof.
            Student convertedStudent = (Student) p1;
            convertedStudent.study();
        }
    }
}
