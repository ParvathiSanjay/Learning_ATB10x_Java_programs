package ex_09_arrays;
/*
1. Declare an array
2. add value into array
3. Find Length of an array
4. read single value from an array
5. read multiple value from an array

 */
public class single_dimentional_array {
    public static void main(String[] args) {
        //Declare an array


        // Approach 1
        /*
        int a[] =new int[5];

        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
*/

        // Approach 2

        int a[]={100,200,300,400,500};
        //int a[]={};
        // Find Length of an array
        System.out.println(" length of an array: "+ a.length);
        // Read single value from an array
       // System.out.println(a[4]);// here 4 is index


        //Reading all the value from an array

        //Normal for loop
       /* for (int i=0; i<=a.length-1;i++)  //i<=4    i<5   i<=a.length-1    i<a.length
        {
            System.out.println(a[i]);
        }*/

        //Enhanced for loop/ for..each loop
        for (int x:a)
        {
            System.out.println(x);
        }

    }
}
