package ex_09_arrays;

import java.util.Scanner;

public class largest_number_in_array {
    public static void main(String[] args) {
      //  int num[]= new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int numbers[]= new int[n];
        System.out.println("Enter " + n + " Numbers ");
        for(int i=0;i<n;i++) {
            numbers[i] = sc.nextInt();
        }
        int largest = numbers[0];
        for (int i=1;i<n;i++)
        {
            if (numbers[i]>largest)
            {
                largest= numbers[i];
            }
        }
        System.out.println("the largest number in an array is:" + largest);
        sc.close();
    }
}
