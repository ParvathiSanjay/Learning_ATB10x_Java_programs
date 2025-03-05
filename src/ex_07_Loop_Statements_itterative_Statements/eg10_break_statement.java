package ex_07_Loop_Statements_itterative_Statements;

public class eg10_break_statement {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
