public class constructorchaining {
    public static void main(String[] args) {
        add a = new add();
    }
}

class add{
    add(){
        this(5);
        System.out.println("Default Constructor");
    }

    add(int x){
        this(10, 5);
        System.out.println(x);
    }

    add(int x, int y){
        System.out.println(x+y);
    }
}