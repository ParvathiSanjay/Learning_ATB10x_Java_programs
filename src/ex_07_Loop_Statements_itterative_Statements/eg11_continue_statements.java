package ex_07_Loop_Statements_itterative_Statements;

public class eg11_continue_statements {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            if(i==5 || i==3 || i==9)
            {
                continue;

            }
            System.out.println(i);
        }
    }
}
