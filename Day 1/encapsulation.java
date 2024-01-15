class car {
    private String name;
    private int price;
    private int year;

    public car(String name, int price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getname() {
        return name;
    }

    public int getprice() {
        return price;
    }

    public int getyear() {
        return year;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        car c1 = new car("bmw", 5000, 2022);
        System.out.println(c1.getname() + c1.getprice() + c1.getyear());
    }
}
