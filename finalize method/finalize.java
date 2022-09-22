public class finalize{
    public static void main(String[] args) {
        // sometimes an object will need to perform some actions when it is destroyed(or the garbage collection hits)
        //  for that we have finalize method inside which we can define some specific actions
        // in java garbage collections hits automatically.
        
        Garbage obj =new Garbage("hello");
        for(int i=0 ;i<=100000000; i++){
            obj=new Garbage("goodmorning");
        }


    }
}
class Garbage{
    String greet;
    Garbage(String greet){
        this.greet=greet;

    }
    @Override
    protected void finalize() throws Throwable {
       System.out.println("garbage collection hits");
    }


}
