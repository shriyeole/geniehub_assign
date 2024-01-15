public class exception {

    void divi(int a, int b){
        try{
            int div = a / b;
            System.out.println(div);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Always runs");
        }
    }
    public static void main(String[] args) {
        exception exp = new exception();
        exp.divi(10, 0);
        exp.divi(10, 5);
    }
}

