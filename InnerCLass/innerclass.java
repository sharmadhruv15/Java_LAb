public class innerclass{
    int a = 10;
    class Inner{
        void m2(){
            System.out.println("a");
        }
            
        public static void main(String ... args){
             new innerclass(). new Inner().m2();
        }
            
    }
}
//WE cannot delare any ststic data member in inner class till version 16 after version 16 is allowed 




