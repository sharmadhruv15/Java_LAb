class Test{
    int a = 10;
    class Inner{
        void m2(){
            System.out.println("a");
        }
    }
}

public class innerclass {
    public static void main(String ... args){
        new Test(). new Inner().m2();
    }
}
