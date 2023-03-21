class test {
    public void m1(){
        System.out.println("m() method is this ");
    }
}

public class Second extends test  {
    public static void main(String[] args) {
        test t=  new test();
      t.  m1(); 

    }

    
}
