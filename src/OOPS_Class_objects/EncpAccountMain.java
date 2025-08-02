package OOPS_Class_objects;

public class EncpAccountMain {
    public static void main(String[] args) {
        EncpAccount acc=new EncpAccount();
        acc.setaccno(101);
        acc.setName("john");
        acc.setBalance(15000.45);
        System.out.println(acc.getaccno());
        System.out.println(acc.getName());
        System.out.println(acc.getBalance());
    }
}
