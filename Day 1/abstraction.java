public class abstraction {
    public static void main(String[] args) {
        calculation c = new calculation();
        c.add(5, 10);
        c.div(10, 5);
        c.multi(5, 5);
    }
}

interface cal{
    void add(int a, int b);

    void multi(int a, int b);
}

interface cal2{
    void add(int a, int b);

    void div(int a, int b);
}

class calculation implements cal,cal2{
    @Override
    public void add(int a, int b){
        System.out.println(a+b);
    }

    @Override
    public void div(int a, int b) {
        System.out.println(a/b);
    }

    @Override
    public void multi(int a, int b) {
        System.out.println(a*b);
    }
}
