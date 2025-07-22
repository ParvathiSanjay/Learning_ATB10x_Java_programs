package ex_09_arrays;

public class sum_of_array_elements {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum= 0;
        for(int i=0;i<=a.length-1;i++){
            //System.out.println(a[i]);
            sum=sum+a[i];

        }
        System.out.println(" Sum of array ="+sum);
    }

}
