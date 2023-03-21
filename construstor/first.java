public class  first{
    public static void main(String[] args) {
        demo d = new demo("Anshu " , 34);
       // d.m();


        
    }
    String  m2(int c,String name){
        return name;

    }
    int m2(int d){
        return d;
    }
}
class demo {
    String s;
    int b;
    demo(String s, int b){
        this.s = s;
        this.b = b;
        System.out.println(s+b);
    }
    class child extends  demo {
        int v ;
        child(String s,int b,int v){
            super(s,b);
            this.v = v;
        }



    }
   

    
        
}
    