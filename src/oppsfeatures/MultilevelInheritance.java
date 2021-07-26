package oppsfeatures;

/**
 * this example of multilevel Inheritance
 */
class One {                         // this is base class
    public void print_we() {
        System.out.println("WE");
    }
}
class Two extends One {             // this is intermediate class
    public void print_love() {
        System.out.println("LOVE");
    }
}
class Three extends Two {           // this is derived class
    public void print_India() {
        System.out.println("INDIA.");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Three three = new Three();
        three.print_we();
        three.print_love();
        three.print_India();
    }
}
