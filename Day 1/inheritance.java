class mercedes{
    String name;
    mercedes(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Hello from mercedes class");
    }
}

class sclass extends mercedes{
    int amt;
    sclass(int amt, String name){
        super(name);
        this.amt = amt;
    }
}


public class inheritance{
    public static void main(String[] args) {
        sclass sc = new sclass(5000, "shri");
        sc.display();
        System.out.println(sc.name+" "+sc.amt);
    }
}