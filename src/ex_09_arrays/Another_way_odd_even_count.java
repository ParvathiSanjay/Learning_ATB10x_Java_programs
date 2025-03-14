package ex_09_arrays;

public class Another_way_odd_even_count {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9};
                int even=0, Odd=0;
                        for(int num : number)
                        {
                            if(num %2==0)
                            {
                                even++;
                            }
                            else
                                Odd++;
                        }
        System.out.println("total even  : " + even);
        System.out.println("total odd  : " + Odd);

    }
}
