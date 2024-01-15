public class statickey {
    public static void main(String[] args) {
        company c1 = new company(0, "hhh");
        System.out.println(c1.id+c1.dept+company.name);
    }
}

class company{
    int id;
    String dept;
    static String name = "TCS";

    public company(int id, String dept){
        this.id = id;
        this.dept = dept;
    }
}

