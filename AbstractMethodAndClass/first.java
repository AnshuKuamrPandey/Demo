 public class first{

}
abstract  class perent{
    abstract void m1();
    abstract void m2();

}
abstract class child extends perent{
  abstract   void m1();
}
class subchild2 extends child 
    {
        void m2(){
            System.out.println("print only one abstract method in abstract class ");
        }


        


       
    }
    
    