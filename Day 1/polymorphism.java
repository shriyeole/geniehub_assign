public class polymorphism{

    void add(int a,int b){};
    void add(double a,double b){};
    void multi(int a,int b){};

    public static void main(String[] args) {
        calc c = new calc();
        c.add(4, 5);
        c.add(4.5, 5.5);
        c.multi(4, 5);
    }
}
class calc extends polymorphism{

    @Override
    void add(int a,int b){
        System.out.println(a+b);
    }

    @Override
    void add(double a,double b){
        System.out.println(a+b);
    }

    @Override
    void multi(int a,int b){
        System.out.println(a*b);
    }
    
    
}