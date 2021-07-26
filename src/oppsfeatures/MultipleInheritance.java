package oppsfeatures;

/*
Multiple Inheritance is not possible in java we can achieve it by using Interface
 */

interface X {
    public void print_Proud();
}

interface Y {
    public void print_Tobe();
}

interface Z extends X, Y {
    public void print_Indian();
}

class Child implements Z {

    @Override
    public void print_Proud() {
        System.out.println("Proud");
    }

    @Override
    public void print_Tobe() {
        System.out.println("To be");
    }

    @Override
    public void print_Indian() {
        System.out.println("an Indian");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.print_Proud();
        child.print_Tobe();
        child.print_Indian();
    }
}
