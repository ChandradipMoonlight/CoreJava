package oppsfeatures;

/*
 * this is example of the runtime polymorphism which is achieved by using the method overriding.
 */

class Parent {
    void print() {
        System.out.println(" Parent Class");
    }
}
class subClass1 extends Parent{
    void print() {
        System.out.println("Sub class 1");
    }
}

class SubClass2 extends Parent {
    void print() {
        System.out.println("Sub class 2");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new subClass1();
        obj.print();
        obj = new SubClass2();
        obj.print();
    }
}
