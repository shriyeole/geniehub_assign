interface Outer{
    void show();
    interface Inner{
        void display();
    }
}

class testing implements Outer.Inner{
    public void display(){
        System.out.println("inner interface method");
    }

    public void show(){
        System.out.println("outer interface method");
    }
}

public class nestedinterface {
    public static void main(String[] args) {
        testing t = new testing();
        t.display();
        t.show();
    }
}