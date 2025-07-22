package ex_09_arrays;

public class Two_or_multi_dimentional_array {
    /*
1. Declare an array
2. add value into array
3. Find Length of an array
4. read single value from an array
5. read multiple value from an array

     */
    public static void main(String[] args) {
        //Declare an array
        //Approach 1
        //int [][]a = new int[3][2];
        //int []a[] = new int[3][2];
      /*  int a[][] = new int[3][2];


        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;

       */
        //Approach 2
        int a[][]={   {100,200},
                      {300,400},
                      {500,600}
                };
        //3. Find Length of an array
        System.out.println("length of rows: " + a.length);
        System.out.println("length of column: "+ a[0].length);
        // read single value from an array
        //System.out.println(a[2][1]);

        //Normal for loop
       /*  for(int r=0;r<=2;r++)//0 1 2 3   for( int r=0; r<=a.length-1;r++)
         {
             for(int c=0;c<=1;c++)//0 1 2 for( int c=0; c<=a[r].length-1;c++
             {
                 System.out.print(a[r][c] + " ");// 100 200 300 400 500 600
             }
             System.out.println();

        */

        /* for (int arr[] :a )
        {
            for ( int x :arr )
            {
                System.out.print(x + " ");
            }
            System.out.println( );
         }*/
        /* for(int r=0; r<a.length;r++)
        {
            for(int c=0; c<a[r].length;c++)
            {
                System.out.print(a[r][c] +" ");
            }
            System.out.println( );
        }*/
        for(int r[]: a)
        {
            for (int x:r)
            {
                System.out.print(x + " ");
            }
            System.out.println( );
        }




    }
}
