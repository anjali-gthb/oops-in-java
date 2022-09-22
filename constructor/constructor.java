public class constructor {
    public static void main(String[] args) {
        // student obj =new student();
        // here new student() is a construct calling student()
        // here the student() is a default constructor
        // return type is the refrence of the class 


        // 1. parameterized less constructor --> default constructor
        //  student obj =new student();

        //  2. parameterized constructor
        student obj =new student();
        System.out.println( "rollnu:"+obj.rollnu+" name:"+obj.name+" marks:"+obj.marks );

    }
}
class student{
    int rollnu;
    String name;
    float marks;

    // student(){
    //     System.out.println("parameterized less constructor being called");
    // }

     // call one constructor from another constructor.
     student(){
        this(44,"anita",33.3f);
        // internally new student(44,"anita",33.3f);
     }

    student(int rollnu,String name,float marks){
        // this keyword is used to refer the current object
        // like obj.rollnu=rollnu;
        this.rollnu=rollnu;
        this.name=name;
        this.marks=marks;
       
    
   
   
    
    }



}
