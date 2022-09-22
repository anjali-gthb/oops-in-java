public class introduction {
    public static void main(String[] args) {

        // creating object using car class(template)
        car audi = new car();

        // By default the value of int is 0 , for string it is null and for floats it is 0.0
        
        System.out.println(audi.engine);
        System.out.println(audi.seats);

        // now setting the values of the instance variables(under a class but outside a method)
        audi.engine="petrol";
        audi.price=200000;
        audi.seats=5;

        car maruti = new car();
        maruti.engine="diseal";
        maruti.price=500000;
        maruti.seats=4;

        car farrari = new car(); 
        farrari.engine="electrical";
        farrari.price=800000;
        farrari.seats=6;


        System.out.println(audi.engine);
        System.out.println(audi.price);
        System.out.println(maruti.price);
        System.out.println(farrari.seats);
    }
}

//  creating class car.
class car{
    String engine;
    int price;
    int seats;
}