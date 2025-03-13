package ex_09_arrays;

public class Sum_of_elementsin_an_array {
    public static void main(String[] args) {


        int a[] = {1, 2, 3, 4};


        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(" Elements / values of an array: " + a[i]);
        }
        int sum=0;
        for (int i=0;i<=a.length-1;i++) {
            sum += a[i];
        }
        System.out.println("sum of array= " + sum);
    }
}
