import java.util.ArrayList;

public class BankAccount {
    //access modifiers
    //Class Attributes
    private double checking;
    private double saving;
    //static member
    private static int noOfAccounts;
    public static double totalMoney;
    //constructors
    public BankAccount(){
        noOfAccounts++;
        this.checking=0;
        this.saving=0;
    }

    //getters and setters
    public void setChecking(double checking) {
        this.checking = checking;
    }
    public double getChecking() {
        return checking;
    }
    public double getSaving() {
        return saving;
    }
    public void setSaving(double saving) {
        this.saving = saving;
    }
    //static method
    public static int getNoOfAccounts() {
        return noOfAccounts;
    }
    //class methods
    public void depositChk(double amount) {
        this.checking+=amount;
        this.totalMoney+=amount;

    }
    public void depositSvg(double amount) {
        this.saving+=amount;
        this.totalMoney+=amount;
    }
    public void WithdrawChk(double amount) {
        if(checking - amount <= -1){
            System.out.println("Insufficnet Funds");
        }
        else {
            this.checking-=amount;
            this.totalMoney-=amount;
        }
    }
    public void WithdrawSvg(double amount) {
        if(saving - amount <= -1){
            System.out.println("Insufficnet Funds");
        }
        else {
            this.saving-=amount;
            this.totalMoney-=amount;
        }
    }
    //method overloading






}