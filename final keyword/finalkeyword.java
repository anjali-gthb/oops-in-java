public class finalkeyword {
    public static void main(String[] args) {
        // final int SECRECT_CODE=4414;
        // final guarentees immutability only when the reference or instance varible is of type primitives
        

       final Secret obj =new Secret("truth file");
    //    this is allowed 
        obj.name="falsy file";

        // but 
        // when a non-primitive is final we cannot reassign the refrence object variable.
        
        // obj=new Secret("unknown file");
        


    
    }
}
class Secret{
    String name;


    Secret(String name){
        System.out.println("secret file name is:"+name);
    }
}
