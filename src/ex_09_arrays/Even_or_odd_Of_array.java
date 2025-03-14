package ex_09_arrays;

public class Even_or_odd_Of_array
{
    public static void main(String[] args)
    {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("even number");
        for (int num : a)
        {
            if(num%2==0)
            {
                System.out.println(num + " ");
            }
        }

            System.out.println();
            System.out.println("odd number");
            for (int num : a)
            {
                if(num % 2!=0)
                {
                    System.out.println(num+" ");
                }
            }

        }




    }

