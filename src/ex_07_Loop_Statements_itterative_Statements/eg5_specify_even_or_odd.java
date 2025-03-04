package ex_07_Loop_Statements_itterative_Statements;

public class eg5_specify_even_or_odd {
    public static void main(String[] args) {
        int i=1;
        while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println(i + "Even");
            }
            else
            {
                System.out.println(i + "Odd");
            }
            i++;

        }
    }
}
