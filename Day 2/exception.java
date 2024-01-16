import java.io.IOException;

public class exception {
    public static void main(String args[]) {
        child1 c = new child1();
        c.display();
        child2 c2 = new child2();
        c2.display();
    }
}

// if parent doesn't have exception declared then child can declare only
// unchecked exception
class parent {
    void display() {
        System.out.println("Parent");
    }
}

class child1 extends parent {
    @Override
    void display() throws ArithmeticException {
        System.out.println("Child-1");
    }
}

// If parent declares an exception then child can declares child exception of
// that exception or can use same exception as in parent class
class parent2 {
    void display() throws RuntimeException {
        System.out.println("Parent2");
    }
}

class child2 extends parent2 {
    @Override
    void display() throws ArithmeticException,RuntimeException {
        System.out.println("Child-2");
    }
}
