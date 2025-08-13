// ================== 1. ArrayReverseSearch ==================
import java.util.*;

public class ArrayReverseSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Array in reverse order:");
        for (int i = n - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();

        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int x : arr) if (x == key) { found = true; break; }

        System.out.println(key + (found ? " is present in the array." : " is NOT present in the array."));
        sc.close();
    }
}

// ================== 2. CountdownExample (Threads) ==================
class CountdownThread extends Thread {
    private int start;
    public CountdownThread(int start) { this.start = start; }
    public void run() {
        for (int i = start; i >= 0; i--) {
            System.out.println(getName() + " -> " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println(getName() + " finished!");
    }
}

class CountdownExample {
    public static void main(String[] args) {
        CountdownThread t1 = new CountdownThread(5);
        CountdownThread t2 = new CountdownThread(3);
        t1.start();
        t2.start();
    }
}

// ================== 3. Compile-Time Polymorphism (Area Calculator) ==================
class Shape {
    int area(int side) { return side * side; }
    int area(int length, int width) { return length * width; }
    double area(double radius) { return 3.14 * radius * radius; }
}

class CompileTimePoly {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Square: " + s.area(5));
        System.out.println("Rectangle: " + s.area(4, 6));
        System.out.println("Circle: " + s.area(3.0));
    }
}

// ================== 4. Run-Time Polymorphism (Payment System) ==================
class Payment {
    void pay() { System.out.println("Processing generic payment"); }
}

class CreditCard extends Payment {
    void pay() { System.out.println("Processing credit card payment"); }
}

class UPI extends Payment {
    void pay() { System.out.println("Processing UPI payment"); }
}

class RunTimePoly {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCard();
        p.pay();
        p = new UPI();
        p.pay();
    }
}

// ================== 5. SingleInheritance ==================
class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}

class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

// ================== 6. HierarchicalInheritance ==================
class Animal2 {
    void sound() { System.out.println("Animal sound"); }
}

class Dog2 extends Animal2 {
    void bark() { System.out.println("Dog barks"); }
}

class Cat2 extends Animal2 {
    void meow() { System.out.println("Cat meows"); }
}

class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.sound();
        d.bark();

        Cat2 c = new Cat2();
        c.sound();
        c.meow();
    }
}

// ================== 7. MultipleInheritance (via Interfaces) ==================
interface Walkable {
    void walk();
}

interface RunnableX {
    void run();
}

class Human implements Walkable, RunnableX {
    public void walk() { System.out.println("Human walks"); }
    public void run() { System.out.println("Human runs"); }
}

class MultipleInheritance {
    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.run();
    }
}

// ================== 8. MultilevelInheritance ==================
class Animal3 {
    void eat() { System.out.println("Animal eats"); }
}

class Dog3 extends Animal3 {
    void bark() { System.out.println("Dog barks"); }
}

class Puppy extends Dog3 {
    void weep() { System.out.println("Puppy weeps"); }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

// ================== 9. HybridInheritance (Using Interfaces) ==================
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C {
    void methodC() { System.out.println("Class C method"); }
}

class D extends C implements A, B {
    public void methodA() { System.out.println("Interface A method"); }
    public void methodB() { System.out.println("Interface B method"); }
}

class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodC();
        obj.methodA();
        obj.methodB();
    }
}
