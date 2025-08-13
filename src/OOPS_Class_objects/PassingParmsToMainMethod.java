package OOPS_Class_objects;

public class PassingParmsToMainMethod {
    public static void main(String[] args) {
        System.out.println(args.length);

        for(String value:args)
        {
            System.out.println(value);
        }
       // System.out.println(" Testing.........");
    }
}
