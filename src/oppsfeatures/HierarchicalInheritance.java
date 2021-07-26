package oppsfeatures;

class A {
    public void print_We() {
        System.out.println("We");
    }
}

class B extends A {
    public void print_love() {
        System.out.println("Love");
    }
}

class C extends A {
    public void print_India() {
        System.out.println("India");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        C g = new C();
        g.print_We();
        Two t = new Two();
        t.print_love();
        g.print_India();
    }
}
