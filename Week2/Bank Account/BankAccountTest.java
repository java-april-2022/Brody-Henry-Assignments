

public class BankAccountTest {

    public static void main(String[] args) {
    BankAccount brody=new BankAccount();
    brody.depositChk(100);
    System.out.println("this is your checking" + " " + brody.getChecking());
    System.out.println("this is your savings" + " " + brody.getSaving());
    brody.WithdrawChk(1000);
    System.out.println("This is checking after withdraw" + " " + brody.getChecking());
    System.out.println(BankAccount.totalMoney);    
}

}