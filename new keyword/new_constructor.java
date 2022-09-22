public class new_constructor{
    public static void main(String[] args) {
        car audi = new car();  
        car maruti = new car();
        car farrari = new car(); 
        // here new is the keyword which is used to create object or allocate the memory dynamically for the object  in heap during run time and return a refrence to it (refrence is more or less the adress of the memory allocated to the object stores in the variable)
         
        data obj;       // declaration reference to object
        obj=new data();   // allocates obj object
        obj.num=4;

        data obj1=obj;
        obj1.num=6;
        
        // here no new memory will allocate when u assign one object to another it simply copies the refrence (obj) both refrence variable obj,obj1 will point to the same object new data().

        System.out.println(obj.num);


    }
}
class car{
    String engine;
    int price;
    int seats;
}
class data{
int num;
}