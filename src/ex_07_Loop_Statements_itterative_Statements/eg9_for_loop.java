package ex_07_Loop_Statements_itterative_Statements;

public class eg9_for_loop {
    public static void main(String[] args) {
     //eg1 print 1-10 numbers
        /*   for(int i=1;i<=20;i++)
        {
            System.out.println(i);
        }*/
// eg2 print even number
       /* for( int i=2; i<=10;i+=2)
        {
            System.out.println(i);
        }*/

        // eg3 even and odd infront of number
        /*for(int i=1; i<=10;i++)
        {
            if (i%2==0)
            {
                System.out.println(i + "Even");
            }
            else
            {
                System.out.println(i + "Odd");
            }
        }*/
        // eg4 deccending order
        for (int i=10; i>=1; i--)
        {
            System.out.println(i);
        }
    }
}
