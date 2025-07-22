package ex_09_arrays;

public class linear_Search_array
{
    public static void main(String[] args) {


        int a[] = {20, 30, 40, 50, 60};
        int search_element = 40;
        boolean status=false;
        /*for (int i = 0; i < a.length; i++)
        {
            if(a[i]==search_element)
            {
                System.out.println("element found ");
                status=true;
                break;
            }
        }*/
        for( int x : a)
        {
            if( x==search_element)
            {
                System.out.println("element found ");
                status=true;
                break;
            }
        }
        if (status==false)
        {
            System.out.println("Element not found");
        }
    }
}
