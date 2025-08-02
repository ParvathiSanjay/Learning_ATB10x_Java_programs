package OOPS_Class_objects;

public class AddereMainOverloading {
    public static void main(String[] args) {
        AdderOverloading addObj=new AdderOverloading();
        addObj.sum(); // No parameters & method name is same
        addObj.sum(100,200);  // number of parameters is different
        addObj.sum(15,20.6);  // parameters is different
        addObj.sum(10.5,20);  //order of parameters is different
        addObj.sum(10,20,30);//number of parameters are different
       // addObj.sum(10,20,30,40); Gives error=== Matching DEFENETION is not there in our adder class
    }
}
